package com.example.demo.model.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"number", "id"})})
public class Carriage {

    @Id
    private String id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "route_to_train_time_table", nullable = false)
    private RouteToTrainTimeTable routeToTrainTimeTable;
}
