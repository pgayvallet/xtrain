package fr.xebia.training.actions.admin;

import fr.xebia.training.core.security.RestrictedActionBean;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/admin")
public class BoHomeActionBean extends RestrictedActionBean {

    @DefaultHandler
    public Resolution showHome() {
        return forwardTo("/admin/home.jsp");
    }

}
