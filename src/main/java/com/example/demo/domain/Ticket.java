package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToOne
    @JoinColumn(name = "place_id", nullable = false, unique = true)
    private Place place;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Timestamp buyDate;

    @Column(nullable = false)
    private Boolean privilege;
}
