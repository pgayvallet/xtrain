package fr.xebia.training.actions.front;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainerCategoryDAO;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.Trainer;
import fr.xebia.training.model.TrainerCategory;
import net.sourceforge.stripes.action.Before;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.controller.LifecycleStage;
import net.sourceforge.stripes.integration.spring.SpringBean;

import static org.apache.commons.lang3.StringUtils.isNotBlank;


/**
 * TrainerActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@UrlBinding("/nos-formateurs/{categoryName}/{trainerName}")
public class TrainerActionBean extends BaseActionBean {

    @SpringBean
    private TrainerDAO trainerDAO;

    @SpringBean
    private TrainerCategoryDAO trainerCategoryDAO;

    private String categoryName;
    private String trainerName;

    private TrainerCategory category;
    private Trainer trainer;

    @Before(stages = {LifecycleStage.EventHandling})
    public void hydrateModels() {
        if(isNotBlank(categoryName)) {
            category = trainerCategoryDAO.findByPermalink(categoryName);
        }
        if(isNotBlank(trainerName)) {
            trainer = trainerDAO.findByPermalink(trainerName);
        }
    }

    @DefaultHandler
    public Resolution handleRequest() {
        boolean hasTrainer = isNotBlank(trainerName);
        boolean hasCategory = isNotBlank(categoryName);
        if(hasCategory) {
            if(hasTrainer) {
                return showTrainerPage();
            } else {
                return showCategoryPage();
            }
        } else {
            return showListingPage();
        }
    }

    private Resolution showListingPage() {
        return null;
    }

    private Resolution showCategoryPage() {
        return forwardTo("/front/category.jsp");
    }

    private Resolution showTrainerPage() {
        return forwardTo("/front/trainer.jsp");
    }

    // get / set


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public TrainerCategory getCategory() {
        return category;
    }

    public Trainer getTrainer() {
        return trainer;
    }
}
