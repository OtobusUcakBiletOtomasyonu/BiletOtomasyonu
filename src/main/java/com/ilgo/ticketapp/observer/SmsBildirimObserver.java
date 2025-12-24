package com.ilgo.ticketapp.observer;

import com.ilgo.ticketapp.entity.Bilet;
import org.springframework.stereotype.Component;
@Component
public class SmsBildirimObserver implements BiletObserver {

    @Override
    public void biletDurumGuncellendi(Bilet bilet, String eskiDurum, String yeniDurum) {
        String telefon = "5XX XXX XX XX";
        
        if (yeniDurum.equals("AKTIF")) {
            System.out.println("[OBSERVER] SMS gönderiliyor: " + telefon);
            System.out.println("  Mesaj: Biletiniz oluşturuldu. Bilet No: " + bilet.getId());
        } else if (yeniDurum.equals("IPTAL")) {
            System.out.println("[OBSERVER] SMS gönderiliyor: " + telefon);
            System.out.println("  Mesaj: Biletiniz iptal edildi. Bilet No: " + bilet.getId());
        }
    }
}




