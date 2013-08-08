package fr.xebia.training.actions.bo;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.model.Training;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.HandlesEvent;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

import java.util.List;

/**
 * TrainingActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/bo/trainings/{$event}")
public class TrainingActionBean extends BaseActionBean {

    @SpringBean
    private TrainingDAO trainingDAO;

    private Long trainingId;
    private List<Training> trainings;
    private Training training;

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listCategories() {
        trainings = trainingDAO.findAll();
        return forwardTo("/bo/trainings/list.jsp");
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
