<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>

<stripes:layout-definition>
    <html>
    <head>
        <title>Layout Example</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/default.css"/>
        <stripes:layout-component name="html_head"/>
    </head>
    <body>

    <stripes:layout-component name="header">
        <jsp:include page="/back/components/nav.jsp"/>
    </stripes:layout-component>

    <div class="pageContent">
        <stripes:layout-component name="content"/>
    </div>

    </body>
    </html>
</stripes:layout-definition>