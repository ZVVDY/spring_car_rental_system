create table payment_status
(
    id             int         not null auto_increment,
    status_payment varchar(80) not null,
    primary key (id)
);

create table car_status
(
    id         int          not null auto_increment,
    car_status varchar(256) not null,
    primary key (id)
);

create table order_status
(
    id           int          not null auto_increment,
    order_status varchar(256) not null,
    primary key (id)
);

CREATE TABLE user
(
    id                      bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    account_non_expired     bit(1) NOT NULL,
    account_non_locked      bit(1) NOT NULL,
    credentials_non_expired bit(1) NOT NULL,
    enabled                 bit(1) NOT NULL,
    password                varchar(256) DEFAULT NULL,
    username                varchar(256) DEFAULT NULL
);

CREATE TABLE user_roles
(
    user_id bigint NOT NULL PRIMARY KEY,
    roles   varchar(255) DEFAULT NULL,
    FOREIGN KEY (user_id) REFERENCES user (id)
);

create table person
(
    id                   int          not null auto_increment,
    date_registration    timestamp    not null,
    first_name           varchar(256) not null,
    surname              varchar(256) not null,
    date_of_birth        timestamp    not null,
    email                varchar(256) not null,
    phone_number         varchar(256) not null,
    money_on_the_account double precision,
    user_id              bigint       NOT NULL,
    primary key (id),
    FOREIGN KEY (user_id) REFERENCES user (id)
);

create table cars
(
    id                   int              not null auto_increment,
    model                varchar(256)     not null,
    cost_renting_one_day double precision not null,
    primary key (id)
);

create table orders
(
    id                           int              not null auto_increment,
    passport_number              varchar(256)     not null,
    rental_start_date            timestamp        not null,
    rental_end_date              timestamp        not null,
    driver_license_number        varchar(256)     not null,
    date_of_issue_driver_license timestamp        not null,
    driving_experience           double precision not null,
    order_amount                 double precision not null,
    primary key (id)
);

create table order_acceptance
(
    id                     int not null auto_increment,
    presence_of_damage_car bit,
    cost_of_car_repair     double precision,
    primary key (id)
);

create table type_of_damage_car
(
    id                 int not null auto_increment,
    type_of_damage     varchar(256),
    cost_of_car_repair double precision,
    message            varchar(256) DEFAULT NULL,
    primary key (id)
);


