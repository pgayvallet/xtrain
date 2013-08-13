<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="navActionBean" beanclass="fr.xebia.training.actions.fo.components.NavActionBean"/>

<div class="nav">
    <div class="nav-content">

        <a href="#hello">A propos</a>

        <a href="#passion">Formations techniques</a>

        <a href="#trust">Formations agiles</a>

        <%-- trainers --%>
        <a href="#universe">Nos formateurs</a>
        <c:forEach var="entry" items="${navActionBean.trainerMap}">
            ${entry.key.title}
        </c:forEach>

        <a href="#contact">Promos</a>

        <a href="#work">Contact</a>

        <div class="pointer"></div>
    </div>
</div>