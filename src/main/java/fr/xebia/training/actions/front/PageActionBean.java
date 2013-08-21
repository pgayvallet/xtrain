package fr.xebia.training.actions.front;

import fr.xebia.training.core.BaseActionBean;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

/**
 * PageActionBean -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
@UrlBinding("/pages/{page}")
public class PageActionBean extends BaseActionBean {

    private String page;

    @DefaultHandler
    public Resolution showPage() {
        return forwardTo("/front/pages/" + page + ".jsp");
    }

    // get / set

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
