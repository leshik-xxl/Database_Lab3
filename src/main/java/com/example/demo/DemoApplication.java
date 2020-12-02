package com.example.demo;

import com.example.demo.repository.CarriageRepository;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.PlaceRepository;
import com.example.demo.repository.TicketRepository;
import com.example.demo.sevice.CarriageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final ClientRepository clientRepository;
    private final TicketRepository ticketRepository;
    private final PlaceRepository placeRepository;
    private final CarriageRepository carriageRepository;

    public DemoApplication(ClientRepository clientRepository, TicketRepository ticketRepository, PlaceRepository placeRepository, CarriageRepository carriageRepository) {
        this.clientRepository = clientRepository;
        this.ticketRepository = ticketRepository;
        this.placeRepository = placeRepository;
        this.carriageRepository = carriageRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {


    }
}
