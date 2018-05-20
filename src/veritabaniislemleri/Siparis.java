
package veritabaniislemleri;

public class Siparis {
    
    private String siparis_tarihi;
    private String kullanici_ad;
    private String siparis_adsoyad;
    private String siparis_tip;
    private float siparis_toplam;

    public Siparis(String siparis_tarihi, String kullanici_ad, String siparis_adsoyad, String siparis_tip, float siparis_toplam) {
        this.siparis_tarihi = siparis_tarihi;
        this.kullanici_ad = kullanici_ad;
        this.siparis_adsoyad = siparis_adsoyad;
        this.siparis_tip = siparis_tip;
        this.siparis_toplam = siparis_toplam;
    }

    
    
    
    public String getSiparis_tarihi() {
        return siparis_tarihi;
    }

    public void setSiparis_tarihi(String siparis_tarihi) {
        this.siparis_tarihi = siparis_tarihi;
    }

    public String getKullanici_ad() {
        return kullanici_ad;
    }

    public void setKullanici_ad(String kullanici_ad) {
        this.kullanici_ad = kullanici_ad;
    }

    public String getSiparis_adsoyad() {
        return siparis_adsoyad;
    }

    public void setSiparis_adsoyad(String siparis_adsoyad) {
        this.siparis_adsoyad = siparis_adsoyad;
    }

    public String getSiparis_tip() {
        return siparis_tip;
    }

    public void setSiparis_tip(String siparis_tip) {
        this.siparis_tip = siparis_tip;
    }

    public float getSiparis_toplam() {
        return siparis_toplam;
    }

    public void setSiparis_toplam(float siparis_toplam) {
        this.siparis_toplam = siparis_toplam;
    }
    
    
    
    
    
    
    
}
