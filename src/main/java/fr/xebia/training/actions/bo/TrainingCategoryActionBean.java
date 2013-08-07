package fr.xebia.training.actions.bo;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.dao.TrainingCategoryDAO;
import fr.xebia.training.model.TrainingCategory;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;

import java.util.List;

/**
 * TrainingCategoryActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/bo/categories/{$event}")
public class TrainingCategoryActionBean extends BaseActionBean{

    @SpringBean
    private TrainingCategoryDAO trainingCategoryDAO;

    private List<TrainingCategory> categories;

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listCategories() {
        categories = trainingCategoryDAO.findAll();
        return new ForwardResolution("/bo/categories.jsp");
    }


    public List<TrainingCategory> getCategories() {
        return categories;
    }
}
