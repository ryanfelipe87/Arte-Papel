package com.org.artpapel.ecommerce.services;

import com.org.artpapel.ecommerce.dtos.ClientDto;
import com.org.artpapel.ecommerce.models.Client;
import com.org.artpapel.ecommerce.repositories.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
