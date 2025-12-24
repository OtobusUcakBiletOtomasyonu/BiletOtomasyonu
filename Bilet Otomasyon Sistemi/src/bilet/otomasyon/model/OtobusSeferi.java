package bilet.otomasyon.model;

import bilet.otomasyon.model.Sefer;
import java.util.Date;
import java.util.List;


public class OtobusSeferi extends Sefer {
    private boolean ikramDurumu;


    public OtobusSeferi(int seferID, String kalkisYeri, String varisYeri, Date tarih, String saat, double fiyat, List<Koltuk> koltukListesi, boolean ikramDurumu) {
        super(seferID, kalkisYeri, varisYeri, tarih, saat, fiyat, koltukListesi);
        this.ikramDurumu = ikramDurumu;
    }

    @Override
    public void bilgiGoster() {

        System.out.println("İkram Durumu: " + (this.ikramDurumu ? "Var" : "Yok"));

    }

    @Override
    public void koltukDurumuGoster() {

    }
    
    public boolean isIkramDurumu() {
        return ikramDurumu;
    }
}