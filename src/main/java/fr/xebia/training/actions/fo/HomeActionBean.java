package fr.xebia.training.actions.fo;

import fr.xebia.training.core.BaseActionBean;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/")
public class HomeActionBean extends BaseActionBean {

    public Resolution showHome() {
        return forwardTo("/fo/home.jsp");
    }

}
