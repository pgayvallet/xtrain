package fr.xebia.training.actions.bo;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.model.TrainingCategory;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.integration.spring.SpringBean;

import java.util.List;

/**
 * TrainingCategoryActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/bo/categories/{$event}")
public class TrainingCategoryActionBean extends BaseActionBean{

    @SpringBean
    private TrainingCategoryDAO trainingCategoryDAO;

    private Long categoryId;
    private TrainingCategory category;
    private List<TrainingCategory> categories;

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listCategories() {
        categories = trainingCategoryDAO.findAll();
        return forwardTo("/bo/categories/list.jsp");
    }

    @After(on = {"create"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeEdition() {
        if(categoryId!=null) {
            category = trainingCategoryDAO.findById(categoryId);
        }
    }

    @HandlesEvent("create")
    public Resolution showCreationPage() {
        return forwardTo("/bo/categories/create_edit.jsp");
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
