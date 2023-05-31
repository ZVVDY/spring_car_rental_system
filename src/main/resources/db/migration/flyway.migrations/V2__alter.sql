alter table person add (
    order_id      int   default null,
    FOREIGN KEY (order_id) REFERENCES orders (id)
);

alter table cars add (
    car_status_id        int    default null,
    FOREIGN KEY (car_status_id) REFERENCES car_status (id)
);

alter table orders add (
    car_id                       int    default null,
    person_id            int       default null,
    order_status_id            int              default null,
    payment_status_id            int              default null,
    FOREIGN KEY (person_id) REFERENCES person (id),
    FOREIGN KEY (car_id) REFERENCES cars (id),
    FOREIGN KEY (order_status_id) REFERENCES order_status (id),
    FOREIGN KEY (payment_status_id) REFERENCES payment_status (id)
);

alter table order_acceptance add (
    order_id            int              default null,
    type_of_damage_car_id            int              default null,
    FOREIGN KEY (order_id) REFERENCES orders (id),
    FOREIGN KEY (type_of_damage_car_id) REFERENCES type_of_damage_car (id)
);
