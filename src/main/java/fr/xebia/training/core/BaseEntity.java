package fr.xebia.training.core;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * BaseEntity -
 *
 * @author spark <gayvallet@fullsix.com>
 */
public class BaseEntity implements Serializable {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
