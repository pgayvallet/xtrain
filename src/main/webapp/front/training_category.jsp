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

<c:set var="category" value="${actionBean.category}"/>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="${category.title}"
                       navSection="${actionBean.navSection}"
                       containerClass="category">

    <stripes:layout-component name="content">

        <%-- breadcrumb --%>
        <div class="breadcrumb-section section">
            <div class="section-content">
                <stripes:link beanclass="${actionBeanName}">
                    ${sectionName}
                </stripes:link>
                <span>/</span>
                <span>
                    ${actionBean.category.title}
                </span>
            </div>
        </div>

        <%-- trainings --%>
        <div class="section trainings-section">
            <div class="section-content">
                <h2>
                    <c:choose>
                        <c:when test="${not empty category.trainingTitle}">
                            ${category.trainingTitle}
                        </c:when>
                        <c:otherwise>
                            nos formations ${category.title}
                        </c:otherwise>
                    </c:choose>
                </h2>

                <p class="description">
                    ${category.description}
                </p>

                <div class="trainings">
                    <c:forEach var="training" items="${category.trainings}">
                        <div class="training">
                            <div class="picto"></div>
                            <div class="content">
                                <h3>
                                    <stripes:link beanclass="${actionBeanName}">
                                        <stripes:param name="categoryLink" value="${category.permalink}"/>
                                        <stripes:param name="trainingLink" value="${training.permalink}"/>
                                        ${training.title}
                                    </stripes:link>
                                </h3>
                                <p>
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras sit amet dignissim magna. Mauris a lorem urna. Vestibulum interdum massa eu erat aliquam tempus. Etiam tristique venenatis purus, sit amet viverra justo hendrerit sit amet. Phasellus semper neque ut tristique hendrerit. Morbi lorem lacus, porta quis pharetra quis, gravida a nunc. Phasellus gravida sem blandit bibendum dictum. Praesent fermentum odio nec accumsan lacinia.
                                </p>
                            </div>
                        </div>
                    </c:forEach>
                </div>

                <c:if test="${not empty category.offerSiteUrl}">
                    <a class="see-all" href="${category.offerSiteUrl}">
                        Voir le site de l'offre
                    </a>

                </c:if>

            </div>
        </div>

        <%-- videos --%>
        <c:if test="${category.vimeoChannelId!=null}">
            <div class="section videos-section">
                <div class="pattern"></div>
                <div class="section-content">
                    <h2>nos dernières vidéos</h2>
                    <div class="x-vimeo-container" data-channelId="${category.vimeoChannelId}"></div>
                    <a class="see-all" href="http://vimeo.com/channels/${category.vimeoChannelId}">
                        Voir toutes nos vidéos pour cette catégorie
                    </a>
                </div>
            </div>
        </c:if>

        <%-- articles --%>
        <c:if test="${category.blogCategory!=null}">
            <div class="section articles-section">
                <div class="section-content">
                    <h2>nos publications</h2>
                    <div class="x-blog-container" data-category="${category.blogCategory}"></div>
                    <a class="see-all" href="http://blog.xebia.fr/category/${category.blogCategory}">
                        Voir toutes nos publications pour cette catégorie
                    </a>
                </div>
            </div>
        </c:if>

    </stripes:layout-component>

</stripes:layout-render>