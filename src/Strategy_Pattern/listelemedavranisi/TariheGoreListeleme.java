package Strategy_Pattern.listelemedavranisi;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import veritabaniislemleri.Giris;
import veritabaniislemleri.Siparis;

/**
 *
 * Kodlar Burada Yazılacak.
 */
public class TariheGoreListeleme implements ListelemeDavranisi {
    
 
    
     @Override
     public ArrayList<Siparis> listeYazdir(){
        
        
        ArrayList<Siparis> siparisListesi= new ArrayList<Siparis>();
               
        Statement st;
        ResultSet rs;    
        String sorgu;
        
        Giris.veritabaniBaglan.veritabanibaglan();

           
        try {
             
            sorgu = "SELECT * FROM siparis ORDER BY siparis_zaman DESC";
            st = Giris.veritabaniBaglan.conn.createStatement();
            rs=st.executeQuery(sorgu);
            Siparis siparis;
            while (rs.next()) {                
                siparis= new Siparis(
                rs.getTimestamp("siparis_zaman").toString(),
                rs.getString("kullanici_ad"),
                rs.getString("siparis_adsoyad"),
                rs.getString("siparis_tip"),
                rs.getFloat("siparis_toplam")
                );
                
               siparisListesi.add(siparis);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        return siparisListesi;
    }
    
    
}
