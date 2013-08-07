<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.bo.TrainingCategoryActionBean"/>

<stripes:layout-render name="/bo/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Création d'une catégorie<h3>


        <stripes:url var="submitUrl" beanclass="fr.xebia.training.actions.bo.TrainingCategoryActionBean" event="edit_submit"/>
        <stripes:form action="${submitUrl}" >

            <stripes:hidden name="category.id"/>

            <stripes:text name="category.title"/>
            <stripes:text name="category.url"/>
            
            <stripes:submit name="do_submit" value="Sauver"/>
        </stripes:form>

    </stripes:layout-component>
</stripes:layout-render>