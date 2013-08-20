<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.front.TrainerActionBean"/>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="Formations techniques"
                       navSection="technical">  <%-- TODO : dynamic --%>

    <stripes:layout-component name="content">

    </stripes:layout-component>

</stripes:layout-render>