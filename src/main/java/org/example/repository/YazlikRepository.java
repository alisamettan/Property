package org.example.repository;

import org.example.model.Yazlik;

import java.util.ArrayList;
import java.util.List;

public class YazlikRepository implements IYazlikRepository{

    private List<Yazlik> yazlikList=new ArrayList<>();
    @Override
    public Yazlik save(Yazlik yazlik) {
        yazlikList.add(yazlik);
        return yazlik;
    }

    @Override
    public List<Yazlik> findAll() {
        return yazlikList;
    }
}