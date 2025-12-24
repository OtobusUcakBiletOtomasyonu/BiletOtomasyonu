package com.ilgo.ticketapp.observer;

import java.util.ArrayList;
import java.util.List;
public class BiletSubject {
    
    private final List<BiletObserver> gozlemciler = new ArrayList<>();
    public void gozlemciEkle(BiletObserver observer) {
        gozlemciler.add(observer);
    }
    public void gozlemciCikar(BiletObserver observer) {
        gozlemciler.remove(observer);
    }
    public void bildir(com.ilgo.ticketapp.entity.Bilet bilet, String eskiDurum, String yeniDurum) {
        for (BiletObserver observer : gozlemciler) {
            observer.biletDurumGuncellendi(bilet, eskiDurum, yeniDurum);
        }
    }
}




