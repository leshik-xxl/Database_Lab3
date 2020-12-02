package com.example.demo.sevice;

import com.example.demo.model.domain.Carriage;
import com.example.demo.repository.ClientRepository;
import com.example.demo.model.domain.Client;
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

    public Client findById(Long id) throws Exception {
        return clientRepository.findById(id).orElseThrow(() -> new Exception("Не существует записи с данным id - " + id));
    }
}
