package bilet.otomasyon.model;

import bilet.otomasyon.model.Sefer;
import bilet.otomasyon.model.Bilet;
import bilet.otomasyon.model.Yolcu;
import java.util.Date;

public class Rezervasyon {
    private int rezervasyonID;
    private String durum;
    private Date olusturmaZamani;
    private Sefer sefer;
    private Yolcu yolcu;

    public Rezervasyon(int rezervasyonID, Sefer sefer, Yolcu yolcu) {
        this.rezervasyonID = rezervasyonID;
        this.sefer = sefer;
        this.yolcu = yolcu;
        this.durum = "Beklemede";
        this.olusturmaZamani = new Date();
    }
    public void iptalEt() {
    }

    public Bilet onayla() {

        return null;
    }
}