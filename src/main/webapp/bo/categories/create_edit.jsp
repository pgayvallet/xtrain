<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.bo.TrainingCategoryActionBean"/>

<stripes:layout-render name="/bo/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Création d'une catégorie<h3>
    </stripes:layout-component>
</stripes:layout-render>