package org.example.service;

import org.example.model.Ev;
import org.example.model.Villa;
import org.example.model.Yazlik;

import java.util.List;
import java.util.stream.Collectors;

public class AllTypesService {
    private EvService evService;
    private VillaService villaService;
    private YazlikService yazlikService;

    public AllTypesService(EvService evService, VillaService villaService, YazlikService yazlikService) {
        this.evService = evService;
        this.villaService = villaService;
        this.yazlikService = yazlikService;
    }

    public Double getTotalPrice(){
        double evTotalPrice=evService.getTotalPrice();
        double villaTotalPrice= villaService.getTotalPrice();
        double yazlikTotalPrice= yazlikService.getTotalPrice();

        return evTotalPrice+villaTotalPrice+yazlikTotalPrice;
    }

    public Double getAverageSquareMeter(){
        double evAverageSquare= evService.findAll().stream().mapToDouble(Ev::getSquare).sum();
        double villaAverageSquare=villaService.findAll().stream().mapToDouble(Villa::getSquare).sum();
        double yazlikAverageSquare= yazlikService.findAll().stream().mapToDouble(Yazlik::getSquare).sum();

        int totalEvCount = evService.findAll().size();
        int totalVillaCount = villaService.findAll().size();
        int totalYazlikCount = yazlikService.findAll().size();

        int totalCount = totalEvCount + totalVillaCount + totalYazlikCount;
        double totalSquareMeter = evAverageSquare + villaAverageSquare + yazlikAverageSquare;

        return totalSquareMeter/totalCount;
    }

    public List<Ev> filterAllEvTypesByRoomAndLivingRoomCount(int roomCount,int livingRoomCount){
        List<Ev> evList=evService.findAll();
        evList.addAll(villaService.findAll());
        evList.addAll(yazlikService.findAll());

        return evList.stream()
                .filter(e->e.getRoomCount()==roomCount && e.getLivingRoomCount()==livingRoomCount)
                .collect(Collectors.toList());
    }
}
