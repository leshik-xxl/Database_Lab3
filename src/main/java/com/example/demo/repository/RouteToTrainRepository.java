package com.example.demo.repository;

import com.example.demo.model.domain.RouteToTrainTimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteToTrainRepository extends JpaRepository<RouteToTrainTimeTable, Long> {
}
