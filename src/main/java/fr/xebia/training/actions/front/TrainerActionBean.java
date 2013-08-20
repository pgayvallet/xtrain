package fr.xebia.training.actions.front;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.Trainer;
import net.sourceforge.stripes.action.Before;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.integration.spring.SpringBean;

import java.util.List;


/**
 * TrainerActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@UrlBinding("/nos-formateurs")
public class TrainerActionBean extends BaseActionBean {

    @SpringBean
    private TrainerDAO trainerDAO;

    private List<Trainer> technicalTrainers;
    private List<Trainer> agileTrainers;

    @Before(stages = {LifecycleStage.EventHandling})
    public void hydrateModels() {
        technicalTrainers = trainerDAO.getTechnicalTrainersOrderedByPosition();
        agileTrainers = trainerDAO.getAgileTrainersOrderedByPosition();
    }

    @DefaultHandler
    public Resolution showListingPage() {
        return forwardTo("/front/trainers.jsp");
    }

    // get / set

    public List<Trainer> getTechnicalTrainers() {
        return technicalTrainers;
    }

    public List<Trainer> getAgileTrainers() {
        return agileTrainers;
    }
}
