package fr.xebia.training.actions.front;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.model.Training;
import fr.xebia.training.model.TrainingCategory;
import fr.xebia.training.model.enums.TrainingCategoryType;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.integration.spring.SpringBean;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

/**
 * AbstractTrainingActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
public abstract class AbstractTrainingActionBean extends BaseActionBean {
    
    @SpringBean
    protected TrainingCategoryDAO trainingCategoryDAO;
    @SpringBean
    protected TrainingDAO trainingDAO;
    
    protected String categoryLink;
    protected String trainingLink;
    
    protected Training training;
    protected TrainingCategory category;

    protected abstract TrainingCategoryType getType();

    @DefaultHandler
    public Resolution dispatchRequest() {
        if(isNotBlank(categoryLink)) {
            if(isNotBlank(trainingLink)) {
                return showTrainingPage();
            } else {
                return showCategoryPage();
            }
        } else {
            return showSectionPage();
        }
    }

    private Resolution showSectionPage() {
        return forwardTo("/front/training_section.jsp");
    }

    private Resolution showCategoryPage() {
        category = trainingCategoryDAO.getByPermalink(categoryLink);
        return forwardTo("/front/training_category.jsp");
    }

    private Resolution showTrainingPage() {
        category = trainingCategoryDAO.getByPermalink(categoryLink);
        training = trainingDAO.getByPermalink(trainingLink);
        return forwardTo("/front/training.jsp");
    }

    public String getNavSection() {
        return this.getType().toString().toLowerCase();
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

    public Training getTraining() {
        return training;
    }

    public TrainingCategory getCategory() {
        return category;
    }
}
