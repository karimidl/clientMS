package com.example.microserviceclient;

import com.example.microserviceclient.dto.ClientRequestDTO;
import com.example.microserviceclient.services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroServiceClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroServiceClientApplication.class, args);
    }

//    @Bean
//    CommandLineRunner start(ClientService clientService){
//        return args -> {
//          clientService.save(new ClientRequestDTO("nom1","ville1","prenom1",66666,"email1"))  ;
//          clientService.save(new ClientRequestDTO(2,"nom2","ville2","prenom2",777777,"email2"))  ;
//        };
//    }
}
