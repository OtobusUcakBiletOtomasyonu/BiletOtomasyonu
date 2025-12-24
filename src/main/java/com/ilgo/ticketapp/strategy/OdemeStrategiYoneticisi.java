package com.ilgo.ticketapp.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class OdemeStrategiYoneticisi {

    private final Map<String, OdemeStrategisi> stratejiler;

    public OdemeStrategiYoneticisi(List<OdemeStrategisi> stratejiListesi) {
        this.stratejiler = new HashMap<>();
        for (OdemeStrategisi strateji : stratejiListesi) {
            stratejiler.put(strateji.getOdemeTuru(), strateji);
        }
        
        System.out.println("[STRATEGY] " + stratejiler.size() + " ödeme stratejisi yüklendi");
    }

    public OdemeStrategisi getStrategi(String odemeTuru) {
        OdemeStrategisi strateji = stratejiler.get(odemeTuru.toUpperCase());
        
        if (strateji == null) {
            throw new RuntimeException("Geçersiz ödeme türü: " + odemeTuru);
        }
        
        return strateji;
    }
}




