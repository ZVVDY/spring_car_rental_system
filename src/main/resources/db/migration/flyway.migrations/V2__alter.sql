alter table users add (
    person_id         int          ,
    FOREIGN KEY (person_id) REFERENCES person (id)
);

alter table person add (
    order_id      int         ,
    FOREIGN KEY (order_id) REFERENCES orders (id)
);

alter table cars add (
    person_id            int              ,
    car_status_id        int              ,
    FOREIGN KEY (person_id) REFERENCES person (id),
    FOREIGN KEY (car_status_id) REFERENCES car_status (id)
);

alter table orders add (
    car_id                       int              ,
    person_id            int              ,
    order_status_id            int              not null,
    payment_status_id            int              not null,
    FOREIGN KEY (person_id) REFERENCES person (id),
    FOREIGN KEY (car_id) REFERENCES cars (id),
    FOREIGN KEY (order_status_id) REFERENCES order_status (id),
    FOREIGN KEY (payment_status_id) REFERENCES payment_status (id)
);

alter table order_acceptance add (
    car_id                 int ,
    order_status_id            int              not null,
    FOREIGN KEY (car_id) REFERENCES cars (id),
    FOREIGN KEY (order_status_id) REFERENCES orders (id)
);
