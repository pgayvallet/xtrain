package fr.xebia.training.actions.bo;

import fr.xebia.training.core.security.RestrictedActionBean;
import fr.xebia.training.dao.TrainerCategoryDAO;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.Trainer;
import fr.xebia.training.model.TrainerCategory;
import fr.xebia.training.utils.ValidationUtils;
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
 * TrainerActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/bo/trainers/{$event}")
public class TrainerActionBean extends RestrictedActionBean {

    @SpringBean
    private TrainerDAO trainerDAO;
    @SpringBean
    private TrainerCategoryDAO trainerCategoryDAO;

    private List<Trainer> trainers;
    private Long trainerId;
    private Trainer trainer;

    private List<TrainerCategory> categories;
    private Long categoryId;
    private TrainerCategory category;

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listTrainers() {
        trainers = trainerDAO.findAll();
        return forwardTo("/bo/trainers/list.jsp");
    }

    @HandlesEvent("create_trainer")
    public Resolution createTrainer() {
        return null;
    }

    @HandlesEvent("edit_trainer")
    public Resolution editTrainer() {
        return null;
    }

    @HandlesEvent("do_submit_trainer")
    public Resolution submitTrainer() {
        return null;
    }

    // category

    @HandlesEvent("list_category")
    public Resolution listCategories() {
        categories = trainerCategoryDAO.findAll();
        return forwardTo("/bo/trainers/list_category.jsp");
    }

    @HandlesEvent("create_category")
    public Resolution createCategory() {
        return forwardTo("/bo/trainers/create_edit_category.jsp");
    }

    @After(on = {"edit_category"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeEdition() {
        if(categoryId!=null) {
            category = trainerCategoryDAO.findById(categoryId);
        }
    }

    @HandlesEvent("edit_category")
    public Resolution editCategory() {
        return forwardTo("/bo/trainers/create_edit_category.jsp");
    }

    @ValidationMethod(when = ValidationState.ALWAYS, on = {"do_submit_category"})
    public void validateEditionForm(ValidationErrors errors) {
        if(StringUtils.isBlank(category.getTitle())) {
            errors.add("category.name", new SimpleError("Name is missing"));
        }
        if(!ValidationUtils.isValidPermalink(category.getPermalink())) {
            errors.add("category.permalink", new SimpleError("Permalink is missing or invalid"));
        } else {
            TrainerCategory permalinkCategory = trainerCategoryDAO.findByPermalink(category.getPermalink());
            if(permalinkCategory!=null && !permalinkCategory.getId().equals(category.getId())) {
                errors.add("category.permalink", new SimpleError("Permalink already used by another category"));
            }
        }
    }

    @HandlesEvent("do_submit_category")
    public Resolution submitCategory() {
        trainerCategoryDAO.saveOrUpdate(category);
        return new RedirectResolution(this.getClass(), "list_category");
    }

    // get / set

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<TrainerCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<TrainerCategory> categories) {
        this.categories = categories;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public TrainerCategory getCategory() {
        return category;
    }

    public void setCategory(TrainerCategory category) {
        this.category = category;
    }
}
