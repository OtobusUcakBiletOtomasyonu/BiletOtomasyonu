package com.ilgo.ticketapp.factory.rapor;

import com.ilgo.ticketapp.entity.Rapor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SatisRaporuFactory implements RaporFactory {

    @Override
    public Rapor raporOlustur(int raporId, Date tarih, String icerik) {
        String satisIcerik = "=== SATIŞ RAPORU ===\n" +
                            "Tarih: " + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tarih) + "\n" +
                            "İçerik: " + icerik + "\n" +
                            "Rapor Tipi: Satış\n" +
                            "Detay: Bilet satışları ve gelir analizi";
        
        Rapor rapor = new Rapor();
        rapor.setRaporId(raporId);
        rapor.setTarih(tarih);
        rapor.setIcerik(satisIcerik);
        
        System.out.println("[FACTORY] Satış raporu oluşturuldu: " + raporId);
        return rapor;
    }
}




