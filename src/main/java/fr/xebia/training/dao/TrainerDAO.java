package fr.xebia.training.dao;

import fr.xebia.training.core.GenericDAO;
import fr.xebia.training.model.Trainer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TrainerDAO -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public interface TrainerDAO extends GenericDAO<Long, Trainer> {

    Trainer findByPermalink(String permalink);

    List<Trainer> findByCategory(long categoryId);

    List<Trainer> getAgileTrainersOrderedByPosition();

    List<Trainer> getTechnicalTrainersOrderedByPosition();

}
