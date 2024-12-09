package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@Setter
@ToString

@Entity /* Hibernate will automatically manage the relationship
         and queries for these entities */

@Table(name = "claim")  // Correct usage of the @Table annotation
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String claimNumber;
    private String description;
    private String claimStatus;

    @ManyToOne // Many Claims can belong to one Customer
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDateTime submittedAt;
    private LocalDateTime updatedAt;

    // Lombok will generate getters, setters, and toString() for all fields.
}