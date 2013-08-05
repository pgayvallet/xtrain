package fr.xebia.training.dao.impl;

import fr.xebia.training.core.GenericDAOImpl;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.model.TrainingCategory;
import org.springframework.stereotype.Repository;

/**
 * TrainingCategoryDAOImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Repository
public class TrainingCategoryDAOImpl extends GenericDAOImpl<String, TrainingCategory> implements TrainingCategoryDAO {
}
