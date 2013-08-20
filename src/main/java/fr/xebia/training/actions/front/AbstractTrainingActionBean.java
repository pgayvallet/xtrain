package fr.xebia.training.actions.front;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.model.enums.TrainingCategoryType;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;

/**
 * AbstractTrainingActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
public abstract class AbstractTrainingActionBean extends BaseActionBean {

    protected String categoryLink;
    protected String trainingLink;

    protected abstract TrainingCategoryType getType();

    @DefaultHandler
    public Resolution showPage() {
        return forwardTo("/front/training_section.jsp");
    }

    // get / set

    public String getCategoryLink() {
        return categoryLink;
    }

    public void setCategoryLink(String categoryLink) {
        this.categoryLink = categoryLink;
    }

    public String getTrainingLink() {
        return trainingLink;
    }

    public void setTrainingLink(String trainingLink) {
        this.trainingLink = trainingLink;
    }
}
