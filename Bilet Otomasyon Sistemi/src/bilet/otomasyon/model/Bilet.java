package bilet.otomasyon.model;

import bilet.otomasyon.model.Yolcu;
import bilet.otomasyon.enums.BiletDurumu;

public class Bilet {
    private int biletID;
    private double fiyat;
    private BiletDurumu durum;
    private Sefer sefer;
    private Rezervasyon rezervasyon;
    private Yolcu yolcu; 

    public Bilet(int biletID, Sefer sefer, Rezervasyon rezervasyon, double fiyat, BiletDurumu durum, Yolcu yolcu) {
        this.biletID = biletID;
        this.sefer = sefer;
        this.rezervasyon = rezervasyon;
        this.fiyat = fiyat;
        this.durum = durum;
        this.yolcu = yolcu;
    }

}