package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;
import fr.xebia.training.model.enums.TrainingCategoryType;

import javax.persistence.*;

/**
 * Trainer -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "XT_TRAINER")
public class Trainer extends BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TrainingCategoryType category;

    @Column(nullable = false)
    private String name;

    @Column
    @Lob
    private String bio;

    @Column
    private int position;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private DbFile pictureFile;


    // get / set

    public TrainingCategoryType getCategory() {
        return category;
    }

    public void setCategory(TrainingCategoryType category) {
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public DbFile getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(DbFile pictureFile) {
        this.pictureFile = pictureFile;
    }

}
