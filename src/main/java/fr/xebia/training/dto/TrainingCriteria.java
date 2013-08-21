package fr.xebia.training.dto;

import fr.xebia.training.model.enums.TrainingCategoryType;

/**
 * TrainingCriteria -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
public class TrainingCriteria {

    private boolean promo;
    private TrainingCategoryType categoryType;

    public TrainingCriteria() {
    }

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
