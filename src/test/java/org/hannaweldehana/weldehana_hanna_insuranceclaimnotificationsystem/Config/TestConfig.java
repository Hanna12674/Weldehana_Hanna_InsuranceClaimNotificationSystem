package org.hannaweldehana.weldehana_hanna_insuranceclaimnotificationsystem.Config;

import org.apache.catalina.Service;
import org.aspectj.apache.bcel.Repository;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class TestConfig {

    // Example for a mocked repository or service
    @Bean
    @Primary
    public <SomeRepository> SomeRepository someRepository() {
        return (SomeRepository) Mockito.mock(Repository.class);
    }

    @Bean
    @Primary
    public <SomeService> SomeService someService() {
        return (SomeService) Mockito.mock(Service.class);
    }
}

