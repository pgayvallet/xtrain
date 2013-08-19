package fr.xebia.training.actions.front;

import fr.xebia.training.core.BaseActionBean;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/promos")
public class PromotionActionBean extends BaseActionBean {

    @DefaultHandler
    public Resolution showPromotionsPage() {
        return forwardTo("/front/promotions.jsp");
    }

}
