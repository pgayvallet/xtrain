<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.front.TrainerActionBean"/>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="Nos formateurs">

    <stripes:layout-component name="content">

        <div class="section">
            <div class="section-content">
                <h2>Nos formateurs agiles</h2>

                <c:forEach var="trainer" items="${actionBean.agileTrainers}">
                    <div>
                        ${trainer.name}
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="section">
            <div class="section-content">
                <h2>Nos formateurs techniques</h2>

                <c:forEach var="trainer" items="${actionBean.technicalTrainers}">
                    <div>
                        ${trainer.name}
                    </div>
                </c:forEach>
            </div>
        </div>


    </stripes:layout-component>
</stripes:layout-render>