package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;
import fr.xebia.training.model.enums.TrainingCategoryType;

import javax.persistence.*;

/**
 * TrainingCategory -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "TS_TRAINING_CAT")
public class TrainingCategory extends BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TrainingCategoryType type;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String permalink;


    public TrainingCategoryType getType() {
        return type;
    }

    public void setType(TrainingCategoryType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }
}
