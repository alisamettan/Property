package org.example.repository;

import org.example.model.Ev;

import java.util.List;

public interface IEvRepository {
    Ev save(Ev ev);
    List<Ev> findAll();
}
