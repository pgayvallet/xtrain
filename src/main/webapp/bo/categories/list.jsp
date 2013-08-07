<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.bo.TrainingCategoryActionBean" event="list"/>

<stripes:layout-render name="/bo/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Gestion des catégories<h3>

        <c:forEach var="entry" items="${actionBean.categories}">
        	<div>${entry.title}</div>
        </c:forEach>


        <hr/>

        <stripes:link beanclass="fr.xebia.training.actions.bo.TrainingCategoryActionBean" event="create">
            Créer une nouvelle catégorie
        </stripes:link>


    </stripes:layout-component>
</stripes:layout-render>