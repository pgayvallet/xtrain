package fr.xebia.training.core.security;

import fr.xebia.training.actions.bo.LoginActionBean;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;
import org.apache.log4j.Logger;

/**
 * StripesSecurityInterceptor -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Intercepts(LifecycleStage.HandlerResolution)
public class StripesSecurityInterceptor implements Interceptor {

    private static final Logger log = Logger.getLogger(StripesSecurityInterceptor.class);

    @Override
    public Resolution intercept(ExecutionContext executionContext) throws Exception {
        Resolution resolution = executionContext.proceed();

        if(executionContext.getActionBean().getClass().isAnnotationPresent(RestrictedAccess.class)) {
            if(isAuthenticated(executionContext)) {
                return resolution;
            } else {
                return redirectToLogin();
            }
        } else {
            return resolution;
        }

    }

    private boolean isAuthenticated(ExecutionContext executionContext) {
        /*
        HttpSession session = executionContext.getActionBeanContext().getRequest().getSession();
        */
        // TODO
        return false;

    }

    private Resolution redirectToLogin() {
        return new RedirectResolution(LoginActionBean.class);

    }

}
