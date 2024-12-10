package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.controller;

import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model.Claim;
import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.repository.ClaimRepository;
import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClaimController {

    private final ClaimRepository claimRepository;

    public ClaimController(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    // Handle claim submission
    @PostMapping("/claims/submit")
    public String submitClaim(@RequestParam String claimNumber,
                              @RequestParam String description,
                              @RequestParam double amount) {
        // Handle saving the claim
        Claim claim = new Claim(claimNumber, description, amount, "Pending");
        // Save claim to the database
        claimRepository.save(claim);
        return "redirect:/claims";  // Redirect to claims list
    }

    // Handle claim update
    @PostMapping("/claims/update")
    public String updateClaim(@RequestParam Long claimId) {
        //placeholder
        return "redirect:/claims";
    }

    // Handle claim withdrawal
    @PostMapping("/claims/withdraw")
    public String withdrawClaim(@RequestParam Long claimId) {
        //placeholder
        return "redirect:/claims";
    }

    // Handle changing claim status (Admin)
    @PostMapping("/claims/status")
    public String changeClaimStatus(@RequestParam Long claimId, @RequestParam String claimStatus) {
        // placeholder
        return "redirect:/claims";
    }
}
