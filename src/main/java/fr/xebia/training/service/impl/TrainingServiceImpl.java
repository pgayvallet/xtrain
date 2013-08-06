package fr.xebia.training.service.impl;

import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TrainingServiceImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingDAO trainingDAO;

    @Autowired
    private TrainingCategoryDAO trainingCategoryDAO;

    @Override
    public String getTest() {
        return "TrainingServiceImpl";
    }
}
