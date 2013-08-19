<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:useActionBean var="actionBean" beanclass="fr.xebia.training.actions.front.ContactActionBean"/>

<stripes:layout-render name="/front/layouts/static_page.jsp"
                       pageTitle="Contact">

    <stripes:layout-component name="content">

        <div class="section">
            <div class="section-content">
                <h2>Ou sommes nous ?</h2>

                <p>
                    TODO
                </p>

            </div>
        </div>

        <div class="section contact-section">
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

        <div class="section">
            <div class="section-content">
                <h2>S'inscrire à une formation</h2>

                <p>
                    TODO
                </p>

            </div>
        </div>

    </stripes:layout-component>
</stripes:layout-render>