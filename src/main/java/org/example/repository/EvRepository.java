package org.example.repository;

import org.example.model.Ev;

import java.util.ArrayList;
import java.util.List;

public class EvRepository implements IEvRepository{
    private List<Ev> evList=new ArrayList<>();

    public Ev save(Ev ev){
        evList.add(ev);
        return ev;
    }
    public List<Ev> findAll(){
        return evList;
    }


}