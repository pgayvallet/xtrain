package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Training -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "XT_TRAINING")
public class Training extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TrainingCategory category;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Trainer trainer;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String permalink;

    @Column
    @Lob
    private String presentation;

    @Column
    private String presentationSiteUrl;

    @Column
    @Lob
    private String program;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private DbFile programFile;

    @Column(nullable = false)
    @Type(type = "yes_no")
    private boolean promo;

    @Column(length = 30)
    private String priceInter;

    @Column(length = 30)
    private String priceIntra;

    @Column(length = 30)
    private String pricePromo;

    @Column(nullable = true)
    private Long linkedInProductId;

    @Column(length = 1000)
    private String metaDescription;

    @Column(length = 1000)
    private String metaKeywords;

    public TrainingCategory getCategory() {
        return category;
    }

    public void setCategory(TrainingCategory category) {
        this.category = category;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
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

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getPresentationSiteUrl() {
        return presentationSiteUrl;
    }

    public void setPresentationSiteUrl(String presentationSiteUrl) {
        this.presentationSiteUrl = presentationSiteUrl;
    }

    public DbFile getProgramFile() {
        return programFile;
    }

    public void setProgramFile(DbFile programFile) {
        this.programFile = programFile;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public String getPriceInter() {
        return priceInter;
    }

    public void setPriceInter(String priceInter) {
        this.priceInter = priceInter;
    }

    public String getPriceIntra() {
        return priceIntra;
    }

    public void setPriceIntra(String priceIntra) {
        this.priceIntra = priceIntra;
    }

    public String getPricePromo() {
        return pricePromo;
    }

    public void setPricePromo(String pricePromo) {
        this.pricePromo = pricePromo;
    }

    public Long getLinkedInProductId() {
        return linkedInProductId;
    }

    public void setLinkedInProductId(Long linkedInProductId) {
        this.linkedInProductId = linkedInProductId;
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
}
