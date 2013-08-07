package fr.xebia.training.actions.bo;

import fr.xebia.training.core.BaseActionBean;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/bo")
public class BoHomeActionBean extends BaseActionBean {

    @DefaultHandler
    public Resolution showHome() {
        return forwardTo("/bo/home.jsp");
    }

}
