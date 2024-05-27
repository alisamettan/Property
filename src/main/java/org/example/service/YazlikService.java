package org.example.service;

import org.example.model.Yazlik;
import org.example.repository.YazlikRepository;

import java.util.List;

public class YazlikService {

    private YazlikRepository yazlikRepository;

    public YazlikService(YazlikRepository yazlikRepository) {
        this.yazlikRepository = yazlikRepository;
    }

    public Yazlik save(Yazlik yazlik){
        return yazlikRepository.save(yazlik);
    }

    public List<Yazlik> findAll(){
        return yazlikRepository.findAll();
    }

    public Double getTotalPrice(){
        return yazlikRepository.findAll().stream()
                .mapToDouble(Yazlik::getPrice)
                .sum();
    }

    public Double getAverageSquareMeter(){
        return yazlikRepository.findAll().stream()
                .mapToDouble(Yazlik::getSquare)
                .average()
                .orElse(0);
    }
}