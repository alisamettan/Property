package org.example.repository;

import org.example.model.Villa;

import java.util.List;

public interface IVillaRepository {
    Villa save(Villa villa);
    List<Villa> findAll();
}