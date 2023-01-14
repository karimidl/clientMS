package com.example.microserviceclient.repositories;

import com.example.microserviceclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
