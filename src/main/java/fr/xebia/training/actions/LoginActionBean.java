package fr.xebia.training.actions;

import fr.xebia.training.core.BaseActionBean;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 * LoginActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/login.action")
public class LoginActionBean extends BaseActionBean {

    @DefaultHandler
    public Resolution showLoginPage() {
        return new ForwardResolution("/back/login.jsp");
    }

}
