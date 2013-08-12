package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.Trainer;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TrainerDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Repository
public class TrainerDAOImpl extends GenericDAOImpl<Long, Trainer> implements TrainerDAO {

    @Override
    public Trainer findByPermalink(String permalink) {
        DetachedCriteria criteria = getDetachedCriteria();
        criteria.add(Restrictions.eq("permalink", permalink));
        List<Trainer> results = getHibernateTemplate().findByCriteria(criteria);
        return results.isEmpty() ? null : results.get(0);
    }
}
