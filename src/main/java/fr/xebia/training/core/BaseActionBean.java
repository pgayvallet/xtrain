package fr.xebia.training.core;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * BaseActionBean -
 *
 * @author spark <gayvallet@fullsix.com>
 */
public abstract class BaseActionBean implements ActionBean {

    protected ActionBeanContext context;

    @Override
    public void setContext(ActionBeanContext actionBeanContext) {
        this.context = actionBeanContext;
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }
}
