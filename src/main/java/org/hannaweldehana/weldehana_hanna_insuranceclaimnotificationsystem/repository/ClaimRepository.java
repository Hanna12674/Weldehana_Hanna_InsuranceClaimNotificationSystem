package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.repository;

import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

    // Custom query to find claims by customer ID
    @Query("SELECT c FROM Claim c WHERE c.customer.id = :customerId")
    List<Claim> findClaimsByCustomerId(@Param("customerId") Long customerId);

    // Custom query to find claims by status (Updated to use "status" field)
    @Query("SELECT c FROM Claim c WHERE c.status = :claimStatus")
    List<Claim> findClaimsByStatus(@Param("claimStatus") String claimStatus);
}
