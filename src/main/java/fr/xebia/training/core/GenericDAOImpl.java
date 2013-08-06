package fr.xebia.training.core;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * GenericDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
public abstract class GenericDAOImpl<K extends Serializable, T> implements GenericDAO<K, T> {

    private Class<T> type;

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    protected SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            throw new IllegalStateException("SessionFactory has not been set on DAO before usage");
        }
        return sessionFactory;
    }

    public Class<T> getType() {
        return type;
    }

    public GenericDAOImpl() {
        this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Transactional(readOnly = true)
    @Override
    public T findById(K id) {
        return (T) getSessionFactory().getCurrentSession().get(getType(), id);
    }

    @Transactional
    @Override
    public void delete(T obj) {
        getSessionFactory().getCurrentSession().delete(obj);
    }

    @Transactional
    @Override
    public void saveOrUpdate(T obj) {
        getSessionFactory().getCurrentSession().saveOrUpdate(obj);
    }
}
