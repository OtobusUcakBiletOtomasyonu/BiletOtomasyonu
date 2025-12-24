package com.ilgo.ticketapp.service.impl;

import com.ilgo.ticketapp.entity.Odeme;
import com.ilgo.ticketapp.repository.OdemeRepository;
import com.ilgo.ticketapp.service.OdemeService;
import com.ilgo.ticketapp.strategy.OdemeStrategiYoneticisi;
import com.ilgo.ticketapp.strategy.OdemeStrategisi;
import org.springframework.stereotype.Service;

/**
 * Ödeme servisi - Strategy Pattern kullanarak farklı ödeme yöntemlerini yönetir
 */
@Service
public class OdemeServiceImpl implements OdemeService {

    private final OdemeRepository repository;
    private final OdemeStrategiYoneticisi stratejiYoneticisi;

    public OdemeServiceImpl(OdemeRepository repository, OdemeStrategiYoneticisi stratejiYoneticisi) {
        this.repository = repository;
        this.stratejiYoneticisi = stratejiYoneticisi;
    }

    @Override
    public Odeme odemeYap(String biletId, double tutar, String odemeTuru) {
        // ----------------------
        // STRATEGY PATTERN: Ödeme stratejisini seç ve kullan
        // ----------------------
        OdemeStrategisi strateji = stratejiYoneticisi.getStrategi(odemeTuru);
        Odeme odeme = strateji.odemeYap(tutar, biletId);

        repository.save(odeme);

        return odeme;
    }

    @Override
    public Odeme getir(String id) {
        return repository.findById(id);
    }
}
