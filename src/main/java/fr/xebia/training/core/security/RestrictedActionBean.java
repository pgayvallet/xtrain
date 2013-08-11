package fr.xebia.training.core.security;

import fr.xebia.training.core.BaseActionBean;

/**
 * RestrictedActionBean - base, abstract class for action bean requiring authentication
 *
 * @author spark <gayvallet@fullsix.com>
 */
@RestrictedAccess
public abstract class RestrictedActionBean extends BaseActionBean {
}
