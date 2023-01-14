package com.example.microserviceclient.mappers;

import com.example.microserviceclient.dto.ClientRequestDTO;
import com.example.microserviceclient.dto.ClientResponseDTO;
import com.example.microserviceclient.entities.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientResponseDTO clientToClientResponseDTO(Client client);
    Client ClientRequestDTOtoClient(ClientRequestDTO clientRequestDTO);

}
