package fr.xebia.training.actions.admin;

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
@UrlBinding("/admin/trainers/{$event}")
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
        return forwardTo("/admin/trainers/list.jsp");
    }

    @HandlesEvent("create")
    public Resolution createTrainer() {
        return forwardTo("/admin/trainers/create_edit_trainer.jsp");
    }

    @After(on = {"edit_trainer"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeTrainerEdition() {
        if(trainerId!=null) {
            trainer = trainerDAO.findById(trainerId);
        }
    }

    @HandlesEvent("edit_trainer")
    public Resolution editTrainer() {
        return forwardTo("/admin/trainers/create_edit_trainer.jsp");
    }

    @ValidationMethod(when = ValidationState.ALWAYS, on = {"do_submit_trainer"})
    public void validateTrainerEditionForm(ValidationErrors errors) {
        if(StringUtils.isBlank(trainer.getName())) {
            errors.add("trainer.name", new SimpleError("Name is missing"));
        }
        if(!ValidationUtils.isValidPermalink(trainer.getPermalink())) {
            errors.add("trainer.permalink", new SimpleError("Permalink is missing or invalid"));
        } else {
            Trainer permalinkTrainer = trainerDAO.findByPermalink(trainer.getPermalink());
            if(permalinkTrainer!=null && !permalinkTrainer.getId().equals(trainer.getId())) {
                errors.add("trainer.permalink", new SimpleError("Permalink already used by another trainer"));
            }
        }
    }

    @HandlesEvent("do_submit_trainer")
    public Resolution submitTrainer() {
        trainerDAO.saveOrUpdate(trainer);
        return new RedirectResolution(this.getClass(), "list");
    }

    public List<TrainerCategory> getAvailableCategories() {
        return trainerCategoryDAO.findAll();
    }

    // category

    @HandlesEvent("list_category")
    public Resolution listCategories() {
        categories = trainerCategoryDAO.findAll();
        return forwardTo("/admin/trainers/list_category.jsp");
    }

    @HandlesEvent("create_category")
    public Resolution createCategory() {
        return forwardTo("/admin/trainers/create_edit_category.jsp");
    }

    @After(on = {"edit_category"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeCategoryEdition() {
        if(categoryId!=null) {
            category = trainerCategoryDAO.findById(categoryId);
        }
    }

    @HandlesEvent("edit_category")
    public Resolution editCategory() {
        return forwardTo("/admin/trainers/create_edit_category.jsp");
    }

    @ValidationMethod(when = ValidationState.ALWAYS, on = {"do_submit_category"})
    public void validateCategoryEditionForm(ValidationErrors errors) {
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
