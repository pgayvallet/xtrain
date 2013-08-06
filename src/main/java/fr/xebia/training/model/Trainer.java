package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * Trainer -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Entity
@Table(name = "XT_TRAINER")
public class Trainer extends BaseEntity {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column
    @Lob
    private String bio;

}
