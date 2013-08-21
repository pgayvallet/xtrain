<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:choose>
    <c:when test="${actionBean.navSection == 'technical'}">
        <c:set var="categoryType" value="TECHNICAL"/>
        <c:set var="actionBeanName" value="fr.xebia.training.actions.front.TechnicalTrainingActionBean"/>
        <c:set var="pageTitle" value="Formations techniques"/>
    </c:when>
    <c:otherwise>
        <c:set var="categoryType" value="AGILE"/>
        <c:set var="actionBeanName" value="fr.xebia.training.actions.front.AgileTrainingActionBean"/>
        <c:set var="pageTitle" value="Formations agiles"/>
    </c:otherwise>
</c:choose>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="${pageTitle}"
                       navSection="${actionBean.navSection}">

    <stripes:layout-component name="content">

        <div class="section">
            <div class="section-content">
                <h2>${pageTitle}</h2>
                <jsp:include page="components/training_table.jsp">
                    <jsp:param name="categoryType" value="${categoryType}"/>
                </jsp:include>
            </div>
        </div>
    </stripes:layout-component>

</stripes:layout-render>