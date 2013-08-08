package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * Training -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "XT_TRAINING")
public class Training extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String permalink;

    @Column
    @Lob
    private String presentation;

    @Column
    @Lob
    private String program;


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
}
