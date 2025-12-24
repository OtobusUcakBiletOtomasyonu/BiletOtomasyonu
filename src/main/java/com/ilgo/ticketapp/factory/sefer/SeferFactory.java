package com.ilgo.ticketapp.factory.sefer;

import com.ilgo.ticketapp.entity.Sefer;

import java.util.Date;

public abstract class SeferFactory {

    public Sefer createSefer(String id,

            String kalkis,

            String varis,

            String tarih,

            String saat,

            double fiyat) {


        if (kalkis == null || kalkis.isEmpty())

            throw new RuntimeException("Kalkış yeri boş olamaz!");

        if (varis == null || varis.isEmpty())

            throw new RuntimeException("Varış yeri boş olamaz!");

        if (fiyat <= 0)

            throw new RuntimeException("Fiyat 0 veya negatif olamaz!");

       

        Sefer sefer = buildSefer(id, kalkis, varis, tarih, saat, fiyat);

        System.out.println("[FACTORY] Yeni sefer oluşturuldu: " +

                sefer.getKalkisYeri() + " → " + sefer.getVarisYeri());

        return sefer;

    }

    protected abstract Sefer buildSefer(String id,

            String kalkis,

            String varis,

            String tarih,

            String saat,

            double fiyat);

}
