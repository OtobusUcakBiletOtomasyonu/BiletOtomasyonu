package bilet.otomasyon.model;

import bilet.otomasyon.model.Kullanici;
import bilet.otomasyon.enums.RaporTipi;
import java.util.Date;

public class Yonetici extends Kullanici {

    public Yonetici(String kullaniciID, String ad, String soyad, String email, String sifre) {
        super(kullaniciID, ad, soyad, email, sifre);
    }

    @Override
    public boolean girisYap(String email, String sifre) {
        return false;
    }

    @Override
    public void cikisYap() {
    }

    public void firmaYonetimi() {
     
    }

    public void kullaniciDenetle() {
     
    }

    public Rapor sistemRaporuAl(RaporTipi tip, Date aralik) {
       
        return null;
    }

    public void loglariIzle() {
       
    }
   
}