package Command_Pattern.cikti.pdf;


import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Pdf_Olustur_Komutu extends Komut {
	
    private Pdf_Yoneticisi yonetici=new Pdf_Yoneticisi();
    private final String musteri_ad,kasiyer_ad,siparis_tarihi,odeme_turu,toplam_tutar;

    
    public Pdf_Olustur_Komutu(String musteri_ad,String kasiyer_ad,String siparis_tarihi,String odeme_turu,String toplam_tutar) {
        this.musteri_ad=musteri_ad;
        this.kasiyer_ad=kasiyer_ad;
        this.siparis_tarihi=siparis_tarihi;
        this.odeme_turu=odeme_turu;
        this.toplam_tutar=toplam_tutar;
    }

 
    @Override
    public void PdfOlustur() {
        try {
            yonetici.Pdfolustur(musteri_ad, kasiyer_ad, siparis_tarihi, odeme_turu, toplam_tutar);
        } catch (DocumentException ex) {
            Logger.getLogger(Pdf_Olustur_Komutu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pdf_Olustur_Komutu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
             yonetici.deneme2();
        } catch (NullPointerException e) {
            System.out.println("Deneme deneme");
             
        }
      
    }

 
    
}