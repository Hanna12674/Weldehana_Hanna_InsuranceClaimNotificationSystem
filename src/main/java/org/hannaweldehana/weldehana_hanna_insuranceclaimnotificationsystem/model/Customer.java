package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
@Entity // Marks this as a JPA entity
@Table(name = "customer") // Maps this class to the "customer" table
public class Customer {

    // Getters and setters
    @Id // Marks this as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // The ID field

    @Column(nullable = false, unique = true)
    private String username; // The "username" column

     @Column(nullable = false)
    private String password; // The "password" column

    @Column(nullable = false, unique = true)
    private String email; // The "email" column

    @Column
    private String name; // The "name" column

    @Column
    private String phone; // The "phone" column

    @Column
    private String status; // The "status" column

    // One Customer can have many Claims
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Claim> claims; // Maps to the "customer" field in Claim

    // Default (no-args) constructor
    public Customer() {}

    // All-arguments constructor
    public Customer(String username, String password, String email, String name, String phone, String status) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.status = status;
    }
    // Constructor
    public Customer(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
