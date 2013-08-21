package fr.xebia.training.actions.admin;

import fr.xebia.training.core.security.RestrictedActionBean;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.model.TrainingCategory;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.integration.spring.SpringBean;
import net.sourceforge.stripes.validation.SimpleError;
import net.sourceforge.stripes.validation.ValidationErrors;
import net.sourceforge.stripes.validation.ValidationMethod;
import net.sourceforge.stripes.validation.ValidationState;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * TrainingCategoryActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/admin/categories/{$event}")
public class TrainingCategoryActionBean extends RestrictedActionBean {

    @SpringBean
    private TrainingCategoryDAO trainingCategoryDAO;

    private Long categoryId;
    private TrainingCategory category;
    private List<TrainingCategory> categories;

    private FileBean uploadedPictureFile;

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listCategories() {
        categories = trainingCategoryDAO.findAll();
        return forwardTo("/admin/categories/list.jsp");
    }

    @HandlesEvent("create")
    public Resolution showCreationPage() {
        return forwardTo("/admin/categories/create_edit.jsp");
    }

    @After(on = {"edit"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeEdition() {
        if(categoryId!=null) {
            category = trainingCategoryDAO.findById(categoryId);
        }
    }

    @HandlesEvent("edit")
    public Resolution showEditionPage() {
        return forwardTo("/admin/categories/create_edit.jsp");
    }

    @ValidationMethod(when = ValidationState.ALWAYS, on = {"edit_submit"})
    public void validateEditionForm(ValidationErrors errors) {
        if(StringUtils.isBlank(category.getTitle())) {
            errors.add("category.title", new SimpleError("Title is mandatory"));
        }
        if(StringUtils.isBlank(category.getPermalink())) {
            errors.add("category.permalink", new SimpleError("Permalink is mandatory"));
        } else {
            TrainingCategory permalinkCategory = trainingCategoryDAO.getByPermalink(category.getPermalink());
            if(permalinkCategory!=null && !permalinkCategory.getId().equals(category.getId())) {
                errors.add("category.permalink", new SimpleError("Permalink already used by another category"));
            }
        }
    }

    @HandlesEvent("edit_submit")
    public Resolution submitEditionForm() {
        trainingCategoryDAO.saveOrUpdate(category);
        // FlashScope.getCurrent(getRequest(), true);
        return new RedirectResolution(this.getClass(), "list"); //.flash(this);
    }

    @HandlesEvent("delete")
    public Resolution deleteCategory() {
        TrainingCategory category = trainingCategoryDAO.findById(categoryId);
        if(category!=null) {
            trainingCategoryDAO.delete(category);
        }
        return new RedirectResolution(this.getClass(), "list");
    }

    // get / set

    public List<TrainingCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<TrainingCategory> categories) {
        this.categories = categories;
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

    public FileBean getUploadedPictureFile() {
        return uploadedPictureFile;
    }

    public void setUploadedPictureFile(FileBean uploadedPictureFile) {
        this.uploadedPictureFile = uploadedPictureFile;
    }

}
