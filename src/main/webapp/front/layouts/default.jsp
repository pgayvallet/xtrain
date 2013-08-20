<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:layout-definition>
    <stripes:layout-render name="/front/layouts/master.jsp"
                           pageTitle="${pageTitle}"
                           navSection="${navSection}">

        <stripes:layout-component name="content">

            <%-- header --%>
            <jsp:include page="/front/components/header.jsp">
                <jsp:param name="pageTitle" value="${pageTitle}"/>
            </jsp:include>

            <%-- content --%>
            <stripes:layout-component name="content"/>

        </stripes:layout-component>
    </stripes:layout-render>
</stripes:layout-definition>