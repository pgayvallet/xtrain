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
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
