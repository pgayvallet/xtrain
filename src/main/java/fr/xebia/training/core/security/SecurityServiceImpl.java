package fr.xebia.training.core.security;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * SecurityServiceImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public class SecurityServiceImpl implements SecurityService {

    private static final String USER_SESSION_KEY = "app.user";

    @Override
    public boolean authenticate(String username, String password) {
        if(username.equals("admin") && password.equals("admin")) {
            SessionContextHolder.getSession().setAttribute(USER_SESSION_KEY, true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAuthenticated() {
        HttpSession session = SessionContextHolder.getSession();
        Boolean loggedIn = (Boolean) session.getAttribute(USER_SESSION_KEY);
        return loggedIn != null && loggedIn;
    }

    @Override
    public boolean logout() {
        if(isAuthenticated()) {
            SessionContextHolder.getSession().removeAttribute(USER_SESSION_KEY);
            return true;
        } else {
            return false;
        }
    }

}
