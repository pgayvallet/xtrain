<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="S'inscrire à une formation"
                       navSection="about"
                       containerClass="page">

    <stripes:layout-component name="content">

        <div class="section">
            <div class="section-content">
                <h2>S'inscrire à une formation</h2>

                <p>
                    Xebia Training est une société de formation agréée ce qui vous permet d'être financé
                    par ces organismes (Fafiec, Agefos, Opcalia par exemple).
                    <br/>
                    Notre numéro d'agrément est le : <b>11 92 164 1692</b>
                </p>

                <p>
                    Pour vous inscrire à une formation, <a href="#contact">remplissez le formulaire en ligne</a> ou
                    <a href="${contextPath}/files/bon-de-commande.pdf">téléchargez notre bon de commande PDF éditable.</a>
                </p>

                <p>
                    Dès réception de ces documents, votre inscription sera validée, nous vous enverrons dès lors
                    les convocations et conventions de formation.
                </p>
            </div>
        </div>

    </stripes:layout-component>

</stripes:layout-render>