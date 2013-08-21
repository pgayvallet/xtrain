<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.admin.TrainerActionBean"/>

<stripes:layout-render name="/admin/layouts/master.jsp">
    <stripes:layout-component name="extra-head">
        <jsp:include page="/admin/components/tiny_mce_init.jsp"/>
    </stripes:layout-component>

    <stripes:layout-component name="content">
        <h3>Création d'un formateur</h3>

        <stripes:url var="submitUrl" beanclass="fr.xebia.training.actions.admin.TrainerActionBean" event="submit_edit"/>
        <stripes:form action="${submitUrl}" class="edit-form">
            <stripes:hidden name="trainer.id"/>

            <stripes:errors/>

            <label>Catégorie</label>
            <stripes:select name="trainer.category">
                <stripes:options-collection
                        collection="${actionBean.availableCategoriesTypes}"/>
            </stripes:select>

            <label>Nom du formateur</label>
            <stripes:text name="trainer.name"/>

            <label>Image</label>
            <stripes:file name="uploadedPictureFile"/>

            <label>Biographie</label>
            <stripes:textarea class="mce" name="trainer.bio"/>

            <stripes:submit name="submit" value="Enregistrer"/>
        </stripes:form>

    </stripes:layout-component>
</stripes:layout-render>