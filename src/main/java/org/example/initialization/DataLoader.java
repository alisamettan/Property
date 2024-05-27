package org.example.initialization;

import org.example.model.Ev;
import org.example.model.Villa;
import org.example.model.Yazlik;
import org.example.repository.EvRepository;
import org.example.repository.VillaRepository;
import org.example.repository.YazlikRepository;
import org.example.service.EvService;
import org.example.service.VillaService;
import org.example.service.YazlikService;

public class DataLoader {
    private final EvService evService;
    private final VillaService villaService;
    private final YazlikService yazlikService;


    public DataLoader(EvService evService, VillaService villaService, YazlikService yazlikService) {
        this.evService = evService;
        this.villaService = villaService;
        this.yazlikService = yazlikService;
        loadData();
    }

    private void loadData(){
        evService.save(new Ev("Adres1",2,1,250000.0,136.0));
        evService.save(new Ev("Adres2", 3, 1, 300000.0, 150.0));
        evService.save(new Ev("Adres3", 4, 2, 400000.0, 180.0));
        evService.save(new Ev("Adres4", 2, 1, 200000.0, 100.0));
        evService.save(new Ev("Adres5", 3, 2, 350000.0, 160.0));


        villaService.save(new Villa("Adres1",5,2,500000.0,200.0,true));
        villaService.save(new Villa("Adres2",3,3,550000.0,250.0,false));
        villaService.save(new Villa("Adres3",5,1,700000.0,350.0,true));
        villaService.save(new Villa("Adres4",9,2,800000.0,600.0,false));
        villaService.save(new Villa("Adres5",6,7,670000.0,450.0,true));

        yazlikService.save(new Yazlik("Adres1",3,1,200000.0,125.0,false));
        yazlikService.save(new Yazlik("Adres2",4,2,300000.0,100.0,true));
        yazlikService.save(new Yazlik("Adres3",5,1,150000.0,200.0,false));
        yazlikService.save(new Yazlik("Adres4",6,4,500000.0,250.0,true));
        yazlikService.save(new Yazlik("Adres5",7,3,250000.0,175.0,false));
    }



}