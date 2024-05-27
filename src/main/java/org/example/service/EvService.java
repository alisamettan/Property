package org.example.service;

import org.example.model.Ev;
import org.example.repository.EvRepository;

import java.util.List;

public class EvService {
    private EvRepository evRepository;

    public EvService(EvRepository evRepository) {
        this.evRepository = evRepository;
    }

    public List<Ev> findAll(){
        return evRepository.findAll();
    }

    public Ev save(Ev ev){
        return evRepository.save(ev);
    }

    public Double getTotalPrice(){
        return evRepository.findAll().stream()
                .mapToDouble(Ev::getPrice)
                .sum();
    }

    public Double getAverageSquareMeter(){
        return evRepository.findAll().stream()
                .mapToDouble(Ev::getSquare)
                .average()
                .orElse(0);
    }
}
