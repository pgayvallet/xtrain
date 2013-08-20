<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="pageTitle" value="${actionBean.navSection == 'technical' ? 'Formations techniques' : 'Formations agiles'}"/>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="${pageTitle}"
                       navSection="${actionBean.navSection}">

    <stripes:layout-component name="content">

        TRAINING_SECTION.JSP

    </stripes:layout-component>

</stripes:layout-render>