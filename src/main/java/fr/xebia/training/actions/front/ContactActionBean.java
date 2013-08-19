package fr.xebia.training.actions.front;

import fr.xebia.training.core.BaseActionBean;
import fr.xebia.training.service.MailerService;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

@UrlBinding("/contact")
public class ContactActionBean extends BaseActionBean {

    @SpringBean
    private MailerService mailerService;

    @DefaultHandler
    public Resolution showContactPage() {
        return forwardTo("/front/contact.jsp");
    }

}
