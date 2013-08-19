<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="navActionBean" beanclass="fr.xebia.training.actions.front.components.NavActionBean"/>

<div class="nav">
    <div class="nav-content">

        <stripes:link beanclass="fr.xebia.training.actions.front.HomeActionBean">
            Accueil
        </stripes:link>

        <a href="#">A propos</a>

        <a href="#">Formations techniques</a>

        <a href="#">Formations agiles</a>

        <%-- trainers --%>
        <a href="#">Nos formateurs</a>

        <a href="#">Promos</a>

        <stripes:link beanclass="fr.xebia.training.actions.front.ContactActionBean">
            Contact
        </stripes:link>

        <div class="pointer"></div>
    </div>
</div>