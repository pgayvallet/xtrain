<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.admin.TrainingCategoryActionBean"/>

<stripes:layout-render name="/admin/layouts/master.jsp">
    <stripes:layout-component name="extra-head">
        <jsp:include page="/admin/components/tiny_mce_init.jsp"/>
    </stripes:layout-component>
    <stripes:layout-component name="content">
        <h3>Création d'une catégorie</h3>

        <stripes:url var="submitUrl" beanclass="fr.xebia.training.actions.admin.TrainingCategoryActionBean" event="edit_submit"/>
        <stripes:form action="${submitUrl}" class="edit-form">
            <stripes:hidden name="category.id"/>

            <stripes:errors/>

            <label>Type de formation</label>
            <stripes:select name="category.type">
                <stripes:option value="TECHNICAL">Formation Technique</stripes:option>
                <stripes:option value="AGILE">Formation Agile</stripes:option>
            </stripes:select>

            <label>Titre de la catégorie</label>
            <stripes:text name="category.title"/>

            <label>Permalink ( alphanum et tirets uniquement )</label>
            <stripes:text name="category.permalink"/>

            <label>Description de la catégorie</label>
            <stripes:textarea class="mce" name="category.description"/>

            <label>Meta Description</label>
            <stripes:textarea name="category.metaDescription"/>

            <label>Meta Keywords</label>
            <stripes:textarea name="category.metaKeywords"/>

            <label>Catégorie blog xebia.fr</label>
            <stripes:text name="category.blogCategory"/>

            <label>channelId vimeo</label>
            <stripes:text name="category.vimeoChannelId"/>

            <label>Url du site d'offre</label>
            <stripes:text name="category.offerSiteUrl"/>

            <label>Titre de catégorie de la page de formation</label>
            <stripes:text name="category.trainingTitle"/>

            <label>Image de la catégorie</label>
            <stripes:file name="uploadedPictureFile"/>

            <stripes:submit name="do_submit" value="Enregistrer"/>
        </stripes:form>

    </stripes:layout-component>
</stripes:layout-render>