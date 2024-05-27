package org.example.service;

import org.example.model.Villa;
import org.example.repository.VillaRepository;

import java.util.List;

public class VillaService {
    private VillaRepository villaRepository;

    public VillaService(VillaRepository villaRepository) {
        this.villaRepository = villaRepository;
    }

    public Villa save(Villa villa){
        return villaRepository.save(villa);
    }

    public List<Villa> findAll(){
        return villaRepository.findAll();
    }

    public Double getTotalPrice(){
        return villaRepository.findAll().stream()
                .mapToDouble(Villa::getPrice)
                .sum();
    }

    public Double getAverageSquareMeter(){
        return villaRepository.findAll().stream()
                .mapToDouble(Villa::getSquare)
                .average()
                .orElse(0);
    }
}