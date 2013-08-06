package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TrainingCategory -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "TS_TRAINING_CAT")
public class TrainingCategory extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
