package fr.xebia.training.actions.bo;

import fr.xebia.training.core.security.RestrictedActionBean;
import fr.xebia.training.dao.TrainerCategoryDAO;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.Trainer;
import fr.xebia.training.model.TrainerCategory;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

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

    @HandlesEvent("list_category")
    public Resolution listCategories() {
        categories = trainerCategoryDAO.findAll();
        return forwardTo("/bo/trainers/list_category.jsp");
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
