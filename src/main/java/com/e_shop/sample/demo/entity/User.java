package com.e_shop.sample.demo.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fullName;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role{
        ROLE_ADMIN,
        ROLE_CUSTOMER
    }
    public User(String email, String password, String fullName, Role role){
        this.email = email;
        this.password = password;
        this.fullName = fullName;
                this.role = role;
    }

}
