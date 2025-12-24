package bilet.otomasyon.model;

import bilet.otomasyon.model.Kullanici;
import bilet.otomasyon.model.Firma;
import bilet.otomasyon.model.Yolcu;
import java.util.Date;

public class FirmaCalisani extends Kullanici {
    private Firma calistigiFirma;

    public FirmaCalisani(String kullaniciID, String ad, String soyad, String email, String sifre, Firma calistigiFirma) {
        super(kullaniciID, ad, soyad, email, sifre);
        this.calistigiFirma = calistigiFirma;
    }

    @Override
    public boolean girisYap(String email, String sifre) {
        return false;
    }

    @Override
    public void cikisYap() {
    }

    public void seferEkle(Sefer sefer) {
  
    }

    public void seferGuncelle(Sefer sefer) {

    }

    public Rapor satisDurumuGor(String seferID) {
     
        return null;
    }

    public void yolcuBilgilendir(Yolcu yolcu) {
    
    }
 
}