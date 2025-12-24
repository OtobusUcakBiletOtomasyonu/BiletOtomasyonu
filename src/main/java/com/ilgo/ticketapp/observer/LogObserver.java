package com.ilgo.ticketapp.observer;

import com.ilgo.ticketapp.entity.Bilet;
import org.springframework.stereotype.Component;
@Component
public class LogObserver implements BiletObserver {

    @Override
    public void biletDurumGuncellendi(Bilet bilet, String eskiDurum, String yeniDurum) {
        System.out.println("[OBSERVER] LOG: Bilet durumu değişti");
        System.out.println("  Bilet ID: " + bilet.getId());
        System.out.println("  Yolcu: " + bilet.getYolcu().getAdSoyad());
        System.out.println("  Eski Durum: " + eskiDurum);
        System.out.println("  Yeni Durum: " + yeniDurum);
        System.out.println("  Tarih: " + bilet.getTarih());
    }
}




