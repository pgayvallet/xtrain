package fr.xebia.training.actions.front;

import fr.xebia.training.model.enums.TrainingCategoryType;
import net.sourceforge.stripes.action.UrlBinding;

/**
 * TechnicalTrainingActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@UrlBinding("/formations-technniques/{categoryLink}/{trainingLink}")
public class TechnicalTrainingActionBean extends AbstractTrainingActionBean {

    @Override
    protected TrainingCategoryType getType() {
        return TrainingCategoryType.TECHNICAL;
    }

}
