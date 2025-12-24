package com.ilgo.ticketapp.service.impl;

import com.ilgo.ticketapp.entity.Rapor;
import com.ilgo.ticketapp.factory.rapor.RaporFactory;
import com.ilgo.ticketapp.repository.RaporRepository;
import com.ilgo.ticketapp.service.RaporService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RaporServiceImpl implements RaporService {

    private final RaporRepository raporRepository;
    private final Map<String, RaporFactory> raporFactoryMap;

    public RaporServiceImpl(RaporRepository repo, List<RaporFactory> factories) {
        this.raporRepository = repo;
        this.raporFactoryMap = new HashMap<>();
        
        for (RaporFactory factory : factories) {
            String tip = factory.getClass().getSimpleName()
                    .replace("Factory", "")
                    .replace("Rapor", "")
                    .toUpperCase();
            raporFactoryMap.put(tip, factory);
        }
        
        System.out.println("[FACTORY] " + raporFactoryMap.size() + " rapor factory yüklendi");
    }

    @Override
    public Rapor raporOlustur(String icerik) {
        return raporOlustur("GUNLUK", icerik);
    }

    public Rapor raporOlustur(String raporTipi, String icerik) {
        int id = raporRepository.findAll().size() + 1;
        
        RaporFactory factory = raporFactoryMap.get(raporTipi.toUpperCase());
        if (factory == null) {
            throw new RuntimeException("Geçersiz rapor tipi: " + raporTipi);
        }
        
        Rapor r = factory.raporOlustur(id, new Date(), icerik);
        raporRepository.save(r);
        
        return r;
    }

    @Override

    public List<Rapor> tumRaporlar() {

        return raporRepository.findAll();

    }

    @Override

    public Rapor raporGetir(int id) {

        return raporRepository.findById(id);

    }

}

