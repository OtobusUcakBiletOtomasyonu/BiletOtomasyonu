package com.ilgo.ticketapp.strategy;

import com.ilgo.ticketapp.config.IdGenerator;
import com.ilgo.ticketapp.entity.Odeme;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class HavaleOdemeStrategisi implements OdemeStrategisi {

    private final IdGenerator idGenerator;

    public HavaleOdemeStrategisi(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public Odeme odemeYap(double tutar, String biletId) {

        System.out.println("[STRATEGY] Havale ile ödeme yapılıyor: " + tutar + " TL");
        boolean odemeBasarili = validateHavale(tutar);
        
        Odeme odeme = new Odeme();
        odeme.setId(idGenerator.generateId());
        odeme.setBiletId(biletId);
        odeme.setTutar(tutar);
        odeme.setTarih(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        odeme.setOdemeTuru("HAVALE");
        odeme.setSonuc(odemeBasarili ? "BASARILI" : "BEKLEMEDE");
        if (tutar > 10000) {
            odeme.setSonuc("BEKLEMEDE");
            System.out.println("[STRATEGY] Büyük tutarlı havale onay bekliyor");
        }
        
        return odeme;
    }

    @Override
    public String getOdemeTuru() {
        return "HAVALE";
    }

    private boolean validateHavale(double tutar) {
        return tutar > 0;
    }
}




