package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.controller;

import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.repository.ClaimRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    private final ClaimRepository claimRepository;

    public ThymeleafController(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    @GetMapping("/claims")
    public String viewClaims(Model model) {
        model.addAttribute("claims", claimRepository.findAll());
        return "claims";
    }
}
