
create table TS_TRAINING_CAT (
  id bigint not null auto_increment,
  permalink varchar(255) not null,
  title varchar(255) not null,
  type varchar(255) not null,
  blogCategory varchar(255),
  description longtext,
  metaDescription longtext,
  metaKeywords longtext,
  vimeoChannelId bigint,
  primary key (id)
);

create table XT_DB_FILE (
  id bigint not null auto_increment,
  content longblob,
  contentType varchar(255) not null,
  fileExtension varchar(255) not null,
  fileName varchar(255) not null,
  fileSize bigint not null,
  primary key (id)
);

create table XT_TRAINER (
  id bigint not null auto_increment,
  bio longtext,
  category varchar(255) not null,
  name varchar(255) not null,
  position integer,
  pictureFile_id bigint,
  primary key (id)
);

create table XT_TRAINING (
  id bigint not null auto_increment,
  permalink varchar(255) not null,
  presentation longtext,
  presentationSiteUrl varchar(255),
  priceInter varchar(30),
  priceIntra varchar(30),
  pricePromo varchar(30),
  program longtext,
  promo char(1) not null,
  title varchar(255) not null,
  category_id bigint not null,
  programFile_id bigint,
  trainer_id bigint not null,
  linkedInProductId bigint,
  metaDescription longtext,
  metaKeywords longtext,
  primary key (id)
);

alter table XT_TRAINER
add index FK17721E52D1B56FD0 (pictureFile_id),
add constraint FK17721E52D1B56FD0
foreign key (pictureFile_id)
references XT_DB_FILE (id);

alter table XT_TRAINING
add index FKD6D1BABD18BC752A (category_id),
add constraint FKD6D1BABD18BC752A
foreign key (category_id)
references TS_TRAINING_CAT (id);

alter table XT_TRAINING
add index FKD6D1BABD8298CBA4 (trainer_id),
add constraint FKD6D1BABD8298CBA4
foreign key (trainer_id)
references XT_TRAINER (id);

alter table XT_TRAINING
add index FKD6D1BABD8AA90B8A (programFile_id),
add constraint FKD6D1BABD8AA90B8A
foreign key (programFile_id)
references XT_DB_FILE (id);
