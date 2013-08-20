<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="navActionBean" beanclass="fr.xebia.training.actions.front.components.NavActionBean"/>

<div id="nav" class="nav" data-selected="${param.section}">
    <div class="nav-first">
        <div class="nav-content">

            <div class="nav-section">
                <stripes:link data-id="home" beanclass="fr.xebia.training.actions.front.HomeActionBean">
                    Accueil
                </stripes:link>
            </div>

            <div class="nav-section">
                <a data-id="about" href="#">A propos</a>
                <div class="section-sub">
                    <a href="#">A propos de nous</a>
                    <a href="#">Inscriptions</a>
                    <a href="#">Devenir Scrum Master</a>
                    <a href="#">Xebia Essentials</a>
                    <a href="#">Conditions Générales</a>
                </div>
            </div>

            <div class="nav-section">
                <a data-id="technical" href="#">Formations techniques</a>
            </div>

            <div class="nav-section">
                <a data-id="agiles" href="#">Formations agiles</a>
            </div>

            <div class="nav-section">
                <stripes:link data-id="trainers" beanclass="fr.xebia.training.actions.front.TrainerActionBean">
                    Nos formateurs
                </stripes:link>
            </div>

            <div class="nav-section">
                <stripes:link data-id="promo" beanclass="fr.xebia.training.actions.front.PromotionActionBean">
                    Promos
                </stripes:link>
            </div>

            <div class="nav-section">
                <stripes:link data-id="contact" beanclass="fr.xebia.training.actions.front.ContactActionBean">
                    Contact
                </stripes:link>
            </div>

        </div>

        <div class="pointer"></div>
    </div>

    <div class="nav-sub">
        <div class="nav-content"></div>
        <div class="pointer"></div>
    </div>

    <div class="nav-last"></div>


</div>