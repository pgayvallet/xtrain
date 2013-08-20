package fr.xebia.training.actions.admin;

import fr.xebia.training.core.security.RestrictedActionBean;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.model.Training;
import fr.xebia.training.model.TrainingCategory;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.integration.spring.SpringBean;
import net.sourceforge.stripes.validation.ValidationErrors;
import net.sourceforge.stripes.validation.ValidationMethod;
import net.sourceforge.stripes.validation.ValidationState;

import java.util.List;

/**
 * TrainingActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/admin/trainings/{$event}")
public class TrainingActionBean extends RestrictedActionBean {

    @SpringBean
    private TrainingDAO trainingDAO;

    @SpringBean
    private TrainingCategoryDAO trainingCategoryDAO;

    private Long trainingId;
    private List<Training> trainings;
    private Training training;

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listCategories() {
        trainings = trainingDAO.findAll();
        return forwardTo("/admin/trainings/list.jsp");
    }

    @HandlesEvent("create")
    public Resolution showCreationPage() {
        return forwardTo("/admin/trainings/create_edit.jsp");
    }

    @After(on = {"edit"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeEdition() {
        if(trainingId!=null) {
            training = trainingDAO.findById(trainingId);
        }
    }

    @HandlesEvent("edit")
    public Resolution showEditionPage() {
        return forwardTo("/admin/trainings/create_edit.jsp");
    }

    @ValidationMethod(when = ValidationState.ALWAYS, on = {"edit_submit"})
    public void validateEditionForm(ValidationErrors errors) {
        /*
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
        */
    }

    @HandlesEvent("edit_submit")
    public Resolution submitEditionForm() {
        trainingDAO.saveOrUpdate(training);
        return new RedirectResolution(this.getClass(), "list");
    }

    @HandlesEvent("delete")
    public Resolution deleteTraining() {
        training = trainingDAO.findById(trainingId);
        if(training!=null) {
            trainingDAO.delete(training);
        }
        return new RedirectResolution(this.getClass(), "list");
    }

    public List<TrainingCategory> getAvailableCategories() {
        return trainingCategoryDAO.findAll();
    }

    // get / set


    public Long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }

    public List<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
