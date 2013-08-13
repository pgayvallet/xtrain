package fr.xebia.training.service.impl;

import com.google.common.collect.Maps;
import fr.xebia.training.dao.TrainerCategoryDAO;
import fr.xebia.training.dao.TrainerDAO;
import fr.xebia.training.model.Trainer;
import fr.xebia.training.model.TrainerCategory;
import fr.xebia.training.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * TrainerServiceImpl -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@Component
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerCategoryDAO trainerCategoryDAO;
    @Autowired
    private TrainerDAO trainerDAO;

    @Override
    public Map<TrainerCategory, List<Trainer>> getOrderedCategoryToTrainersMap() {
        Map<TrainerCategory, List<Trainer>> map = Maps.newLinkedHashMap();
        List<TrainerCategory> categories = trainerCategoryDAO.findAll();

        for(TrainerCategory category : categories) {
            List<Trainer> categoryTrainers = trainerDAO.findByCategory(category.getId());
            if(!categoryTrainers.isEmpty()) {
                map.put(category, categoryTrainers);
            }
        }

        return map;
    }

}
