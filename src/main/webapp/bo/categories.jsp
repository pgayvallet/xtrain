<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.bo.TrainingCategoryActionBean" event="list"/>

<stripes:layout-render name="/bo/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Gestion des catégories<h3>

        <c:forEach var="entry" items="${actionBean.categories}" >
        	<div>${entry.title}</div>
        </c:forEach>

    </stripes:layout-component>
</stripes:layout-render>