package fr.xebia.training.service.impl;

import com.google.common.collect.Maps;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.dao.TrainingDAO;
import fr.xebia.training.model.Training;
import fr.xebia.training.model.TrainingCategory;
import fr.xebia.training.model.enums.TrainingCategoryType;
import fr.xebia.training.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * TrainingServiceImpl -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@Component
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingCategoryDAO trainingCategoryDAO;
    @Autowired
    private TrainingDAO trainingDAO;

    @Override
    public Map<TrainingCategory, List<Training>> getTrainingsByCategoryMap(TrainingCategoryType categoryType) {
        List<TrainingCategory> categories = trainingCategoryDAO.findAllByType(categoryType);
        Map<TrainingCategory, List<Training>> orderedMap = Maps.newLinkedHashMap();
        for(TrainingCategory category : categories) {
            List<Training> trainings = trainingDAO.findByCategory(category.getId());
            orderedMap.put(category, trainings);
        }
        return orderedMap;
    }

}
