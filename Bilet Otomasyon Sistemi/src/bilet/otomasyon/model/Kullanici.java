package bilet.otomasyon.model;
public abstract class Kullanici {
    protected String kullaniciID;
    protected String ad;
    protected String soyad;
    protected String email;
    protected String sifre;

    public Kullanici(String kullaniciID, String ad, String soyad, String email, String sifre) {
        this.kullaniciID = kullaniciID;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.sifre = sifre;
    }

    public abstract boolean girisYap(String email, String sifre);
    public abstract void cikisYap();
}