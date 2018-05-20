/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veritabaniislemleri;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author loop
 */
public class Baglan {
    private String url ="jdbc:mysql://localhost:3306/";
    private String driver ="com.mysql.jdbc.Driver";
    private String dbname ="ndam_proje";
    private String username ="root";
    private String password ="";
    
    public Connection conn;
    
     public void veritabanibaglan(){
        try{
            
            Class.forName(driver).newInstance();
            conn = (Connection)DriverManager.getConnection(url+dbname+"?useUnicode=yes&characterEncoding=UTF-8",
                    username, password);
            //System.out.println("Bağlantı Başarılı.");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Bağlantı Başarısız Hata: "
                    + e);
            System.out.println("Bağlantı Başarısız Hata: "+ e);
        }
    }
}

