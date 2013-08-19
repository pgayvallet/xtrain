package fr.xebia.training.actions.admin;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.core.security.SecurityService;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;

/**
 * LoginActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/admin/login/{$event}")
public class LoginActionBean extends BaseActionBean {

    @SpringBean
    private SecurityService securityService;

    private String username;
    private String password;

    @DefaultHandler
    @HandlesEvent("login")
    public Resolution showLoginPage() {
        return new ForwardResolution("/admin/login.jsp");
    }

    @HandlesEvent("do_login")
    public Resolution performLogin() {
        boolean success = securityService.authenticate(username, password);
        if(success) {
            return new RedirectResolution(BoHomeActionBean.class);
        } else {
            return new RedirectResolution(this.getClass(), "login");
        }
    }

    @HandlesEvent("logout")
    public Resolution performLogout() {
        securityService.logout();
        return new RedirectResolution(this.getClass(), "login");
    }

    // get / set

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
