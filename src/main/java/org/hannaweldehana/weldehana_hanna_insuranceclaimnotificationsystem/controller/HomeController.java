package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "index";  // Refers to index.html
    }
}
