package fr.xebia.training.core;

import java.io.Serializable;

/**
 * GenericDAO -
 *
 * @author spark <gayvallet@fullsix.com>
 */
public interface GenericDAO<K  extends Serializable, T> {

    T findById(K id);
    void delete(T obj);
    void saveOrUpdate(T obj);

}
