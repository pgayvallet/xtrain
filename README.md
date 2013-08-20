xtrain
======

http://xtrain-2.pgayvallet.eu.cloudbees.net

bees config:set spring.profiles.active=cloudbees
bees config:set ENV_NAME=cloudbees
bees app:bind -a pgayvallet/xtrain-2 -db db-xtrain -as db-xtrain maxActive=5 maxIdle=2 maxWait=10000 removeAbandoned=true removeAbandonedTimeout=60 logAbandoned=true validationQuery="SELECT 1" testOnBorrow=true;
bees app:update


PAGES & FEATURES
================

- Upload
    - image & file upload (http://www.stripesframework.org/display/stripes/Storing+Files+with+Hibernate)

- Home
    - carousel
    - nos videos
    - listing catalogue
    - liens bulles "nos formations"

- Nav
    - brancher les liens restants
    - javascript ouverture menu L2 et L3
    - position du pointer

- Page Promo
    - ajout flag promo + prix promo sur modèle
    - table des promos
    - formulaire demande de devis

- Page Contact
    - branchement mailer (https://developer.cloudbees.com/bin/view/RUN/SendGrid)
    - DONE Section 1 (ou sommes nous)
    - DONE Section 3 (s'inscrire à une formation)

- Page About Us + Misc pages
    - A propos de nous
    - S'inscrire à une formation
    - Devenir Scrum Master
    - Xebia Essentials
    - Mentions légales
    - Conditions générales

- Page Categories Formateurs

- Page Formateur

- Page Categories de formations

- Page Formation

OTHER STUFF
===========

- spring config per environ (local / cloud)
- police ubuntu ?
- rewrite rules
- authent : move credentials to file or db
- sitemap.xml "dynamique"
- page 404
- regexp validation permalink
- messageSource & i18n (for bo ?)
- google analytics
- api jsonp (si besoin)
- wro4j config per environ ( use spring for config )
- DONE favicon
- DONE robots.txt
- DONE rename folder fo/bo to public / admin
- DONE exclusions wro4j pom

