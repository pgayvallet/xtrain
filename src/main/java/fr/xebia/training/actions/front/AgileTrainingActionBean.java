package fr.xebia.training.actions.front;

import fr.xebia.training.model.enums.TrainingCategoryType;
import net.sourceforge.stripes.action.UrlBinding;

/**
 * AgileTrainingActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@UrlBinding("/formations-agiles/{categoryLink}/{trainingLink}")
public class AgileTrainingActionBean extends AbstractTrainingActionBean {

    @Override
    protected TrainingCategoryType getType() {
        return TrainingCategoryType.AGILE;
    }
}
