package bilet.otomasyon.model;

import bilet.otomasyon.enums.IslemSonucu;
import java.util.Date;

public class Odeme {
    private int odemeID;
    private double tutar;
    private Date odemeTarihi;
    private String odemeTipi;
    private String odemeDurumu;

    public Odeme(int odemeID, double tutar, String odemeTipi) {
        this.odemeID = odemeID;
        this.tutar = tutar;
        this.odemeTarihi = new Date();
        this.odemeTipi = odemeTipi;
        this.odemeDurumu = "Beklemede"; 
    }
    public IslemSonucu odemeYap() {

        return IslemSonucu.HATALI;
    }

    public IslemSonucu iadeEt() {

        return IslemSonucu.HATALI;
    }
    
}