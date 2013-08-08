<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-definition>
<html>
    <head>
        <title>BackOffice - XFR Training</title>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wro/libs.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wro/bo.css"/>

        <script type="text/javascript" src="${pageContext.request.contextPath}/wro/libs.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/wro/bo.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/tinymce/tinymce.min.js"></script>

        <stripes:layout-component name="extra-head"/>
    </head>
    <body>

        <div class="global-container">

            <div class="header-container">
                <stripes:layout-component name="header">
                    <jsp:include page="/bo/components/header.jsp"/>
                </stripes:layout-component>
            </div>

            <div class="nav-container">
                <stripes:layout-component name="nav">
                    <jsp:include page="/bo/components/nav.jsp"/>
                </stripes:layout-component>
            </div>

            <div class="page-content">
                <stripes:layout-component name="content"/>
            </div>

            <div class="footer-container">
                <stripes:layout-component name="header">
                    <jsp:include page="/bo/components/footer.jsp"/>
                </stripes:layout-component>
            </div>

        </div>

    </body>
</html>
</stripes:layout-definition>