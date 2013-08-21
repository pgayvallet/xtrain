<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes-dynattr.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<stripes:useActionBean var="tableActionBean" beanclass="fr.xebia.training.actions.front.components.TrainingTableActionBean"/>


<c:set var="isPromo" value="${param.promo}"/>

<c:set var="trainings" value="${tableActionBean.trainings}"/>

<div class="training-table">

    <table class="table-clean">
        <thead>
            <td>Formation</td>
            <td>Formateur</td>
            <td>Catégorie</td>
            <td>Date</td>
            <td>Prix</td>
        </thead>
        <tbody>
        <c:forEach var="training" items="${trainings}">
            <tr>
                <td>
                    ${training.title}
                </td>
                <td>
                    ${training.trainer.name}
                </td>
                <td>
                    ${training.category.title}
                </td>
                <td>
                    TODO
                </td>
                <td>
                    ${training.priceInter} - ${training.priceIntra}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>
