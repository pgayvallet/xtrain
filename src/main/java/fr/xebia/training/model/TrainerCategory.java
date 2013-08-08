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
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
