package fr.xebia.training.service;

import fr.xebia.training.model.Training;
import fr.xebia.training.model.TrainingCategory;
import fr.xebia.training.model.enums.TrainingCategoryType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * TrainingService -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@Component
public interface TrainingService {

    Map<TrainingCategory, List<Training>> getTrainingsByCategoryMap(TrainingCategoryType categoryType);

}
