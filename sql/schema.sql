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

create table if not exists `ARTICLE`
(
    `article_id`         bigint        not null primary key auto_increment,
    `member_id`          bigint        not null,
    `title`              varchar(100)  not null,
    `content`            varchar(1000) not null,
    `hit`                int           not null default 0,
    `tag`                varchar(20)   not null,
    `created_date`       timestamp     not null default current_timestamp,
    `last_modified_date` timestamp     not null default current_timestamp,
    foreign key (`member_id`) references MEMBER (`member_id`)
);

create table if not exists `HOT_PLACE`
(
    `hot_place_id` bigint not null primary key auto_increment,
    `tag` varchar(20) not null,
    `title` varchar(50) not null,
    `content` varchar(500) not null,
    `hit` int not null default 0,
    `vote` int not null default 0,
    `visited_date` varchar(10) not null,
    `upload_file_name` varchar(255),
    `store_file_name` varchar(255),
    `member_id` bigint not null,
    `content_id` int not null,
    `created_date` timestamp not null default current_timestamp,
    `last_modified_date` timestamp not null default current_timestamp,
    foreign key (`member_id`) references MEMBER (`member_id`),
    foreign key (`content_id`) references ATTRACTION_INFO (`content_id`)
);