package fr.xebia.training.actions.front.components;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.model.Trainer;
import fr.xebia.training.model.TrainerCategory;
import fr.xebia.training.service.TrainerService;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

import java.util.List;
import java.util.Map;

/**
 * NavActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@UrlBinding("/components/nav")
public class NavActionBean extends BaseActionBean {

    @SpringBean
    private TrainerService trainerService;


    public Map<TrainerCategory, List<Trainer>> getTrainerMap() {
        return trainerService.getOrderedCategoryToTrainersMap();
    }

}
