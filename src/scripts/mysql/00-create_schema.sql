
create table TS_TRAINER_CAT (
    id bigint not null auto_increment,
    permalink varchar(255) not null,
    position integer,
    title varchar(255) not null,
    primary key (id)
);

create table TS_TRAINING_CAT (
    id bigint not null auto_increment,
    permalink varchar(255) not null,
    title varchar(255) not null,
    type varchar(255) not null,
    primary key (id)
);

create table XT_TRAINER (
    id bigint not null auto_increment,
    bio longtext,
    name varchar(255) not null,
    permalink varchar(255) not null,
    category_id bigint not null,
    pictureFile_id bigint,
    primary key (id)
);

create table XT_TRAINING (
    id bigint not null auto_increment,
    permalink varchar(255) not null,
    presentation longtext,
    program longtext,
    title varchar(255) not null,
    category_id bigint not null,
    primary key (id)
);

create table XT_DB_FILE (
    id bigint not null auto_increment,
    content longblob,
    contentType varchar(255) not null,
    fileName varchar(255) not null,
    fileExtension varchar(255) not null,
    fileSize bigint not null,
    primary key (id)
);

alter table XT_TRAINER
    add index FK17721E52CA24CCD9 (category_id),
    add constraint FK17721E52CA24CCD9
    foreign key (category_id)
    references TS_TRAINER_CAT (id);

alter table XT_TRAINING
    add index FKD6D1BABD18BC752A (category_id),
    add constraint FKD6D1BABD18BC752A
    foreign key (category_id)
    references TS_TRAINING_CAT (id);

 alter table XT_TRAINER
    add index FK17721E52D1B56FD0 (pictureFile_id),
    add constraint FK17721E52D1B56FD0
    foreign key (pictureFile_id)
    references XT_DB_FILE (id);