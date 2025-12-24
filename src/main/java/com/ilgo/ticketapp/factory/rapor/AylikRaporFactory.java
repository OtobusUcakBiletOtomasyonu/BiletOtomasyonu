package com.ilgo.ticketapp.factory.rapor;

import com.ilgo.ticketapp.entity.Rapor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AylikRaporFactory implements RaporFactory {

    @Override
    public Rapor raporOlustur(int raporId, Date tarih, String icerik) {
        String aylikIcerik = "=== AYLIK RAPOR ===\n" +
                            "Ay: " + new java.text.SimpleDateFormat("yyyy-MM").format(tarih) + "\n" +
                            "İçerik: " + icerik + "\n" +
                            "Rapor Tipi: Aylık\n" +
                            "Özet: Bu ay içindeki tüm işlemler";
        
        Rapor rapor = new Rapor();
        rapor.setRaporId(raporId);
        rapor.setTarih(tarih);
        rapor.setIcerik(aylikIcerik);
        
        System.out.println("[FACTORY] Aylık rapor oluşturuldu: " + raporId);
        return rapor;
    }
}




