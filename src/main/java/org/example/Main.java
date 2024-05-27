package org.example;



import org.example.initialization.DataLoader;
import org.example.model.Ev;
import org.example.repository.EvRepository;
import org.example.repository.VillaRepository;
import org.example.repository.YazlikRepository;
import org.example.service.AllTypesService;
import org.example.service.EvService;
import org.example.service.VillaService;
import org.example.service.YazlikService;

public class Main {
    public static void main(String[] args) {

        EvService evService=new EvService(new EvRepository());
        VillaService villaService=new VillaService(new VillaRepository());
        YazlikService yazlikService=new YazlikService(new YazlikRepository());
        AllTypesService allTypesService=new AllTypesService(evService,villaService,yazlikService);

        DataLoader loader=new DataLoader(evService,villaService,yazlikService);


       /* System.out.println(evService.findAll());
        System.out.println("-----------------------------------");
        System.out.println(villaService.findAll());
        System.out.println("-----------------------------------");
        System.out.println(yazlikService.findAll());*/


        System.out.println("Evlerin Toplam fiyatı: "+evService.getTotalPrice());
        System.out.println("Villaların Toplam fiyatı: "+villaService.getTotalPrice());
        System.out.println("Yazlıkların Toplam fiyatı: "+yazlikService.getTotalPrice());
        System.out.println("Tüm tipteki evlerin toplam fiyatı: "+allTypesService.getTotalPrice());
        System.out.println("Evlerin ortalama metrekaresi: "+evService.getAverageSquareMeter());
        System.out.println("Villaların ortalama metrekaresi: "+villaService.getAverageSquareMeter());
        System.out.println("Yazlıkların ortalama metrekaresi: "+yazlikService.getAverageSquareMeter());
        System.out.println("Tüm tipteki evlerin ortalama metrekaresi: "+allTypesService.getAverageSquareMeter());
        System.out.println("Oda ve salon sayısına göre tüm tipteki evler: "+allTypesService.filterAllEvTypesByRoomAndLivingRoomCount(3,1));



    }
}