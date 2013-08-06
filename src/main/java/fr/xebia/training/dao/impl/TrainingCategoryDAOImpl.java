package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.model.TrainingCategory;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TrainingCategoryDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Repository
public class TrainingCategoryDAOImpl extends GenericDAOImpl<String, TrainingCategory> implements TrainingCategoryDAO {

    public List<TrainingCategory> findAll() {
        DetachedCriteria criteria = DetachedCriteria.forClass(getType());
        // criteria.add(Restrictions.eq(VIN_FIELD, vin).ignoreCase());
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return getHibernateTemplate().findByCriteria(criteria);

    }

}
