package com.example.demo.sevice;

import com.example.demo.model.domain.Carriage;
import com.example.demo.model.domain.Route;
import com.example.demo.repository.RouteRepository;
import org.springframework.stereotype.Service;

@Service
public class RouteService {
    private final RouteRepository routeRepository;

    public RouteService(RouteRepository routeRepository){
        this.routeRepository = routeRepository;
    }

    public void add(Route route){
        routeRepository.saveAndFlush(route);
    }

    public Route findById(Long id) throws Exception {
        return routeRepository.findById(id).orElseThrow(() -> new Exception("Не существует записи с данным id - " + id));
    }
}
