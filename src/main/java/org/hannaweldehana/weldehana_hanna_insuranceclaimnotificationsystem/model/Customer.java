package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "customer")  // Correct usage of the @Table annotation
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "customers") // One Customer has many Claims
    private List<Claim> claims = new ArrayList<>();

    // Lombok will generate getters, setters, and toString() for all fields.
}