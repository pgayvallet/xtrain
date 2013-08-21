<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.admin.TrainingActionBean"/>

<stripes:layout-render name="/admin/layouts/master.jsp">
    <stripes:layout-component name="extra-head">
        <jsp:include page="/admin/components/tiny_mce_init.jsp"/>
    </stripes:layout-component>


    <stripes:layout-component name="content">
        <h3>Création d'une formation</h3>

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

            <label>Formateur</label>
            <stripes:select name="training.trainer.id">
                <stripes:options-collection
                        collection="${actionBean.availableTrainers}"
                        value="id" label="name"/>
            </stripes:select>

            <label>Titre de la formation</label>
            <stripes:text name="training.title"/>

            <label>Permalink ( alphanum et tirets uniquement )</label>
            <stripes:text name="training.permalink"/>

            <label>LinkedIn Product ID</label>
            <stripes:text name="training.linkedInProductId"/>

            <label>Meta Description</label>
            <stripes:textarea name="training.metaDescription"/>

            <label>Meta Keywords</label>
            <stripes:textarea name="training.metaKeywords"/>

            <label>Présentation</label>
            <stripes:textarea class="mce" name="training.presentation"/>

            <label>Url site externe présentation</label>
            <stripes:text name="training.presentationSiteUrl"/>

            <label>Programme</label>
            <stripes:textarea class="mce" name="training.program"/>

            <label>Fichier pdf du programme</label>
            <stripes:file name="uploadedProgramFile"/>

            <label>Prix inter-entreprise</label>
            <stripes:text name="training.priceInter"/>

            <label>Prix intra-entreprise</label>
            <stripes:text name="training.priceIntra"/>

            <label>En promotion</label>
            <stripes:checkbox name="training.promo" id="promoCheckbox"/>

            <label>Prix promotionnel</label>
            <stripes:text name="training.pricePromo"/>


            <stripes:submit name="do_submit" value="Enregistrer"/>
        </stripes:form>

    </stripes:layout-component>
</stripes:layout-render>