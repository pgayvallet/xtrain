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

                <p class="description">
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce facilisis nunc sed nunc molestie, vitae venenatis sapien consequat. Vestibulum vestibulum sem at eros cursus rhoncus. Etiam a imperdiet lectus. Pellentesque sit amet cursus nisi. Pellentesque vehicula tempor nunc, quis fringilla felis. Nunc felis sapien, interdum in iaculis sit amet, tincidunt et dolor. Sed vehicula metus nec velit laoreet, vestibulum blandit sapien semper. Nulla facilisi. Donec porttitor tellus leo, non lacinia est porta ut. Nullam venenatis varius facilisis.
                </p>

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