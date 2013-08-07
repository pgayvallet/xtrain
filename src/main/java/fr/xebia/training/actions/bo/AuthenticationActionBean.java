package fr.xebia.training.actions.bo;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.service.TrainingService;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

/**
 * LoginActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
@UrlBinding("/login.action")
public class AuthenticationActionBean extends BaseActionBean {

    @SpringBean
    private TrainingService trainingService;

    @DefaultHandler
    public Resolution showLoginPage() {
        return new ForwardResolution("/bo/login.jsp");
    }


    public String getMessage() {
        return trainingService.getTest();
    }




}
