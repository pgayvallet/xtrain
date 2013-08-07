<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>

<div class="nav">

    <div class="nav-element active">
        <stripes:link beanclass="fr.xebia.training.actions.bo.TrainingCategoryActionBean" event="list">
            Gestion des Catégories
        </stripes:link>
    </div>
    <div class="nav-element">
        <stripes:link beanclass="fr.xebia.training.actions.bo.TrainingActionBean" event="list">
            Gestion des Formations
        </stripes:link>
    </div>


</div>