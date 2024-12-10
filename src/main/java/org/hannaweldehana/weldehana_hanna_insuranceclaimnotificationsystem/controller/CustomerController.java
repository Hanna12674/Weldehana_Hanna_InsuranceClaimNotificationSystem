package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.controller;

import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model.Customer;
import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.repository.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Handle customer login
    @PostMapping("/customers/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model, HttpSession session) {
        // Find the customer by username
        Customer customer = customerRepository.findByUsername(username);

        // Check if the customer exists and the password matches
        if (customer != null && customer.getPassword().equals(password)) {
            // Create a session for the customer
            session.setAttribute("customer", customer); // Store the customer object in the session
            return "redirect:/home"; // Redirect to a home page after successful login
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login"; // Return to the login page if credentials are incorrect
        }
    }

    // Handle customer logout
    @GetMapping("/customers/logout")
    public String logout(HttpSession session) {
        // Invalidate the session to log out the user
        session.invalidate();
        return "redirect:/login"; // Redirect to the login page after logout
    }

    // Handle customer sign-up
    @PostMapping("/customers/signup")
    public String signUp(@RequestParam String username,
                         @RequestParam String password,
                         @RequestParam String email,
                         Model model) {
        // Check if the username already exists
        if (customerRepository.findByUsername(username) != null) {
            model.addAttribute("error", "Username already taken. Please try another.");
            return "signup"; // Return to the sign-up page if username is taken
        }

        // Save the new customer to the database
        Customer customer = new Customer(username, password, email);
        customerRepository.save(customer);

        model.addAttribute("message", "Sign-up successful! Please log in.");
        return "login"; // Redirect to the login page after successful sign-up
    }
}


