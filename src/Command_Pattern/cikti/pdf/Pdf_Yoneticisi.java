/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command_Pattern.cikti.pdf;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ogulcan
 */
public class Pdf_Yoneticisi  {

    public static String DEST = "siparis_kayitlari";
    public Pdf_Yoneticisi() {
    }
    
    public static String dosya_ismi_degistir(String kelime)
    {
       String mesaj = kelime;
       char[] oldValue = new char[] { 'ö', 'Ö', 'ü', 'Ü', 'ç', 'Ç', 'İ', 'ı', 'Ğ', 'ğ', 'Ş', 'ş',' ' };
       char[] newValue = new char[] { 'o', 'O', 'u', 'U', 'c', 'C', 'I', 'i', 'G', 'g', 'S', 's','_' };
       for (int sayac = 0; sayac < oldValue.length; sayac++)
       {
          mesaj = mesaj.replace(oldValue[sayac], newValue[sayac]);
       }
       return mesaj;
    }
      public static String karakterCevir(String kelime)
    {
       String mesaj = kelime;
       char[] oldValue = new char[] { 'ö', 'Ö', 'ü', 'Ü', 'ç', 'Ç', 'İ', 'ı', 'Ğ', 'ğ', 'Ş', 'ş' };
       char[] newValue = new char[] { 'o', 'O', 'u', 'U', 'c', 'C', 'I', 'i', 'G', 'g', 'S', 's' };
       for (int sayac = 0; sayac < oldValue.length; sayac++)
       {
          mesaj = mesaj.replace(oldValue[sayac], newValue[sayac]);
       }
       return mesaj;
    }
    public void deneme(){
        System.out.println("Merhaba");
    }
     public void deneme2(){
        System.out.println("Merhaba Dünya");
    }

    public void Pdfolustur(String musteri_ad,String kasiyer_ad,String siparis_tarihi,String odeme_turu,String toplam_tutar) throws DocumentException, IOException {
      
        
      Document document = new Document();
      String dosyaYolu="siparis_kayitlari/"+dosya_ismi_degistir(musteri_ad)+"-"+siparis_tarihi+".pdf";
      PdfWriter.getInstance(document, new FileOutputStream(dosyaYolu));
      document.open();
      Image img = Image.getInstance("src/assets/logo3.png");
      document.add(img);
      document.add(new Paragraph("\n\n\n\n\n\n"));
      document.add(new Paragraph(karakterCevir("Sipariş Bilgileri")));
      document.add(new Paragraph("\n\n"));
      document.add(new Paragraph(karakterCevir("Bu belge müşterinin talebi üzerine hazırlanmıştır. Resmi evrak özelliği barındırmaz!")));
      document.add(new Paragraph("\n\n"));
      document.add(new Paragraph("Müşteri Adı: " +karakterCevir(musteri_ad)));
      document.add(new Paragraph("Sipariş Alan Garson Adı: " +karakterCevir(kasiyer_ad)));
      document.add(new Paragraph("Sipariş Tarihi: " + siparis_tarihi));
      document.add(new Paragraph(karakterCevir("Ödeme Türü " + odeme_turu)));
      document.add(new Paragraph("\n"));
      document.add(new Paragraph("Toplam Tutar: " + toplam_tutar+" TL"));
      document.add(new Paragraph(karakterCevir("\n\n\n\n\n\n\n\n \t\t\t COFFEE HOUSE CAFE | ISPARTA")));
      document.close();
  }
     
    
    
}
