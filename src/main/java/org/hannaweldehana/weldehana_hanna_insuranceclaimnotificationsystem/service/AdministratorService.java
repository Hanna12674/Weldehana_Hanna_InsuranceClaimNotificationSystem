package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.service;

import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model.Administrator;
import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    // Create or Update Administrator
    public Administrator saveAdministrator(Administrator administrator) {
        return (Administrator) administratorRepository.save(administrator);
    }

    // Get All Administrators
    public List<Administrator> getAllAdministrators() {
        return administratorRepository.findAll();
    }

    // Get Administrator by ID
    public Optional<Administrator> getAdministratorById(Long id) {
        return administratorRepository.findById(id);
    }

    // Delete Administrator by ID
    public void deleteAdministrator(Long id) {
        administratorRepository.deleteById(id);
    }
}
