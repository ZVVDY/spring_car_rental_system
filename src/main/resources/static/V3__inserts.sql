insert into payment_status (id, status_payment)
VALUES (1, 'unpaid'),
       (2, 'paid'),
       (3, 'failed'),
       (4, 'expired'),
       (5, 'refunding'),
       (6, 'refunded');

INSERT INTO  car_status (id,status)
VALUES
(1, 'not used'),
(2, 'used'),
(3, 'damaged');

INSERT INTO order_status (id,status)
    VALUES
        (1, 'new'),
        (2, 'in progress'),
        (3, 'completed'),
        (4, 'rejected');

INSERT INTO  users (id,login,password,date_registration,role_user,person_id)
VALUES
    (1,'Admin','administrator',18/04/23, ADMINISTRATOR,1),
    (2,'Alex','alex2612',18/04/23, CLIENT,2),
    (3,'Fedor','12345',18/04/23, CLIENT,3);

INSERT INTO person (id,first_name, surname, date_of_birth, email, phone_number)
    VALUES
        (1,'Vladimir', 'Zayats', 01/01/01, '1232@mail.ru','3753364757'),
        (2,'Alex', 'Dobrov', 15/01/01, '53254@mail.ru','3752968666'),
        (3,'Fedor', 'Solovey', 23/03/89, '45689@mail.ru','375297534236');

INSERT INTO cars (id,model, cost_renting_one_day, person_id, car_status_id)
    VALUES
        (1, 'VW Polo New, 1.6, Automatic transmission, Black, 2022', 16.70,,1),
        (2, 'Skoda Rapid, 1.4, Automatic transmission, Black, 2021', 16.70,,1),
        (3, 'VW Polo New, 1.6, Automatic transmission, Black, 2021', 16.70,,1),
        (4, 'VW Polo New, 1.6, Automatic transmission, Black, 2021', 16.70,,1),
        (5, 'VW Polo New, 1.6, Automatic transmission, Black, 2021', 16.70,,1),

(
                      int              not null auto_increment,
                    varchar(256)     not null,
    surname              varchar(256)     not null,
     double precision not null,
    email                varchar(256)     not null,
    phone_number         varchar(256)     not null,
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
    type_of_damage_car     varchar(256),
    cost_of_car_repair     double precision,
    primary key (id)
);
