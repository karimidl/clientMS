package com.example.microserviceclient.services;

import com.example.microserviceclient.dto.ClientRequestDTO;
import com.example.microserviceclient.dto.ClientResponseDTO;
import com.example.microserviceclient.entities.Client;
import com.example.microserviceclient.mappers.ClientMapper;
import com.example.microserviceclient.repositories.ClientRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;
    private ClientMapper clientMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    @Override
    public ClientResponseDTO save(ClientRequestDTO clientRequestDTO) {

        Client client=clientMapper.ClientRequestDTOtoClient(clientRequestDTO);
        Client savedClient=clientRepository.save(client);
        ClientResponseDTO clientResponseDTO=clientMapper.clientToClientResponseDTO(savedClient);

        return clientResponseDTO;
    }

    @Override
    public ClientResponseDTO update(ClientRequestDTO clientRequestDTO) {
        //Client clie=clientRepository.findById(id).get();
        Client client=clientMapper.ClientRequestDTOtoClient(clientRequestDTO);
        Client updatedClient=clientRepository.save(client);
        ClientResponseDTO clientResponseDTO=clientMapper.clientToClientResponseDTO(updatedClient);
        return clientResponseDTO;
    }

    @Override
    public void deletec(int id) {
        clientRepository.deleteById(id);
    }

    @Override
    public ClientResponseDTO getClient(int id) {

        Client client=clientRepository.findById(id).get();

        return clientMapper.clientToClientResponseDTO(client);
    }
    @Override
    public List<ClientResponseDTO> listClients() {

        List<Client> clients=clientRepository.findAll();
        List<ClientResponseDTO> clientResponseDTOS=
                clients.stream()
                                .map(clt->clientMapper.clientToClientResponseDTO(clt))
                                .collect(Collectors.toList());
        return clientResponseDTOS;
    }
}
