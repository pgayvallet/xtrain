xtrain
======

http://xtrain-2.pgayvallet.eu.cloudbees.net

bees config:set spring.profiles.active=cloudbees
bees config:set ENV_NAME=cloudbees
bees app:bind -a pgayvallet/xtrain-2 -db db-xtrain -as db-xtrain maxActive=5 maxIdle=2 maxWait=10000 removeAbandoned=true removeAbandonedTimeout=60 logAbandoned=true validationQuery="SELECT 1" testOnBorrow=true;
bees app:update


PAGES & FEATURES
================

- Training dates
    - add date(s) to training

- Training Tables
    - brancher dataTables

- Home
    - carousel
    - liens bulles "nos formations"

- Nav
    - cleanup position l3 + add border

- Page Promo
    - affichage prix promo dans la table
    - formulaire demande de devis (?)

- Page Contact
    - branchement mailer (https://developer.cloudbees.com/bin/view/RUN/SendGrid)

- Page Formateur
    - défilement carousel

- Page type de formation
    - nettoyage table

- Page Categories de formations
    - excerpt pour les formations
    - image du header ( pictureFile )

- Page Formation
    - 3 types de header (image,video,none)
    - lien site externe
    - lien fichier pdf
    - lien s'inscrire
    - affichage prix
    - affichage dates

OTHER STUFF
===========

- spring profile -> jndi db pour le cloud
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

