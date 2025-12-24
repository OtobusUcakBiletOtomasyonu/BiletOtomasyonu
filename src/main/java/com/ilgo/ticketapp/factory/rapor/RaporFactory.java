package com.ilgo.ticketapp.factory.rapor;

import com.ilgo.ticketapp.entity.Rapor;

import java.util.Date;

public interface RaporFactory {
    Rapor raporOlustur(int raporId, Date tarih, String icerik);
}




