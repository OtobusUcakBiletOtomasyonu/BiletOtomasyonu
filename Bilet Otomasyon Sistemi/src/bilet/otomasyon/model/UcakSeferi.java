package bilet.otomasyon.model;

import bilet.otomasyon.model.Sefer;
import java.util.Date;
import java.util.List;


public class UcakSeferi extends Sefer {
    private String ucakModeli;

    
    public UcakSeferi(int seferID, String kalkisYeri, String varisYeri, Date tarih, String saat, double fiyat, List<Koltuk> koltukListesi, String ucakModeli) {
        super(seferID, kalkisYeri, varisYeri, tarih, saat, fiyat, koltukListesi);
        this.ucakModeli = ucakModeli;
    }

    @Override
    public void bilgiGoster() {
  
        System.out.println("Uçak Modeli: " + this.ucakModeli);
       
    }

    @Override
    public void koltukDurumuGoster() {

    }
    

    public String getUcakModeli() {
        return ucakModeli;
    }
}