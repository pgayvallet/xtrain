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

    @Before(stages = {LifecycleStage.EventHandling})
    public void hydrateModels() {
    }

    @DefaultHandler
    public Resolution showListingPage() {
        return forwardTo("/front/trainers.jsp");
    }

    public List<Trainer> getTrainers() {
        return trainerDAO.findAll();
    }

    // get / set


}
