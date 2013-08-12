package fr.xebia.training.dao;

import fr.xebia.training.core.GenericDAO;
import fr.xebia.training.model.Trainer;
import org.springframework.stereotype.Component;

/**
 * TrainerDAO -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public interface TrainerDAO extends GenericDAO<Long, Trainer> {

    Trainer findByPermalink(String permalink);

}
