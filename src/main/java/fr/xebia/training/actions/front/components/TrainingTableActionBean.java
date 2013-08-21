package fr.xebia.training.actions.front.components;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.dto.TrainingCriteria;
import fr.xebia.training.model.Training;
import fr.xebia.training.model.enums.TrainingCategoryType;
import net.sourceforge.stripes.integration.spring.SpringBean;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * TrainingTableActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
public class TrainingTableActionBean extends BaseActionBean {

    private boolean promo;
    private TrainingCategoryType categoryType;

    @SpringBean
    private TrainingDAO trainingDAO;

    public List<Training> getTrainings() {
        TrainingCriteria criteria = new TrainingCriteria();
        BeanUtils.copyProperties(this, criteria);
        return trainingDAO.findByCriteria(criteria);
    }

    // get / set


    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public TrainingCategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(TrainingCategoryType categoryType) {
        this.categoryType = categoryType;
    }
}
