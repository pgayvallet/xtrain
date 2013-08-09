package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;

import javax.persistence.*;

/**
 * Trainer -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "XT_TRAINER")
public class Trainer extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TrainerCategory category;

    @Column(nullable = false)
    private String name;

    @Column
    @Lob
    private String bio;

    public TrainerCategory getCategory() {
        return category;
    }

    public void setCategory(TrainerCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
