<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="A propos de nous"
                       navSection="about"
                       containerClass="page">

    <stripes:layout-component name="content">

        <stripes:url var="technicalTrainingUrl" beanclass="fr.xebia.training.actions.front.TechnicalTrainingActionBean"/>
        <stripes:url var="agileTrainingUrl" beanclass="fr.xebia.training.actions.front.AgileTrainingActionBean"/>


        <div class="section">
            <div class="section-content">
                <h2>Xebia</h2>
                <p>
                    La mission de <a href="http://www.xebia.fr">Xebia</a> consiste à occuper auprès de ses clients le rôle de bras droit et de tiers de confiance afin de les aider à concevoir, développer et gérer des infrastructures, des applications et des architectures basées sur Java en appliquant les meilleures pratiques du Software Craftmanship. Pour ce faire, Xebia réunit en son sein, des personnalités incontournables de la communauté Java/J2EE et les coachs agiles les plus reconnus.</p>
                <h2>Xebia Training</h2>
                <p>
                    Xebia-Training se positionne logiquement dans la continuité de <a href="http://www.xebia.fr">Xebia</a>, tant sur la qualité de son offre de formation technique que méthodologique, en proposant des formations haut de gamme animées uniquement par les référents de leur domaine. La spécialité de Xebia-training repose donc sur 2 axes :</p>
                <ul>
                    <li><strong><a href="${technicalTrainingUrl}">Des formations techniques</a> approfondies</strong> autour de l’écosystème Java/J2EE sur des problématiques récurrentes mais trop souvent ignorées ou mal identifiées par les cellules de développement (le Software Craftmanship, problème d’optimisation de performance d’applications, amélioration de la qualité des développements, professionnalisation de la filière de production et d’exploitation, etc.)</li>
                    <li><strong><a href="${agileTrainingUrl}">Des formations certifiantes et non-certifiantes sur les méthodes agiles</a> (Scrum, xP et Lean)</strong>. Notre expérience nous enseigne que l’adoption des méthodes agiles n’est pas simple eu égard aux impacts culturels, techniques et organisationnels. Nous proposons donc des formations adaptées au niveau d’expérience, au rôle et à la langue de chaque participant.</li>
                </ul>
                <hr>
                <p>
                    Nos formations, savant équilibre entre théorie et travaux pratiques, sont destinées à un large public soucieux d’acquérir les meilleures pratiques de notre industrie.
                </p>
                <p>
                    Nous proposons également des formations en <a href="http://www.xebia.in/">Inde</a>, aux <a href="http://training.xebia.com/">Pays-Bas</a> et au <a href="http://training.xebia.co.uk/">Royaume Uni</a>.
                </p>

            </div>
        </div>

    </stripes:layout-component>

</stripes:layout-render>