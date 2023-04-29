create table if not exists `MEMBER`
(
    `member_id`                   bigint      not null primary key auto_increment,
    `login_id`                    varchar(20) not null,
    `login_pw`                    varchar(20) not null,
    `username`                    varchar(20) not null,
    `email`                       varchar(50) not null,
    `phone`                       varchar(13) not null,
    `birth`                       varchar(6)  not null,
    `gender`                      varchar(1)  not null,
    `nickname`                    varchar(10) not null,
    `nickname_last_modified_date` timestamp   not null default current_timestamp,
    `authority`                   varchar(10) not null default 'CLIENT',
    `created_date`                timestamp   not null default current_timestamp,
    `last_modified_date`          timestamp   not null default current_timestamp
);