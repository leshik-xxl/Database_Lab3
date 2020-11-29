package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Train {

    @Id
    private String idTrain;

    @Column(nullable = false)
    private Integer maxCarriage;
}
