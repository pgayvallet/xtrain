package fr.xebia.training.dao;

import fr.xebia.training.core.GenericDAO;
import fr.xebia.training.model.Training;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TrainingDAO -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public interface TrainingDAO extends GenericDAO<Long, Training> {

    Training getByPermalink(String permalink);

    List<Training> findByCategory(long categoryId);

}
