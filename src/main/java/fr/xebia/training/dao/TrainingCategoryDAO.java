package fr.xebia.training.dao;

import fr.xebia.training.core.GenericDAO;
import fr.xebia.training.model.TrainingCategory;
import fr.xebia.training.model.enums.TrainingCategoryType;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TrainingCategoryDAO -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public interface TrainingCategoryDAO extends GenericDAO<Long, TrainingCategory> {

    TrainingCategory getByPermalink(String permalink);

    List<TrainingCategory> findAllByType(TrainingCategoryType categoryType);

}
