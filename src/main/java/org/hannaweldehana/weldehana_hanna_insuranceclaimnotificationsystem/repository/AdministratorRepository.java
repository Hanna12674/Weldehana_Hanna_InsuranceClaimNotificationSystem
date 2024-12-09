package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.repository;

import org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdministratorRepository<AdministratorRole> extends JpaRepository<Administrator, Long> {
    // No custom queries needed for basic CRUD

 }
