package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;
import fr.xebia.training.model.enums.TrainingCategoryType;

import javax.persistence.*;
import java.util.Set;

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

    @Lob
    @Column
    private String description;

    @Column(length = 1000)
    private String metaDescription;

    @Column(length = 1000)
    private String metaKeywords;

    @Column
    private String blogCategory;

    @Column
    private Long vimeoChannelId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private Set<Training> trainings;

    @Column
    private String offerSiteUrl;

    @Column
    private String trainingTitle;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private DbFile pictureFile;

    // get / set

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public String getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(String blogCategory) {
        this.blogCategory = blogCategory;
    }

    public Long getVimeoChannelId() {
        return vimeoChannelId;
    }

    public void setVimeoChannelId(Long vimeoChannelId) {
        this.vimeoChannelId = vimeoChannelId;
    }

    public Set<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(Set<Training> trainings) {
        this.trainings = trainings;
    }

    public String getOfferSiteUrl() {
        return offerSiteUrl;
    }

    public void setOfferSiteUrl(String offerSiteUrl) {
        this.offerSiteUrl = offerSiteUrl;
    }

    public String getTrainingTitle() {
        return trainingTitle;
    }

    public void setTrainingTitle(String trainingTitle) {
        this.trainingTitle = trainingTitle;
    }

    public DbFile getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(DbFile pictureFile) {
        this.pictureFile = pictureFile;
    }

}
