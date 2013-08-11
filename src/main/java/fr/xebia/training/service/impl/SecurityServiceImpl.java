package fr.xebia.training.service.impl;

import fr.xebia.training.service.SecurityService;
import org.springframework.stereotype.Component;

/**
 * SecurityServiceImpl -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public class SecurityServiceImpl implements SecurityService {

    @Override
    public boolean authenticate(String username, String password) {
        // TODO
        return false;
    }

    @Override
    public boolean isAuthenticated() {
        // TODO
        return false;
    }

    @Override
    public boolean logout() {
        // TODO
        return false;
    }
}
