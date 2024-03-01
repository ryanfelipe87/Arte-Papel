package com.org.artpapel.ecommerce.services;

import com.org.artpapel.ecommerce.dtos.ClientDto;
import com.org.artpapel.ecommerce.exceptions.NotFoundException;
import com.org.artpapel.ecommerce.models.Client;
import com.org.artpapel.ecommerce.repositories.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public ClientDto createClient(ClientDto clientDto){
        Client client = convertToEntity(clientDto);
        client = clientRepository.save(client);
        return convertToDto(client);
    }

    public List<ClientDto> listAllClients(){
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public ClientDto findClientById(Long id){
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Client not found with this ID: " + id));

        return convertToDto(client);
    }

    private ClientDto convertToDto(Client client){
        ClientDto clientDto = new ClientDto();
        BeanUtils.copyProperties(client, clientDto);
        clientDto.setId(client.getId());
        return clientDto;
    }

    private Client convertToEntity(ClientDto clientDto){
        Client client = new Client();
        BeanUtils.copyProperties(clientDto, client);
        return client;
    }
}
