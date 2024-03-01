package com.org.artpapel.ecommerce.controllers;

import com.org.artpapel.ecommerce.dtos.ClientDto;
import com.org.artpapel.ecommerce.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientDto> save(@RequestBody ClientDto clientDto){
        clientService.createClient(clientDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<ClientDto> listAll(){
        return clientService.listAllClients();
    }

    @GetMapping(path = "/{id}")
    public ClientDto getClientById(@PathVariable Long id){
        return clientService.findClientById(id);
    }
}
