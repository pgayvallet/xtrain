<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.front.ContactActionBean"/>

<stripes:layout-render name="/front/layouts/static_page.jsp"
                       pageTitle="Contact">

    <stripes:layout-component name="content">

        <div class="work-section section">
            <div class="section-content">

                <div class="work-map"></div>

                <div class="france">
                    <h3>Xebia France</h3>
                    <p>
                        <span><a href="http://goo.gl/maps/fY2yd" target="_blank">156 bd Haussmann - 75008 Paris</a></span>
                    </p>
                    <p class="padded">+33 (0)1 53 89 99 99</p>
                    <p class="padded">+33 (0)1 53 89 99 97</p>
                    <p class="padded">info@xebia.fr</p>
                    <p></p>
                </div>

                <div class="netherlands">
                    <div class="and">ET...</div>
                    <h3><a href="http://www.xebia.nl" target="_blank">Xebia Nederland</a></h3>
                    <span>
                      Utrechtseweg 49 - 1213 TL Hilversum Pays Bas
                    </span>
                </div>

                <div class="india">
                    <div class="and">ET...</div>
                    <h3><a href="http://www.xebia.in" target="_blank">Xebia India</a></h3>
                    <span>
                      612 BPTP Park Centra - Sector 30 - Gurgaon 122002 Haryana
                    </span>
                </div>

            </div>
        </div>

        <div class="contact-section section">
            <a name="contact"></a>
            <div class="section-content">
                <h2>Contactez-nous</h2>

                <div class="contact-illustration"></div>
                <div class="contact-pointer"></div>

                <form name="contact" class="contact-form" onsubmit="location='mailto:recrutement@xebia.fr?subject='+escape(this.title.value)+'&amp;body=Name:'+escape(this.name.value)+'%0D%0A'+'Email:'+escape(this.mail.value)+'%0D%0A'+'Viadeo / Linkedin:'+escape(this.profil.value)+'%0D%0A'+escape(this.message.value); return false">
                    <div class="message">
                        <label>Votre message</label>
                        <textarea name="message" tabindex="11"></textarea>
                    </div>

                    <div class="infos">
                        <label>Votre nom</label><input type="text" name="title" required tabindex="7">
                        <label>Votre email</label><input type="text" name="name" required tabindex="8">
                        <label>Votre société</label><input type="email" name="mail" required tabindex="9">
                    </div>
                    <input type="submit" value="Envoyer" class="send" tabindex="12">
                </form>
            </div>
        </div>

        <div class="subscribe-section section">
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