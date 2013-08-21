<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="stripes" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<stripes:layout-render name="/front/layouts/default.jsp"
                       pageTitle="Xebia Essentials"
                       navSection="about"
                       containerClass="page">

    <stripes:layout-component name="content">

        <div class="section">
            <div class="section-content">

                <div class="center">
                    <img class="essentials" src="/img/xebia-essentials.png" alt="xebia essentials principes" title="Xebia Essentials flash cards">
                </div>
                <p>
                    Un développement logiciel de qualité repose sur le respect et la bonne application d’un certain nombre de principes, bonnes pratiques ou « patterns ». Beaucoup de ces principes se rapportent à des aspects techniques et méthodologiques propres à notre métier de développeur tandis que d’autres dépassent largement ce cadre et touchent au bon sens, au pragmatisme, à la communication.
                </p>
                <p>Un développeur aguerri applique quotidiennement beaucoup de ces principes, souvent par automatisme et expérience, mais éprouve généralement une grande difficulté à les énoncer clairement, à les recenser de manière exhaustive et a fortiori à les partager avec ses pairs. Or c’est sur le partage, la transmission et l’application de ces bonnes pratiques que repose la progression d’une équipe et l’amélioration continue de la qualité du logiciel développé.</p>
                <p>Forts de ce constat, les consultants Xebia se sont posés comme défi d’extraire, trier et consolider ces bonnes pratiques, à partir de leurs expériences de terrain, dans le but de pouvoir les restituer sous forme synthétique puis de les partager entre eux et avec la communauté. Le fruit de 6 mois de ce travail de consolidation, que Xebia est fière de vous dévoiler aujourd’hui, se présente sous la forme d’un ensemble de « flash cards », baptisées Xebia Essentials.</p>
                <p>Concrètement, chacune de ces flash cards isole une bonne pratique ou un principe, énoncé de manière synthétique et facilement mémorisable sur son recto, détaillée au verso, et identifiée par un code couleur qui détermine le domaine auquel elle s’applique (code, architecture & design, test, process, état d’esprit …). Cerise sur le gâteau, chaque carte affiche un code-barres 2D qui permet, à partir d’un simple scan avec son téléphone mobile de retrouver une page web détaillée qui apporte des compléments sur le contenu de la carte elle-même (Voir la vidéo).</p>
                <p>Nous croyons que cette présentation sous forme de cartes, par son caractère pratique et ludique, est un formidable moyen de partager des pratiques de développement essentielles et de les mettre en application sur les projets.</p>
                <p>Ces flash cards, initialement destinées à nos consultants et aux équipes projet chez nos clients, sont finalement mise à disposition de la communauté à travers notre site.</p>
                <h2>Informations</h2>
                <ul>
                    <li><strong>Prix :</strong> 19,91 € PU TTC, les frais de port et la TVA sont directement inclus dans le prix de vente. Aucun surcoût ne sera demandé</li>
                    <li><strong>Délai :</strong> Envoi de la commande dès réception d’achat sous 10 à 15 jours ouvrables</li>
                    <li><strong>Echange ou remboursement :</strong> Nous n’acceptons aucun échange ni remboursement pour ce produit</li>
                </ul>
                <h2>Paiement en ligne</h2>
                <p>
                    Nous acceptons les paiements approvisionnés par carte bancaire (Plateforme sécurisé de paiement) et par solde PayPal.
                </p>
                <form target="paypal" action="https://www.paypal.com/cgi-bin/webscr" method="post">
                    <input type="hidden" name="cmd" value="_s-xclick"><br>
                    <input type="hidden" name="hosted_button_id" value="TESYTFSMXPV4J"><br>
                    <input type="image" src="https://www.paypalobjects.com/fr_FR/FR/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal - la solution de paiement en ligne la plus simple et la plus sécurisée !"><br>
                    <img alt="" border="0" src="https://www.paypalobjects.com/fr_FR/i/scr/pixel.gif" width="1" height="1"><br>
                </form>

            </div>
        </div>

    </stripes:layout-component>

</stripes:layout-render>