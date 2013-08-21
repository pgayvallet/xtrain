<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
    <c:when test="${actionBean.navSection == 'technical'}">
        <c:set var="actionBeanName" value="fr.xebia.training.actions.front.TechnicalTrainingActionBean"/>
        <c:set var="sectionName" value="Formations techniques"/>
    </c:when>
    <c:otherwise>
        <c:set var="actionBeanName" value="fr.xebia.training.actions.front.AgileTrainingActionBean"/>
        <c:set var="sectionName" value="Formations agiles"/>
    </c:otherwise>
</c:choose>

<c:set var="training" value="${actionBean.training}"/>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="${training.title}"
                       navSection="${actionBean.navSection}"
                       containerClass="training">

    <stripes:layout-component name="content">

        <%-- breadcrumb --%>
        <div class="breadcrumb-section section">
            <div class="section-content">
                <stripes:link beanclass="${actionBeanName}">
                    ${sectionName}
                </stripes:link>
                <span>/</span>
                <stripes:link beanclass="${actionBeanName}">
                    <stripes:param name="categoryLink" value="${actionBean.category.permalink}"/>
                    ${actionBean.category.title}
                </stripes:link>
                <span>/</span>
                <span>
                    ${training.title}
                </span>
            </div>
        </div>

        <c:if test="${training.linkedInProductId!=null}">
            <script src="//platform.linkedin.com/in.js" type="text/javascript">lang: fr_FR</script>
            <script type="IN/RecommendProduct" data-company="825630" data-product="${training.linkedInProductId}" data-counter="top"></script>
        </c:if>

        <div class="inner-container">

            <%-- left nav --%>
            <div class="left-nav">
                <a href="#anchor-presentation">
                    Présentation
                </a>
                <a href="#anchor-programme">
                    Programme
                </a>
                <a href="#anchor-bio">
                    Biographie
                </a>
                <a href="#anchor-info">
                    Informations
                </a>
                <a href="#anchor-testimony">
                    Témoignages
                </a>
            </div>

            <%-- -presentation --%>
            <div class="presentation-section section" id="anchor-presentation">
                <div class="section-content">
                    <h2>présentation</h2>

                    <div>
                        ${training.presentation}
                    </div>

                </div>
            </div>

            <%-- -program --%>
            <div class="programme-section section" id="anchor-programme">
                <div class="section-content">
                    <h2>programme</h2>

                    <div class="program">
                        ${training.program}
                    </div>

                </div>
            </div>

            <%-- -bio / trainer --%>
            <div class="bio-section section" id="anchor-bio">
                <c:set var="trainer" value="${actionBean.training.trainer}"/>
                <stripes:url var="trainerPictureUrl" beanclass="fr.xebia.training.actions.ImagesActionBean" event="trainer">
                    <stripes:param name="id" value="${trainer.id}"/>
                </stripes:url>
                <div class="section-content">
                    <div class="picture">
                        <img src="${trainerPictureUrl}"/>
                    </div>
                    <div class="bio">
                        <h2>biographie</h2>
                        <h3>${trainer.name}</h3>
                        <p>${trainer.bio}</p>
                    </div>
                </div>
            </div>

            <%-- informations --%>
            <div class="info-section section" id="anchor-info">
                <div class="section-content">
                    <h2>informations</h2>

                    <div class="bubbles">
                        <div class="bubble date-bubble">
                            <h3>dates</h3>
                            <p>
                                todo date 1
                                <br>
                                todo date 2
                            </p>
                        </div>
                        <div class="bubble price-bubble">
                            <h3>prix</h3>
                            <p>
                                Intra : TODO €
                                <br>
                                Inter : TODO €
                            </p>
                        </div>
                        <div class="bubble subscribe-bubble">
                            <h3>s'inscrire</h3>
                            <p>S'inscrire à la formation</p>
                        </div>
                    </div>

                </div>
            </div>

            <%-- testimony --%>
            <div class="testimony-section section" id="anchor-testimony">
                <div class="section-content">
                    <h2>témoignages</h2>

                </div>
            </div>

        </div>

    </stripes:layout-component>

</stripes:layout-render>