<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.front.ContactActionBean"/>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="Promotions"
                       navSection="promo">

    <stripes:layout-component name="content">

        <div class="section">
            <div class="section-content">
                <h2 class="title-blue">Catalogue des promotions</h2>
                <jsp:include page="components/training_table.jsp">
                    <jsp:param name="promo" value="true"/>
                </jsp:include>
            </div>

        </div>

    </stripes:layout-component>
</stripes:layout-render>