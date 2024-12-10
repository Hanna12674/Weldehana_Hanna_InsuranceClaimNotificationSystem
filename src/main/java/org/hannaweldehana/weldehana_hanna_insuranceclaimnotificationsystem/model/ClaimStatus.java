package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "claimstatus")
public class ClaimStatus {

    @Id
    private Long id;
    private String status;

    // Constructors
    public ClaimStatus() {}

    public ClaimStatus(Long id, String status) {
        this.id = id;
        this.status = status;
    }
    // Lombok will generate getters, setters, and toString() for all fields.
}
