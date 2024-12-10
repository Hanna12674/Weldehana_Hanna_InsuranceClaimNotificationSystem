package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "claims") // Ensure this matches your database table name
public class Claim {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Maps to "id" column

    @Column(name = "claim_number", nullable = false, unique = true)
    private String claimNumber; // Maps to "claim_number" column

    @Column(name = "description", length = 500)
    private String description; // Maps to "description" column

    @Column(name = "status", nullable = false)
    private String status; // Maps to "status" column

    @ManyToOne // Many Claims can belong to one Customer
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer; // Maps to "customer_id" column (foreign key)

    @Column(name = "submitted_at", nullable = false)
    private LocalDateTime submittedAt; // Maps to "submitted_at" column

    @Column(name = "updated_at")
    private LocalDateTime updatedAt; // Maps to "updated_at" column

    // Default constructor
    public Claim() {
    }

    // Parameterized constructor
    public Claim(String claimNumber, String description, String status, Customer customer, LocalDateTime submittedAt) {
        this.claimNumber = claimNumber;
        this.description = description;
        this.status = status;
        this.customer = customer;
        this.submittedAt = submittedAt;
        this.updatedAt = null; // Optional: set to null initially
    }

    public Claim(String claimNumber, String description, double amount, String pending) {
        this.claimNumber = claimNumber;
        this.description = description;

    }

    private String claimStatus;

}