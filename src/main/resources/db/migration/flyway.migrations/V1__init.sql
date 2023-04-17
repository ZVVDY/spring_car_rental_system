create table car_status
(
    id     int          not null auto_increment,
    status varchar(256) not null,
    primary key (id)
);

create table order_status
(
    id     int          not null auto_increment,
    status varchar(256) not null,
    primary key (id)
);


create table users
(
    id                int          not null auto_increment,
    login             varchar(256) not null,
    password          varchar(256) not null,
    date_registration timestamp    not null,
    role              varchar(256) not null,
    primary key (id),
    FOREIGN KEY (person_id) REFERENCES person (id)
);

create table person
(
    id            int          not null auto_increment,
    first_name    varchar(256) not null,
    surname       varchar(256) not null,
    date_of_birth timestamp    not null,
    email         varchar(256) not null,
    phone_number  varchar(256) not null,
    primary key (id),
    FOREIGN KEY (order_id) REFERENCES orders (id)
);

create table cars
(
    id                   int              not null auto_increment,
    model                varchar(256)     not null,
    surname              varchar(256)     not null,
    cost_renting_one_day double precision not null,
    email                varchar(256)     not null,
    phone_number         varchar(256)     not null,
    primary key (id),
    FOREIGN KEY (person_id) REFERENCES person (id),
    FOREIGN KEY (car_status_id) REFERENCES car_status (id)
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
    primary key (id),
    FOREIGN KEY (person_id) REFERENCES person (id),
    FOREIGN KEY (car_id) REFERENCES cars (id)
);

create table order_acceptance
(
    id                     int not null auto_increment,
    presence_of_damage_car bit,
    type_of_damage_car     varchar(256),
    cost_of_car_repair     double precision,
    primary key (id),
    FOREIGN KEY (car_id) REFERENCES cars (id)
);


