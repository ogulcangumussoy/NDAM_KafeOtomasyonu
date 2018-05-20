/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritabaniislemleri;

/**
 *
 * @author ogulcan
 */
public class Urun {
    
    private String urunAdi;
    private float urunFiyati;
    
    
    public Urun(String urununAdi,float urununFiyati){
        
        this.urunAdi=urununAdi;
        this.urunFiyati=urununFiyati;
        
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public float getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(float urunFiyati) {
        this.urunFiyati = urunFiyati;
    }
    
}
