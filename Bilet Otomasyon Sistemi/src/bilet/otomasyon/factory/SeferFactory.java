package bilet.otomasyon.factory;

import bilet.otomasyon.model.Sefer;
import bilet.otomasyon.model.UcakSeferi;
import bilet.otomasyon.model.OtobusSeferi;
import bilet.otomasyon.model.Koltuk; 

import java.util.Date;
import java.util.List;



public class SeferFactory {

   
    public static Sefer createSefer(
            String tip, 
            int id, 
            String kalkis, 
            String varis, 
            Date tarih, 
            String saat, 
            double fiyat, 
            List<Koltuk> koltukListesi, 
            Object ekOzellik) {

        if (tip == null || ekOzellik == null) {
            throw new IllegalArgumentException("Sefer tipi veya ek özellik boş olamaz.");
        }

        if ("UC".equalsIgnoreCase(tip)) {
            if (ekOzellik instanceof String) {
                return new UcakSeferi(id, kalkis, varis, tarih, saat, fiyat, koltukListesi, (String) ekOzellik);
            }
            throw new IllegalArgumentException("Uçak Seferi için ek özellik (Model) String tipinde olmalıdır.");
            
        } else if ("OT".equalsIgnoreCase(tip)) {
            if (ekOzellik instanceof Boolean) {
                return new OtobusSeferi(id, kalkis, varis, tarih, saat, fiyat, koltukListesi, (Boolean) ekOzellik);
            }
            throw new IllegalArgumentException("Otobüs Seferi için ek özellik (İkram) Boolean tipinde olmalıdır.");
        } 
        
        throw new IllegalArgumentException("Geçersiz sefer tipi: " + tip);
    }
}