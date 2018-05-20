/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritabaniislemleri;

import gui.Garson;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author loop
 */
public class Giris{
    PreparedStatement ps;
    ResultSet rs;
    public static Baglan veritabaniBaglan;
    
    
    public String sistemgirisi(String username, String password) throws SQLException{
        veritabaniBaglan = new Baglan();
        veritabaniBaglan.veritabanibaglan();
        
        String sorgu = "SELECT kullanici_parola,kullanici_yetki,kullanici_adsoyad FROM kullanici WHERE kullanici_ad = ?";
 
       
        ps = veritabaniBaglan.conn.prepareStatement(sorgu);
        ps.setString(1, username);
        rs = ps.executeQuery();
    
        
        while(rs.next()){
            String dbPassword = rs.getString("kullanici_parola");
            String yetkiK = rs.getString("kullanici_yetki");
            String adSoyad=rs.getString("kullanici_adsoyad");
            
            if(dbPassword.equals(password)){
                //System.out.println("done");
                String kullaniciYetki = yetkiK;
                if (kullaniciYetki.equals("1")) {
                    
                    return "true yonetici";
                }else{
                    return "true garson "+adSoyad;
                }
   
            }
            else
                
                return "false";
        }
        return "false";
}
    }
