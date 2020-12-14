# create database accounting_test;
CREATE TABLE `qxz_userinfo`
(
    `id`          bigint unsigned NOT NULL AUTO_INCREMENT,
    `username`    varchar(64)     NOT NULL COMMENT 'user name',
    `password`    varchar(64)     NOT NULL,
    `salt`        varchar(50)     NOT NULL,
    `create_time` datetime        NOT NULL,
    `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY `pk_id` (`id`),
    UNIQUE KEY `uk_username` (`username`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = UTF8MB4;

INSERT qxz_userinfo value (NULL, 'admin', 'admin', '', NOW(), NULL);