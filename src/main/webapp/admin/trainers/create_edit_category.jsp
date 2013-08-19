<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.admin.TrainerActionBean"/>

<stripes:layout-render name="/admin/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Création d'une catégorie</h3>

        <stripes:url var="submitUrl" beanclass="fr.xebia.training.actions.admin.TrainerActionBean" event="do_submit_category"/>
        <stripes:form action="${submitUrl}" >
            <stripes:hidden name="category.id"/>

            <stripes:errors/>

            <label>Titre de la catégorie</label>
            <stripes:text name="category.title"/>

            <label>Permalink ( alphanum et tirets uniquement )</label>
            <stripes:text name="category.permalink"/>

            <stripes:submit name="submit" value="Enregistrer"/>
        </stripes:form>

    </stripes:layout-component>
</stripes:layout-render>