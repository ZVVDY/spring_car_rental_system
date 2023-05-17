package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "date_registration")
    private LocalDate dateOfRegistration;
    @Enumerated(EnumType.STRING)
    @Column(name = "role_user")
    private RolePerson role;
    @JoinColumn(name = "person_id")
    @OneToOne
    private Person person;
}
