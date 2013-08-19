<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.admin.TrainerActionBean"/>

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
        <h3>Création d'un formateur</h3>

        <stripes:url var="submitUrl" beanclass="fr.xebia.training.actions.admin.TrainerActionBean" event="do_submit_trainer"/>
        <stripes:form action="${submitUrl}" >
            <stripes:hidden name="trainer.id"/>

            <stripes:errors/>

            <label>Catégorie</label>
            <stripes:select name="trainer.category.id">
                <stripes:options-collection
                        collection="${actionBean.availableCategories}"
                        value="id" label="title"/>
            </stripes:select>

            <label>Nom du formateur</label>
            <stripes:text name="trainer.name"/>

            <label>Permalink ( alphanum et tirets uniquement )</label>
            <stripes:text name="trainer.permalink"/>

            <label>Biographie</label>
            <stripes:textarea name="trainer.bio"/>

            <stripes:submit name="submit" value="Enregistrer"/>
        </stripes:form>

    </stripes:layout-component>
</stripes:layout-render>