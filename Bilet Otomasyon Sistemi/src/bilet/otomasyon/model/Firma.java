package bilet.otomasyon.model;

import bilet.otomasyon.enums.RaporTipi;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class Firma {
    private String firmaID;
    private String ad;
    private List<Sefer> seferListesi;

    public Firma(String firmaID, String ad) {
        this.firmaID = firmaID;
        this.ad = ad;
        this.seferListesi = new ArrayList<>();
    }
    public void seferEkle(Sefer sefer) {
        this.seferListesi.add(sefer);
    }

    public void seferGuncelle(Sefer sefer) {

    }

    public Rapor raporGoruntule(RaporTipi tip, Date aralik) {
        return null;
    }
}