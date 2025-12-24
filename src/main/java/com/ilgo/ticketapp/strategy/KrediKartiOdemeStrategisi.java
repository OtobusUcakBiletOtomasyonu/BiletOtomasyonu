package com.ilgo.ticketapp.strategy;

import com.ilgo.ticketapp.config.IdGenerator;
import com.ilgo.ticketapp.entity.Odeme;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Strategy Pattern - Kredi Kartı ödeme stratejisi
 * Kredi kartı ile ödeme işlemlerini gerçekleştirir
 */
@Component
public class KrediKartiOdemeStrategisi implements OdemeStrategisi {

    private final IdGenerator idGenerator;

    public KrediKartiOdemeStrategisi(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public Odeme odemeYap(double tutar, String biletId) {
        // Kredi kartı ödeme işlemi simülasyonu
        System.out.println("[STRATEGY] Kredi kartı ile ödeme yapılıyor: " + tutar + " TL");
        
        // Kredi kartı doğrulama işlemleri burada yapılabilir
        boolean odemeBasarili = validateKrediKarti(tutar);
        
        Odeme odeme = new Odeme();
        odeme.setId(idGenerator.generateId());
        odeme.setBiletId(biletId);
        odeme.setTutar(tutar);
        odeme.setTarih(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        odeme.setOdemeTuru("KREDI_KARTI");
        odeme.setSonuc(odemeBasarili ? "BASARILI" : "BASARISIZ");
        
        if (!odemeBasarili) {
            throw new RuntimeException("Kredi kartı ödemesi başarısız!");
        }
        
        return odeme;
    }

    @Override
    public String getOdemeTuru() {
        return "KREDI_KARTI";
    }

    private boolean validateKrediKarti(double tutar) {
        // Kredi kartı doğrulama mantığı
        // Gerçek uygulamada banka API'si çağrılır
        return tutar > 0; // Basit validasyon
    }
}




