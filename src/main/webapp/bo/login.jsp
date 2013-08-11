<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="actionBeanName" value="fr.xebia.training.actions.bo.LoginActionBean"/>

<!DOCTYPE html>
<html>
    <head>
        <title>Login - XFR Training</title>
    </head>
    <body>
        <stripes:url var="submitUrl" beanclass="${actionBeanName}" event="do_login"/>
        <stripes:form class="login" action="${submitUrl}">

            <label>Username</label>
            <stripes:text name="username"/>

            <label>Password</label>
            <stripes:password name="password"/>

            <stripes:submit name="submit" value="Ok"/>
        </stripes:form>
    </body>
</html>
