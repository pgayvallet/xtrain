<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<stripes:useActionBean var="navActionBean" beanclass="fr.xebia.training.actions.front.components.NavActionBean"/>

<div id="nav" class="nav" data-selected="${param.section}">
    <div class="nav-first">
        <div class="nav-content">

            <%-- home --%>
            <div class="nav-section">
                <stripes:link data-id="home" beanclass="fr.xebia.training.actions.front.HomeActionBean">
                    Accueil
                </stripes:link>
            </div>

            <%-- about --%>
            <div class="nav-section">
                <c:set var="pageActionBean" value="fr.xebia.training.actions.front.PageActionBean"/>
                <stripes:link data-id="about" beanclass="${pageActionBean}">
                    <stripes:param name="page" value="a-propos"/>
                    A propos
                </stripes:link>
                <div class="section-sub">
                    <stripes:link beanclass="${pageActionBean}">
                        <stripes:param name="page" value="a-propos"/>
                        A propos de nous
                    </stripes:link>
                    <stripes:link beanclass="${pageActionBean}">
                        <stripes:param name="page" value="inscription"/>
                        Inscriptions
                    </stripes:link>
                    <stripes:link beanclass="${pageActionBean}">
                        <stripes:param name="page" value="devenir-scrum-master"/>
                        Devenir Scrum Master
                    </stripes:link>
                    <stripes:link beanclass="${pageActionBean}">
                        <stripes:param name="page" value="xebia-essentials"/>
                        Xebia Essentials
                    </stripes:link>
                    <stripes:link beanclass="${pageActionBean}">
                        <stripes:param name="page" value="conditions-generales"/>
                        Conditions Générales
                    </stripes:link>
                </div>
            </div>

            <%-- technical --%>
            <div class="nav-section">
                <c:set var="techActionBean" value="fr.xebia.training.actions.front.TechnicalTrainingActionBean"/>
                <stripes:link data-id="technical" beanclass="${techActionBean}">
                    Formations techniques
                </stripes:link>
                <div class="section-sub">
                    <c:forEach var="categoryEntry" items="${navActionBean.technicalMap}">
                        <div class="nav-section">
                            <stripes:link beanclass="${techActionBean}">
                                <stripes:param name="categoryLink" value="${categoryEntry.key.permalink}"/>
                                ${categoryEntry.key.title}
                            </stripes:link>
                            <c:if test="${fn:length(categoryEntry.value)>0}">
                                <div class="section-last">
                                    <c:forEach var="training" items="${categoryEntry.value}">
                                        <stripes:link beanclass="${techActionBean}">
                                            <stripes:param name="categoryLink" value="${categoryEntry.key.permalink}"/>
                                            <stripes:param name="trainingLink" value="${training.permalink}"/>
                                            ${training.title}
                                        </stripes:link>
                                    </c:forEach>
                                </div>
                            </c:if>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <%-- agile --%>
            <div class="nav-section">
                <c:set var="agileActionBean" value="fr.xebia.training.actions.front.AgileTrainingActionBean"/>
                <stripes:link data-id="agile" beanclass="${agileActionBean}">
                    Formations agiles
                </stripes:link>
                <div class="section-sub">
                    <c:forEach var="categoryEntry" items="${navActionBean.agileMap}">
                        <div class="nav-section">
                            <stripes:link beanclass="${agileActionBean}">
                                <stripes:param name="categoryLink" value="${categoryEntry.key.permalink}"/>
                                ${categoryEntry.key.title}
                            </stripes:link>
                            <c:if test="${fn:length(categoryEntry.value)>0}">
                                <div class="section-last">
                                    <c:forEach var="training" items="${categoryEntry.value}">
                                        <stripes:link beanclass="${agileActionBean}">
                                            <stripes:param name="categoryLink" value="${categoryEntry.key.permalink}"/>
                                            <stripes:param name="trainingLink" value="${training.permalink}"/>
                                            ${training.title}
                                        </stripes:link>
                                    </c:forEach>
                                </div>
                            </c:if>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <%-- trainers --%>
            <div class="nav-section">
                <stripes:link data-id="trainers" beanclass="fr.xebia.training.actions.front.TrainerActionBean">
                    Nos formateurs
                </stripes:link>
            </div>

            <%-- promo --%>
            <div class="nav-section">
                <stripes:link data-id="promo" beanclass="fr.xebia.training.actions.front.PromotionActionBean">
                    Promos
                </stripes:link>
            </div>

            <%-- contact --%>
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