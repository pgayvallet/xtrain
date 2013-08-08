<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.bo.TrainingActionBean" event="list"/>
<c:set var="actionBeanName" value="fr.xebia.training.actions.bo.TrainingActionBean"/>

<stripes:layout-render name="/bo/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Gestion des formations<h3>

        <table class="table-clean">
            <thead>
                <td>Id</td>
                <td>Titre</td>
                <td>Lien</td>
                <td>Actions</td>
            </thead>
            <tbody>
            <c:forEach var="training" items="${actionBean.trainings}">
                <tr>
                    <td>${training.id}</td>
                    <td>${training.title}</td>
                    <td>${training.permalink}</td>
                    <td>
                        <stripes:link beanclass="${actionBeanName}" event="edit">
                            <stripes:param name="trainingId" value="${training.id}"/>
                            Editer
                        </stripes:link>
                        <stripes:link beanclass="${actionBeanName}" event="delete">
                            <stripes:param name="trainingId" value="${training.id}"/>
                            Supprimer
                        </stripes:link>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <hr/>

        <stripes:link beanclass="${actionBeanName}" event="create">
            Créer une nouvelle formation
        </stripes:link>


    </stripes:layout-component>
</stripes:layout-render>