<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.admin.TrainingActionBean"/>

<stripes:layout-render name="/admin/layouts/master.jsp">
    <stripes:layout-component name="extra-head">
        <script type="text/javascript">
            $(function() {
                tinyMCE.init({
                    selector : "textarea"
                });
            });
        </script>
    </stripes:layout-component>


    <stripes:layout-component name="content">
        <h3>Création d'une catégorie</h3>

        <stripes:url var="submitUrl" beanclass="fr.xebia.training.actions.admin.TrainingActionBean" event="edit_submit"/>
        <stripes:form action="${submitUrl}" class="edit-form">
            <stripes:hidden name="training.id"/>

            <stripes:errors/>

            <label>Catégorie</label>
            <stripes:select name="training.category.id">
                <stripes:options-collection
                        collection="${actionBean.availableCategories}"
                        value="id" label="title"/>
            </stripes:select>

            <label>Titre de la formation</label>
            <stripes:text name="training.title"/>

            <label>Permalink ( alphanum et tirets uniquement )</label>
            <stripes:text name="training.permalink"/>

            <label>Présentation</label>
            <stripes:textarea name="training.presentation"/>

            <label>Programme</label>
            <stripes:textarea name="training.program"/>

            <stripes:submit name="do_submit" value="Enregistrer"/>
        </stripes:form>

    </stripes:layout-component>
</stripes:layout-render>