package bilet.otomasyon.model;

import java.util.Date;
import java.util.List;

public abstract class Sefer {
    protected int seferID;
    protected String kalkisYeri;
    protected String varisYeri;
    protected Date tarih;
    protected String saat;
    protected double fiyat;
    protected List<Koltuk> koltukListesi;

    public Sefer(int seferID, String kalkisYeri, String varisYeri, Date tarih, String saat, double fiyat, List<Koltuk> koltukListesi) {
        this.seferID = seferID;
        this.kalkisYeri = kalkisYeri;
        this.varisYeri = varisYeri;
        this.tarih = tarih;
        this.saat = saat;
        this.fiyat = fiyat;
        this.koltukListesi = koltukListesi;
    }

    public abstract void bilgiGoster();
    public abstract void koltukDurumuGoster();

    // =============== Getter Metotları ==================
    // Bu metotlar, DAO ve Service katmanlarının verilere erişimi için gereklidir.
    
    public int getSeferID() {
        return seferID;
    }

    public String getKalkisYeri() {
        return kalkisYeri;
    }

    public String getVarisYeri() {
        return varisYeri;
    }

    public Date getTarih() {
        return tarih;
    }

    public String getSaat() {
        return saat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public List<Koltuk> getKoltukListesi() {
        return koltukListesi;
    }
    
    // =============== Setter Metotları (Opsiyonel) ==================
    // Fiyat gibi alanların güncellenmesi gerekebilir (Firma Çalışanı rolü)
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    // setKoltukListesi, setTarih gibi metotlar da gerektiğinde eklenebilir.
}