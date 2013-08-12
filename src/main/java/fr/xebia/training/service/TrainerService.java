package fr.xebia.training.service;

import fr.xebia.training.model.Trainer;
import fr.xebia.training.model.TrainerCategory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * TrainerService -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@Component
public interface TrainerService {

    Map<TrainerCategory, List<Trainer>> getOrderedCategoryToTrainersMap();

}
