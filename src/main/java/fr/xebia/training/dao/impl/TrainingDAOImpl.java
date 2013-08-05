package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.model.Training;
import org.springframework.stereotype.Repository;

/**
 * TrainingDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Repository
public class TrainingDAOImpl extends GenericDAOImpl<String, Training> implements TrainingDAO {
}
