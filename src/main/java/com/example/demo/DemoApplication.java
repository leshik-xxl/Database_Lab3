package com.example.demo;

import com.example.demo.domain.Place;
import com.example.demo.domain.Ticket;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.PlaceRepository;
import com.example.demo.repository.TicketRepository;
import com.example.demo.domain.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.sql.Timestamp;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final ClientRepository clientRepository;
	private final TicketRepository ticketRepository;
	private final PlaceRepository placeRepository;

	public DemoApplication(ClientRepository clientRepository, TicketRepository ticketRepository, PlaceRepository placeRepository) {
		this.clientRepository = clientRepository;
		this.ticketRepository = ticketRepository;
		this.placeRepository = placeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client client = new Client();
		client.setLogin("login");
		client.setEMail("emial");
		client.setFullName("fillmnme");
		clientRepository.saveAndFlush(client);

		Place place = new Place();
		place.setCarriage("car");
		place.setNumber(1);
		placeRepository.saveAndFlush(place);

		Ticket ticket = new Ticket();
		ticket.setClient(client);
		ticket.setPlace(place);
		ticket.setBuyDate(Timestamp.valueOf("2020-02-12 00:00:00"));
		ticket.setPrice(BigDecimal.valueOf(200.0));
		ticket.setPrivilege(true);
		ticketRepository.saveAndFlush(ticket);
		System.out.println(ticketRepository.findAll());
	}
}
