package fr.xebia.training.service;

import org.springframework.stereotype.Component;

/**
 * SecurityService - Service around the security / user
 *
 * Note that all methods are related to threadlocal and/or session data.
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Component
public interface SecurityService {

    /**
     * Try to perform an authentication for given username and password.
     *
     * @param username The username to try to authenticate with.
     * @param password The password to try to authenticate with.
     * @return true if user has been authenticated, false otherwise.
     */
    boolean authenticate(String username, String password);

    /**
     * Checks if an user is currently authenticated.
     *
     * @return true if an user is currently authenticated, false otherwise.
     */
    boolean isAuthenticated();

    /**
     * Logs out currently logged user (if any).
     *
     * @return true if user has been logged out, false if no user were logged.
     */
    boolean logout();

}
