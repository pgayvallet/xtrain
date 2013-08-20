package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.model.Training;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TrainingDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Repository
public class TrainingDAOImpl extends GenericDAOImpl<Long, Training> implements TrainingDAO {

    @Override
    @SuppressWarnings("unchecked")
    public Training getByPermalink(String permalink) {
        DetachedCriteria criteria = getDetachedCriteria();
        criteria.add(Restrictions.eq("permalink", permalink));
        List<Training> results = getHibernateTemplate().findByCriteria(criteria);
        return results.isEmpty() ? null : results.get(0);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Training> findByCategory(long categoryId) {
        DetachedCriteria criteria = getDetachedCriteria();
        criteria.add(Restrictions.eq("category.id", categoryId));
        return getHibernateTemplate().findByCriteria(criteria);
    }

}
