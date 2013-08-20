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

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="${actionBean.category.title}"
                       navSection="${actionBean.navSection}">

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

        TRAINING_CATEGORY.JSP

    </stripes:layout-component>

</stripes:layout-render>