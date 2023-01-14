package com.example.microserviceclient.services;

import com.example.microserviceclient.dto.ClientRequestDTO;
import com.example.microserviceclient.dto.ClientResponseDTO;

import java.util.List;

public interface ClientService {

    ClientResponseDTO save (ClientRequestDTO clientRequestDTO);
    ClientResponseDTO getClient(int id);
    ClientResponseDTO update (ClientRequestDTO clientRequestDTO);
    void deletec(int id);
    List<ClientResponseDTO> listClients();
}
