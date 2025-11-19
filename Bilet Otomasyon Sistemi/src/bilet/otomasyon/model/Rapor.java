package bilet.otomasyon.model;

import java.util.Date;

public class Rapor {
    private int raporID;
    private Date tarih;
    private String icerik;

    public Rapor(int raporID, String icerik) {
        this.raporID = raporID;
        this.tarih = new Date();
        this.icerik = icerik;
    }

    public void raporOlustur() {
 
    }

    public void raporGoster() {

    }

}