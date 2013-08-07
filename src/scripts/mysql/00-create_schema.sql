

 create table TS_TRAINING_CAT (
      id bigint not null auto_increment,
      title varchar(255) not null,
      url varchar(255) not null,
      primary key (id)
  );

  create table XT_TRAINER (
      id bigint not null auto_increment,
      bio longtext,
      firstName varchar(255) not null,
      lastName varchar(255) not null,
      primary key (id)
  );

  create table XT_TRAINING (
      id bigint not null auto_increment,
      presentation longtext,
      program longtext,
      title varchar(255) not null,
      url varchar(255) not null,
      primary key (id)
  );
