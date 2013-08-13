package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TrainerCategory -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "TS_TRAINER_CAT")
public class TrainerCategory extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String permalink;

    @Column
    private Integer position;

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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

}
