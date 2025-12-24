package com.ilgo.ticketapp.observer;

import com.ilgo.ticketapp.entity.Bilet;
import org.springframework.stereotype.Component;
@Component
public class EmailBildirimObserver implements BiletObserver {

    @Override
    public void biletDurumGuncellendi(Bilet bilet, String eskiDurum, String yeniDurum) {
        String email = bilet.getYolcu().getEmail();
        
        if (yeniDurum.equals("AKTIF")) {
            System.out.println("[OBSERVER] Email gönderiliyor: " + email);
            System.out.println("  Konu: Biletiniz Oluşturuldu");
            System.out.println("  İçerik: Sayın " + bilet.getYolcu().getAdSoyad() + 
                             ", " + bilet.getId() + " numaralı biletiniz oluşturulmuştur.");
        } else if (yeniDurum.equals("IPTAL")) {
            System.out.println("[OBSERVER] Email gönderiliyor: " + email);
            System.out.println("  Konu: Biletiniz İptal Edildi");
            System.out.println("  İçerik: Sayın " + bilet.getYolcu().getAdSoyad() + 
                             ", " + bilet.getId() + " numaralı biletiniz iptal edilmiştir.");
        }
    }
}




