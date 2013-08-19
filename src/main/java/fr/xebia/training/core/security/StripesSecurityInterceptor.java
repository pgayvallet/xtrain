package fr.xebia.training.core.security;

import fr.xebia.training.actions.admin.LoginActionBean;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * StripesSecurityInterceptor -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@Intercepts(LifecycleStage.HandlerResolution)
public class StripesSecurityInterceptor implements Interceptor {

    private static final Logger log = Logger.getLogger(StripesSecurityInterceptor.class);

    @Autowired
    private SecurityService securityService;

    @Override
    public Resolution intercept(ExecutionContext executionContext) throws Exception {
        autowire(executionContext);
        Resolution resolution = executionContext.proceed();
        if(executionContext.getActionBean().getClass().isAnnotationPresent(RestrictedAccess.class)) {
            if(isAuthenticated()) {
                return resolution;
            } else {
                return redirectToLogin();
            }
        } else {
            return resolution;
        }
    }

    private void autowire(ExecutionContext executionContext) {
        ServletContext servletContext = executionContext.getActionBeanContext().getServletContext();
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ac.getAutowireCapableBeanFactory().autowireBeanProperties(this, AutowireCapableBeanFactory.AUTOWIRE_BY_NAME, true);
    }

    private boolean isAuthenticated() {
        return securityService.isAuthenticated();
    }

    private Resolution redirectToLogin() {
        return new RedirectResolution(LoginActionBean.class);

    }

}
