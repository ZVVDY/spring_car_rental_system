insert into payment_status (id, status_payment)
VALUES (1, 'unpaid'),
       (2, 'paid'),
       (3, 'failed'),
       (4, 'expired'),
       (5, 'refunding'),
       (6, 'refunded');

INSERT INTO car_status (id, status)
VALUES (1, 'not used'),
       (2, 'used'),
       (3, 'damaged');

INSERT INTO order_status (id, status)
VALUES (1, 'new'),
       (2, 'in progress'),
       (3, 'completed'),
       (4, 'rejected');

INSERT INTO person (id, date_registration, first_name, surname, date_of_birth, email, phone_number,
                    money_on_the_account, order_id)
VALUES (1, '2023-04-14', 'Vladimir', 'Zayats', '2023-01-01', '1232@mail.ru', '3753364757', null, null),
       (2, '2023-04-14', 'Alex', 'Dobrov', '2011-01-15', '53254@mail.ru', '3752968666', null, null),
       (3, '2023-04-14', 'Fedor', 'Solovey', '1989-03-12', '45689@mail.ru', '37529753423', null, null);

INSERT INTO users (id, account_non_expired, account_non_locked, credentials_non_expired, enabled, password, username,
                   person_id)
VALUES (1, 1, 1, 1, 1, 'admin', 'Admin', 1),
       (2, 1, 1, 1, 1, 'alex2612', 'Alex', 2),
       (3, 1, 1, 1, 1, '12345', 'Fedor', 3);


INSERT INTO cars (id, model, cost_renting_one_day, car_status_id)
VALUES (1, 'VW Polo New, 1.6, Automatic transmission, Black, 2022', 16.70, null),
       (2, 'Skoda Rapid, 1.4, Automatic transmission, Black, 2021', 16.70, null),
       (3, 'VW Polo New, 1.6, Automatic transmission, Black, 2021', 16.70, null),
       (4, 'Geely Atlas Pro, 1.5, Automatic transmission, Grey, 2021', 20.50, null),
       (5, 'Geely Tugella, 1.6, Automatic transmission, White, 2021', 23.70, null);

INSERT INTO user_roles (id, roles)
VALUES (1, 'ROLE_ADMIN'),
       (2, 'ROLE_USER');