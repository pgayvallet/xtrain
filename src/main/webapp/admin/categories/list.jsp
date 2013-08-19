<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.admin.TrainingCategoryActionBean" event="list"/>
<c:set var="actionBeanName" value="fr.xebia.training.actions.admin.TrainingCategoryActionBean"/>

<stripes:layout-render name="/admin/layouts/master.jsp">
    <stripes:layout-component name="content">
        <h3>Gestion des catégories</h3>

        <table class="table-clean">
            <thead>
                <td>Id</td>
                <td>Type</td>
                <td>Titre</td>
                <td>Lien</td>
                <td>Actions</td>
            </thead>
            <tbody>
                <c:forEach var="cat" items="${actionBean.categories}">
                    <tr>
                        <td>${cat.id}</td>
                        <td>${cat.type}</td>
                        <td>${cat.title}</td>
                        <td>${cat.permalink}</td>
                        <td>
                            <stripes:link beanclass="${actionBeanName}" event="edit">
                                <stripes:param name="categoryId" value="${cat.id}"/>
                                    Editer
                            </stripes:link>
                            <stripes:link beanclass="${actionBeanName}" event="delete">
                                <stripes:param name="categoryId" value="${cat.id}"/>
                                    Supprimer
                            </stripes:link>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <hr/>

        <stripes:link beanclass="fr.xebia.training.actions.admin.TrainingCategoryActionBean" event="create">
            Créer une nouvelle catégorie
        </stripes:link>


    </stripes:layout-component>
</stripes:layout-render>