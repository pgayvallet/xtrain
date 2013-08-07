package fr.xebia.training.actions.bo;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.model.TrainingCategory;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.integration.spring.SpringBean;
import net.sourceforge.stripes.validation.ValidationErrors;
import net.sourceforge.stripes.validation.ValidationMethod;
import net.sourceforge.stripes.validation.ValidationState;

import java.util.List;

/**
 * TrainingCategoryActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/bo/categories/{$event}")
public class TrainingCategoryActionBean extends BaseActionBean {

    @SpringBean
    private TrainingCategoryDAO trainingCategoryDAO;

    private Long categoryId;
    private TrainingCategory category;
    private List<TrainingCategory> categories;

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listCategories() {
        category = trainingCategoryDAO.findById(1L);
        categories = trainingCategoryDAO.findAll();
        return forwardTo("/bo/categories/list.jsp");
    }

    @HandlesEvent("create")
    public Resolution showCreationPage() {
        return forwardTo("/bo/categories/create_edit.jsp");
    }

    @After(on = {"edit"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeEdition() {
        if(categoryId!=null) {
            category = trainingCategoryDAO.findById(categoryId);
        }
    }

    @HandlesEvent("edit")
    public Resolution showEditionPage() {
        return forwardTo("/bo/categories/create_edit.jsp");
    }

    @ValidationMethod(when = ValidationState.ALWAYS, on = {"edit_submit"})
    public void validateEditionForm(ValidationErrors errors) {


    }

    @HandlesEvent("edit_submit")
    public Resolution submitEditionForm() {
        trainingCategoryDAO.saveOrUpdate(category);
        // FlashScope.getCurrent(getRequest(), true);
        return new RedirectResolution(this.getClass(), "list").flash(this);
    }


    // get / set

    public List<TrainingCategory> getCategories() {
        return categories;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public TrainingCategory getCategory() {
        return category;
    }

    public void setCategory(TrainingCategory category) {
        this.category = category;
    }
}
