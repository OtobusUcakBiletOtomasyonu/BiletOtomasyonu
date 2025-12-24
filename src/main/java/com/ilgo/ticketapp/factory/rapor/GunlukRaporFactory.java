package com.ilgo.ticketapp.factory.rapor;

import com.ilgo.ticketapp.entity.Rapor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class GunlukRaporFactory implements RaporFactory {

    @Override
    public Rapor raporOlustur(int raporId, Date tarih, String icerik) {
        String gunlukIcerik = "=== GÜNLÜ RAPOR ===\n" +
                              "Tarih: " + new java.text.SimpleDateFormat("yyyy-MM-dd").format(tarih) + "\n" +
                              "İçerik: " + icerik + "\n" +
                              "Rapor Tipi: Günlük";
        
        Rapor rapor = new Rapor();
        rapor.setRaporId(raporId);
        rapor.setTarih(tarih);
        rapor.setIcerik(gunlukIcerik);
        
        System.out.println("[FACTORY] Günlük rapor oluşturuldu: " + raporId);
        return rapor;
    }
}




