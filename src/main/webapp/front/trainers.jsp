<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.front.TrainerActionBean"/>

<stripes:layout-render name="/front/layouts/master.jsp"
                       pageTitle="Nos formateurs"
                       navSection="trainers"
                       containerClass="trainers">

    <stripes:layout-component name="content">

        <script type="text/javascript">
            $(function() {

                $(".trainer-carousel .trainer").eq(0).show();

                $(".list-section .trainer").click(function(event) {
                    var trainerId = $(event.currentTarget).attr("data-id");
                    $(".trainer-carousel .trainer").hide();
                    $(".trainer-carousel .trainer[data-id="+ trainerId+"]").show();
                    $('html,body').animate({scrollTop:0}, 500);
                });

            });
        </script>

        <div class="details-section section">
            <div class="section-content">
                <div class="trainer-carousel">

                    <c:forEach var="trainer" items="${actionBean.trainers}" varStatus="loopStatus">
                        <stripes:url var="trainerImageUrl" beanclass="fr.xebia.training.actions.ImagesActionBean" event="trainer">
                            <stripes:param name="id" value="${trainer.id}"/>
                        </stripes:url>
                        <div class="trainer" data-id="${trainer.id}" style="display: none">
                            <h2>
                                ${trainer.name}
                            </h2>
                            <div class="content">
                                <div class="bio">
                                    <p>
                                        ${trainer.bio}
                                    </p>
                                </div>
                                <div class="picture">
                                    <img src="${trainerImageUrl}"/>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>

        <div class="section-separator section"></div>


        <div class="list-section section">
            <div class="section-content">
                <h2>Nos formateurs</h2>

                <div class="description">
                    <p>
                        Xebia Training dispose de 2 pôles distincts: Les formations Agiles (Scrum, Kanban, XP ect) et les formations techniques Java, Big Data, DevOps ect).
                    </p>
                    <p>
                        Les formations agiles sont animées entre autres, par le co-fondateur de Scrum, Jeff Sutherland mais également par Gojko Adzic, auteur de l'ouvrage
                        "Specification by Example" et Gilles Mantel, créateur de la "Scrum Academy".
                    </p>
                    <p>
                        Les formations techniques "produits" sont animées en parteniariat avec des sociétés telles que Puppetlabs, Cloudera, Datastax et 10Gen.
                        Nos proposons également des formations thématiques avec notamment le leader du Java User Group Paris et auteur de l'ouvrage Java EE6,
                        Antonio Goncalves, ainsi que Kirk Pepperdine, Java Champion et expert dans l'optimisation de performances Java.
                    </p>
                </div>

                <div class="trainer-list">
                    <c:forEach var="trainer" items="${actionBean.trainers}">
                        <stripes:url var="trainerImageUrl" beanclass="fr.xebia.training.actions.ImagesActionBean" event="trainer">
                            <stripes:param name="id" value="${trainer.id}"/>
                        </stripes:url>
                        <div class="trainer" data-id="${trainer.id}">
                            <img src="${trainerImageUrl}"/>
                            <h4>
                                ${trainer.name}
                            </h4>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>


    </stripes:layout-component>
</stripes:layout-render>