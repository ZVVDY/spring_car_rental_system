insert into payment_status (id, status_payment)
VALUES (1, 'unpaid'),
       (2, 'paid'),
       (3, 'failed'),
       (4, 'expired'),
       (5, 'refunding'),
       (6, 'refunded');

INSERT INTO car_status (id, status_car)
VALUES (1, 'not used'),
       (2, 'used'),
       (3, 'damaged');

INSERT INTO order_status (id, status_order)
VALUES (1, 'new'),
       (2, 'in progress'),
       (3, 'completed'),
       (4, 'rejected');

INSERT INTO user (id, account_non_expired, account_non_locked, credentials_non_expired, enabled, password, username)
VALUES (1, 1, 1, 1, 1, '$2y$10$L7AAfmokOYe1SzwWS2RHweBWaR9CjRQb/y4nHWAixzgZeJdr5lN4i', 'Admin'),
       (2, 1, 1, 1, 1, '$2y$10$fCyhI5gFX/Fp/eF2jhDK1uL7Pzpv98.Br4/G24.AMUzDj.5BsZ4Li', 'Alex'),
       (3, 1, 1, 1, 1, '$2y$10$fjNyAa3CodbTiKoRAX38x..RH98nyeN7BRCGcNHZcCLcfzXgNdngm', 'qwe');

INSERT INTO person (id, date_registration, first_name, surname, date_of_birth, email, passport_number, phone_number, driver_license_number,
                    date_of_issue_driver_license,driving_experience,money_on_the_account, order_id, user_id)
VALUES (1, '2023-04-14', 'Vladimir', 'Zayats', '2000-01-01', '1232@mail.ru','HF4564647', '3753364757', 'AD123456','2018-10-03',4.0,0.0, null,1),
       (2, '2023-04-14', 'Alex', 'Dobrov', '1988-01-15', '53254@mail.ru','NF575577', '3752968666', 'AS123456','2015-09-03',8.0,0.0, null,2),
       (3, '2023-04-14', 'Fedor', 'Solovey', '1989-03-12', '45689@mail.ru','FR424244', '37529753423', 'FR123456','2019-05-03',4.0,0.0, null,3);

INSERT INTO cars (id, model, cost_renting_one_day, car_status_id)
VALUES (1, 'VW Polo New, 1.6, Automatic transmission, Black, 2022', 16.70, 1),
       (2, 'Skoda Rapid, 1.4, Automatic transmission, Black, 2021', 16.70, 1),
       (3, 'Kia-Rio-X-line, 1.6, Automatic transmission, Silver, 2021', 16.70, 1),
       (4, 'Geely Atlas Pro, 1.5, Automatic transmission, Grey, 2021', 20.50, 1),
       (5, 'Geely Tugella, 1.6, Automatic transmission, White, 2021', 23.70, 1);

INSERT INTO user_roles (user_id, roles)
VALUES (1, 'ROLE_ADMIN'),
       (2, 'ROLE_USER'),
       (3, 'ROLE_USER');