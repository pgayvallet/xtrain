<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.front.HomeActionBean"/>

<stripes:layout-render name="/front/layouts/master.jsp">
    <stripes:layout-component name="content">

        <%-- section 1 --%>
        <div class="hello section">
            <div class="hello-content section-content">
                <div class="hello-boids-back"></div>
                <h1>Formations Méthodes Agiles (Scrum, XP, Lean et Kanban) et Techniques (Java JEE, Big Data, Mobilité et Web)</h1>
                <h2><img src="${contextPath}/img/logo-transparent.png" alt="Xebia Training"></h2>
                <p class="hello-tel">+33 (0)1 53 89 99 99</p>
                <div class="hello-content-icosahedron"></div>


                <div class="hello-slide-bg"></div>
                <div class="hello-costume"></div>
                <div class="carousel">
                    <div class="carousel-slides">
                        <div class="slide1"></div>
                        <div class="slide2"></div>
                    </div>
                    <div class="carousel-dots">
                        <div class="dot dot1 active">•</div>
                        <div class="dot dot2">•</div>
                    </div>
                </div>
            </div>
            <div class="hello-line"></div>
            <div class="icosahedron"></div>
        </div>

        <%-- section 2 --%>
        <div class="passion section">
            <div class="passion-content section-content">
                <h2>Nos formations</h2>
                <p>Xebia-Training propose des formations haut de gamme animées uniquement par des référents dans le domaine</p>
                <div class="passion-bubbles">
                    <a class="software" href="http://blog.xebia.fr/tag/software-craftsmanship/" target="_blank">Software</a>
                    <a class="craftsmanship" href="http://blog.xebia.fr/tag/software-craftsmanship/" target="_blank">craftsmanship</a>
                    <a class="bigdata" href="http://blog.xebia.fr/category/nosql/" target="_blank">BigData</a>
                    <a class="cloud" href="http://blog.xebia.fr/category/nosql/" target="_blank">Cloud</a>
                    <a class="agile" href="http://blog.xebia.fr/category/agilite/" target="_blank">Agile</a>
                    <a class="devops" href="http://blog.xebia.fr/tag/devops/" target="_blank">DevOps</a>
                    <a class="java" href="http://blog.xebia.fr/category/java-jee/" target="_blank">Java &amp;<br>friends</a>
                    <a class="web" href="http://blog.xebia.fr/category/woa/" target="_blank">Web</a>
                    <a class="mobility" href="http://blog.xebia.fr/category/mobilite/" target="_blank">Mobility</a>
                </div>
            </div>
            <div class="passion-boids"></div>
        </div>

        <%-- section 3 --%>
        <div class="trust section">
            <div class="trust-boids"></div>
            <div class="trust-content section-content">
                <h2>Catalogue</h2>
            </div>
        </div>

        <%-- section 4 --%>
        <div class="universe section">
            <div class="universe-content section-content">
                <h2>Nos dernières vidéos</h2>
            </div>
        </div>

    </stripes:layout-component>
</stripes:layout-render>