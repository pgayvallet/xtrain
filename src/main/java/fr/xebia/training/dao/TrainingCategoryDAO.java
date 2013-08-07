package fr.xebia.training.dao;

import fr.xebia.training.core.GenericDAO;
import fr.xebia.training.model.TrainingCategory;
import org.springframework.stereotype.Component;

/**
 * TrainingCategoryDAO -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public interface TrainingCategoryDAO extends GenericDAO<Long, TrainingCategory> {
}
