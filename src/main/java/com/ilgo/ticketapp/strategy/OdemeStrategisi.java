package com.ilgo.ticketapp.strategy;

import com.ilgo.ticketapp.entity.Odeme;


public interface OdemeStrategisi {

    Odeme odemeYap(double tutar, String biletId);

    String getOdemeTuru();
}




