<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="actionBeanName" value="fr.xebia.training.actions.bo.LoginActionBean"/>
<stripes:url var="submitUrl" beanclass="${actionBeanName}" event="do_login"/>

<!DOCTYPE html>
<html>
    <head>
        <title>Login - XFR Training</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wro/bo.css"/>
    </head>
    <body>
        <div class="login-container">
            <div class="xebia-logo"></div>
            <stripes:form class="login-form" action="${submitUrl}">
                <div class="title">
                    <h3>Admin - Authentication</h3>
                </div>
                <div class="content">
                    <div>
                        <label>Username</label>
                        <stripes:text name="username"/>
                    </div>
                    <div>
                        <label>Password</label>
                        <stripes:password name="password"/>
                    </div>
                    <div class="submit">
                        <stripes:submit name="submit" value="Ok"/>
                    </div>
                </div>
            </stripes:form>
        </div>
    </body>
</html>
