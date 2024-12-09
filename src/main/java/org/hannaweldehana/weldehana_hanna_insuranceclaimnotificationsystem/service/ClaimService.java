package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.service;

import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model.Claim;
import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Notification;
import java.util.List;
import java.util.Optional;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    // Create or Update a Claim
    public Claim saveClaim(Claim claim) {
        return claimRepository.save(claim);
    }

    // Get all Claims
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    // Get Claim by ID
    public Optional<Claim> getClaimById(Long id) {
        return claimRepository.findById(id);
    }

    // Delete Claim by ID
    public void deleteClaim(Long id) {
        claimRepository.deleteById(id);
    }
}



