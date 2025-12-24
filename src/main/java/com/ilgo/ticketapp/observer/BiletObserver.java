package com.ilgo.ticketapp.observer;

import com.ilgo.ticketapp.entity.Bilet;

/**
 * Observer Pattern - Bilet durumu değişikliklerini dinleyen gözlemci interface
 * Bilet durumu değiştiğinde bildirim alır
 */
public interface BiletObserver {
    
    /**
     * Bilet durumu değiştiğinde çağrılır
     * @param bilet Durumu değişen bilet
     * @param eskiDurum Önceki durum
     * @param yeniDurum Yeni durum
     */
    void biletDurumGuncellendi(Bilet bilet, String eskiDurum, String yeniDurum);
}




