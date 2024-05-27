package org.example.repository;

import org.example.model.Yazlik;

import java.util.List;

public interface IYazlikRepository {
    Yazlik save(Yazlik yazlik);
    List<Yazlik> findAll();
}