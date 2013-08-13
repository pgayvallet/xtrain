<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.bo.TrainerActionBean" event="list"/>
<c:set var="actionBeanName" value="fr.xebia.training.actions.bo.TrainerActionBean"/>

<stripes:layout-render name="/bo/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Gestion des formateurs</h3>

        <table class="table-clean">
            <thead>
                <td>Id</td>
                <td>Nom</td>
                <td>Catégorie</td>
                <td></td>
            </thead>
            <tbody>
            <c:forEach var="trainer" items="${actionBean.trainers}">
                <tr>
                    <td>${trainer.id}</td>
                    <td>${trainer.name}</td>
                    <td>${trainer.category.id} - ${trainer.category.title}</td>
                    <td>
                        <stripes:link beanclass="${actionBeanName}" event="edit">
                            <stripes:param name="trainerId" value="${trainer.id}"/>
                            Editer
                        </stripes:link>
                        <stripes:link beanclass="${actionBeanName}" event="delete">
                            <stripes:param name="trainerId" value="${trainer.id}"/>
                            Supprimer
                        </stripes:link>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <hr/>

        <stripes:link beanclass="${actionBeanName}" event="create">
            Ajouter un formateur
        </stripes:link>


    </stripes:layout-component>
</stripes:layout-render>