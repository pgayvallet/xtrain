package fr.xebia.training.actions.front.components;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.model.Training;
import fr.xebia.training.model.TrainingCategory;
import fr.xebia.training.model.enums.TrainingCategoryType;
import fr.xebia.training.service.TrainingService;
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
    private TrainingService trainingService;

    public Map<TrainingCategory, List<Training>> getTechnicalMap() {
        return trainingService.getTrainingsByCategoryMap(TrainingCategoryType.TECHNICAL);
    }

    public Map<TrainingCategory, List<Training>> getAgileMap() {
        return trainingService.getTrainingsByCategoryMap(TrainingCategoryType.AGILE);
    }

}
