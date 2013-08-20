package fr.xebia.training.actions.admin;

import com.google.common.collect.Lists;
import fr.xebia.training.core.security.RestrictedActionBean;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.DbFile;
import fr.xebia.training.model.Trainer;
import fr.xebia.training.model.enums.TrainingCategoryType;
import fr.xebia.training.utils.FileUtils;
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

    private FileBean uploadedPictureFile;

    private List<Trainer> trainers;
    private Long trainerId;
    private Trainer trainer;

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

    @After(on = {"edit"}, stages = LifecycleStage.BindingAndValidation)
    private void beforeTrainerEdition() {
        if(trainerId!=null) {
            trainer = trainerDAO.findById(trainerId);
        }
    }

    @HandlesEvent("edit")
    public Resolution editTrainer() {
        return forwardTo("/admin/trainers/create_edit_trainer.jsp");
    }

    @ValidationMethod(when = ValidationState.ALWAYS, on = {"submit_edit"})
    public void validateTrainerEditionForm(ValidationErrors errors) {
        if(StringUtils.isBlank(trainer.getName())) {
            errors.add("trainer.name", new SimpleError("Name is missing"));
        }
        // TODO : validate file size & type if exists.
    }

    @HandlesEvent("submit_edit")
    public Resolution submitTrainer() {
        if(uploadedPictureFile !=null) {
            DbFile pictureFile = FileUtils.uploadToDbFile(uploadedPictureFile);
            trainer.setPictureFile(pictureFile);
        }
        trainerDAO.saveOrUpdate(trainer);
        return new RedirectResolution(this.getClass(), "list");
    }

    public List<TrainingCategoryType> getAvailableCategoriesTypes() {
        return Lists.newArrayList(TrainingCategoryType.TECHNICAL, TrainingCategoryType.AGILE);
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

    public FileBean getUploadedPictureFile() {
        return uploadedPictureFile;
    }

    public void setUploadedPictureFile(FileBean uploadedPictureFile) {
        this.uploadedPictureFile = uploadedPictureFile;
    }
}
