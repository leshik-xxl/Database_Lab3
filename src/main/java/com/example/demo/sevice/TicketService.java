package com.example.demo.sevice;

import com.example.demo.domain.Ticket;
import com.example.demo.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public void add(Ticket ticket){
        ticketRepository.saveAndFlush(ticket);
    }
}
