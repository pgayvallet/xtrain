<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.fo.HomeActionBean"/>

<stripes:layout-render name="/fo/layouts/master.jsp">
    <stripes:layout-component name="content">
        Home !
    </stripes:layout-component>
</stripes:layout-render>