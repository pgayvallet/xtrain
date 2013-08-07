package fr.xebia.training.actions.bo;

import fr.xebia.training.core.BaseActionBean;
import net.sourceforge.stripes.action.*;

/**
 * TrainingCategoryActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/bo/categories/{$event}")
public class TrainingCategoryActionBean extends BaseActionBean{

    @DefaultHandler
    @HandlesEvent("list")
    public Resolution listCategories() {
        return new ForwardResolution("/bo/categories.jsp");

    }

}
