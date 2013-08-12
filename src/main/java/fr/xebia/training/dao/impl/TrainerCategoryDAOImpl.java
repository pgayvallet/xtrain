package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.TrainerCategoryDAO;
import fr.xebia.training.model.TrainerCategory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TrainerCategoryDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Repository
public class TrainerCategoryDAOImpl extends GenericDAOImpl<Long, TrainerCategory> implements TrainerCategoryDAO {

    @Override
    public TrainerCategory findByPermalink(String permalink) {
        DetachedCriteria criteria = getDetachedCriteria();
        criteria.add(Restrictions.eq("permalink", permalink));
        List<TrainerCategory> results = getHibernateTemplate().findByCriteria(criteria);
        return results.isEmpty() ? null : results.get(0);
    }



}
