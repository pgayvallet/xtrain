package fr.xebia.training.core;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * BaseEntity -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
