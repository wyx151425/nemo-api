CREATE TABLE user
(
  id                  INT(11) AUTO_INCREMENT,
  object_id           VARCHAR(32),
  status              INT(1),
  create_at           DATETIME,
  update_at           DATETIME,

  name                VARCHAR(64),
  mobile_phone_number VARCHAR(11),
  password            VARCHAR(32),

  email               VARCHAR(64),
  motto               VARCHAR(256),
  profile             VARCHAR(1024),
  profession          VARCHAR(128),
  location            VARCHAR(128),

  gender              VARCHAR(16),
  birthday            VARCHAR(32),

  age                 INT(3),
  follow        INT(11),
  follower      INT(11) ,
  favorite      INT(11),
  book          INT(3),

  avatar         VARCHAR(256),
  portrait        VARCHAR(256),
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8;

CREATE TABLE book
(
  id           INT(11) AUTO_INCREMENT,
  object_id    VARCHAR(32),
  status       INT(1),
  create_at    DATETIME,
  update_at    DATETIME,

  author_id    INT(11),

  name         VARCHAR(64),
  style        VARCHAR(32),
  introduction TEXT,
  source   VARCHAR(256),
  cover    VARCHAR(256),

  page   INT(11) DEFAULT 0,
  favor  INT(11) DEFAULT 0,

  type         INT(1),
  publish         BOOLEAN,
  copyright    BOOLEAN,
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8;

CREATE TABLE page
(
  id        INT(11) AUTO_INCREMENT,
  object_id VARCHAR(32),
  status    INT(1),
  create_at DATETIME,
  update_at DATETIME,

  book_id   INT(11),
  image VARCHAR(256),
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8;