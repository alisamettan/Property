package org.example.repository;

import org.example.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements IVillaRepository{
    private List<Villa> villaList=new ArrayList<>();
    @Override
    public Villa save(Villa villa) {
        villaList.add(villa);
        return villa;
    }

    @Override
    public List<Villa> findAll() {
        return villaList;
    }
}