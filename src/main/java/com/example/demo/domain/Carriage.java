package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Carriage {

    @Id
    private String id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = false)
    private Integer routeToTrainTimeTable;
}
