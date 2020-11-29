package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Timestamp;

public class RouteToTrainTimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer route;
private final static int lock = 2;

    @Column(nullable = false)
    private String train;

    @Column(nullable = false)
    private Timestamp arriveTime;

    @Column(nullable = false)
    private Timestamp departTime;
}
