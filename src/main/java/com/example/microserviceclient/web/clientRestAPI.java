package com.example.microserviceclient.web;

import com.example.microserviceclient.dto.ClientRequestDTO;
import com.example.microserviceclient.dto.ClientResponseDTO;
import com.example.microserviceclient.entities.Client;
import com.example.microserviceclient.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class clientRestAPI {

    private ClientService clientService;

    public clientRestAPI(ClientService clientService) {

        this.clientService = clientService;
    }

    @GetMapping(path = "/clients")
    public List<ClientResponseDTO> allClients(){

        return clientService.listClients();
    }

    @GetMapping(path = "/clients/{id}")
    public ClientResponseDTO getClient(@PathVariable int id) {

        return clientService.getClient(id);
    }
    @PostMapping(path = "/add")
    public ClientResponseDTO save(@RequestBody  ClientRequestDTO clientRequestDTO) {
        return clientService.save(clientRequestDTO);
    }
    @PutMapping(path = "/update/{id}")
    public ClientResponseDTO update(@PathVariable int id,@RequestBody  ClientRequestDTO clientRequestDTO) {
        clientRequestDTO.setId(id);

        return clientService.update(clientRequestDTO);
    }
    @DeleteMapping (path = "/delete/{id}")
    public void deleteClient(@PathVariable int id) {

        clientService.deletec(id);
    }
}
