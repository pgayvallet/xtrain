package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.model.TrainingCategory;
import fr.xebia.training.model.enums.TrainingCategoryType;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TrainingCategoryDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Repository
public class TrainingCategoryDAOImpl extends GenericDAOImpl<Long, TrainingCategory> implements TrainingCategoryDAO {

    @Override
    @SuppressWarnings({"unchecked"})
    public TrainingCategory getByPermalink(String permalink) {
        DetachedCriteria criteria = getDetachedCriteria();
        criteria.add(Restrictions.eq("permalink", permalink));
        List<TrainingCategory> results = getHibernateTemplate().findByCriteria(criteria);
        return results.isEmpty() ? null : results.get(0);
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public List<TrainingCategory> findAllByType(TrainingCategoryType categoryType) {
        DetachedCriteria criteria = getDetachedCriteria();
        criteria.add(Restrictions.eq("type", categoryType));
        return getHibernateTemplate().findByCriteria(criteria);
    }

}
