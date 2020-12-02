package com.example.demo.sevice;

import com.example.demo.model.domain.Carriage;
import com.example.demo.model.domain.Ticket;
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

    public Ticket findById(Long id) throws Exception {
        return ticketRepository.findById(id).orElseThrow(() -> new Exception("Не существует записи с данным id - " + id));
    }
}
