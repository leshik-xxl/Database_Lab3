package com.example.demo.sevice;

import com.example.demo.repository.ClientRepository;
import com.example.demo.domain.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void add(Client client) {
        clientRepository.saveAndFlush(client);
    }
}
