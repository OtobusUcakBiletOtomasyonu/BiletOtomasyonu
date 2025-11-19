package bilet.otomasyon.model;

import java.util.List;
import java.util.ArrayList;

public class Yolcu extends Kullanici {
    private List<Bilet> biletGecmisi; 
    private String iletisimNumarasi;

    public Yolcu(String kullaniciID, String ad, String soyad, String email, String sifre, String iletisimNumarasi) {
        super(kullaniciID, ad, soyad, email, sifre);
        this.iletisimNumarasi = iletisimNumarasi;
        this.biletGecmisi = new ArrayList<>();
    }

    @Override
    public boolean girisYap(String email, String sifre) {
        return false;
    }

    @Override
    public void cikisYap() {
    }

    public Bilet biletSatinAl(Sefer sefer, String koltukNo, Odeme odeme) {
        return null;
    }

    public boolean biletIptalEt(String biletID) {
        
        return false;
    }
}
