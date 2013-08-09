package fr.xebia.training.dao;

import fr.xebia.training.core.GenericDAO;
import fr.xebia.training.model.TrainerCategory;
import org.springframework.stereotype.Component;

/**
 * TrainerCategoryDAO -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public interface TrainerCategoryDAO extends GenericDAO<Long, TrainerCategory> {
}
