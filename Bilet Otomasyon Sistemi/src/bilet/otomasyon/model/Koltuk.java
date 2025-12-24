package bilet.otomasyon.model;

import bilet.otomasyon.model.Yolcu;
import bilet.otomasyon.enums.KoltukDurumu;

public class Koltuk {
    private int koltukNo;
    private KoltukDurumu durum; 

    public Koltuk(int koltukNo, KoltukDurumu durum) {
        this.koltukNo = koltukNo;
        this.durum = durum;
    }
    public void koltukSec(Yolcu yolcu) {
        
    }

    public void koltukDurumuDegistir(KoltukDurumu yeniDurum) {
        this.durum = yeniDurum;
    }
}