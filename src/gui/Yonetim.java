/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Command_Pattern.cikti.pdf.Pdf_Olustur_Komutu;
import Strategy_Pattern.istemci.Istemci;
import Strategy_Pattern.istemci.VarsayilanIstemci;
import Strategy_Pattern.listelemedavranisi.IsmeGoreListeleme;
import Strategy_Pattern.listelemedavranisi.TariheGoreListeleme;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.Pfm2afm;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import veritabaniislemleri.Giris;
import veritabaniislemleri.Siparis;
import veritabaniislemleri.Urun;

/**
 *
 * @author naime
 */
public class Yonetim extends javax.swing.JFrame {

    public Pdf_Olustur_Komutu pdf_cikti_komutu;
    Istemci istemci;
     ArrayList<Siparis> siparisler=siparisleriListele();
    
    /**
     * Creates new form Yonetim
     */
    public Yonetim() {
        initComponents();
        urunleriYazdir(siparisler);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_cikis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        siparisler_Table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btn_yenile = new javax.swing.JButton();
        odeme_CB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_listele = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetim Ekranı");
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1034, 555));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KAYITLAR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Listele");

        btn_cikis.setBackground(new java.awt.Color(204, 0, 51));
        btn_cikis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cikis.setForeground(new java.awt.Color(255, 255, 255));
        btn_cikis.setText("Çıkış Yap");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        siparisler_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        siparisler_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siparisler_Table.setFocusCycleRoot(true);
        siparisler_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparisler_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(siparisler_Table);

        btn_yenile.setBackground(new java.awt.Color(51, 204, 0));
        btn_yenile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_yenile.setForeground(new java.awt.Color(255, 255, 255));
        btn_yenile.setText("Yenile");
        btn_yenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yenileActionPerformed(evt);
            }
        });

        odeme_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Müşteri İsmine Göre Sırala", "Sipariş Tarihine Göre Sırala" }));
        odeme_CB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odeme_CBMouseClicked(evt);
            }
        });
        odeme_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odeme_CBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PDF çıktı alabilmek için çift tıklama yapınız.");

        btn_listele.setBackground(new java.awt.Color(252, 226, 40));
        btn_listele.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_listele.setText("Listele");
        btn_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_yenile)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addContainerGap(515, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cikis)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(odeme_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_listele)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cikis)
                                    .addComponent(jLabel2))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btn_listele))
                            .addComponent(odeme_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_yenile)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(934, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        Login giris = null;
        try {
            giris = new Login();
        } catch (IOException ex) {
            Logger.getLogger(Yonetim.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hide();
        giris.show();
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_yenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yenileActionPerformed
         urunleriYazdir(siparisler);
    }//GEN-LAST:event_btn_yenileActionPerformed

    private void odeme_CBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odeme_CBMouseClicked

    }//GEN-LAST:event_odeme_CBMouseClicked

    private void odeme_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odeme_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odeme_CBActionPerformed

    private void siparisler_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparisler_TableMouseClicked
        
        boolean a=siparisler_Table.isEditing();
        
        if (a==false || evt.getClickCount() == 2) {
            JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            String musteri_adsoyad=source.getModel().getValueAt(row, 0)+"";
            String garson_adi=source.getModel().getValueAt(row, 1)+"";
            String siparis_zaman=source.getModel().getValueAt(row, 2)+"";
            String odeme_turu=source.getModel().getValueAt(row, 3)+"";
            String tutar=source.getModel().getValueAt(row, 4)+"";
            
            String[] tarihParcala=siparis_zaman.split(" ");
            try {
                
                pdf_cikti_komutu=new Pdf_Olustur_Komutu(musteri_adsoyad, garson_adi, tarihParcala[0], odeme_turu,tutar);
                pdf_cikti_komutu.PdfOlustur();
            } catch(Exception e){
                e.printStackTrace();
            }
            
            //JOptionPane.showMessageDialog(null,"Faturanıza Sipariş Kayıtları dizininden erişebilirsiniz.","Faturanız Oluşturuldu!", JOptionPane.INFORMATION_MESSAGE);
            
            
            }    
        
    
     
    }//GEN-LAST:event_siparisler_TableMouseClicked

    private void btn_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeleActionPerformed
        
        istemci = new VarsayilanIstemci();
        if (odeme_CB.getSelectedItem().toString().equals("Müşteri İsmine Göre Sırala")) {
            ArrayList<Siparis> gelenSiparisler;
            istemci.listelemeBaslat(new IsmeGoreListeleme());
            gelenSiparisler=istemci.listeYazdir(); 
            urunleriYazdir(gelenSiparisler);
            
        }else{
            ArrayList<Siparis> gelenSiparisler;
            istemci.listelemeBaslat(new TariheGoreListeleme());
            gelenSiparisler=istemci.listeYazdir();  
            urunleriYazdir(gelenSiparisler);
            
        }
              
        
    }//GEN-LAST:event_btn_listeleActionPerformed

 
   
     public ArrayList<Siparis> siparisleriListele(){
        
        
        ArrayList<Siparis> siparisListesi= new ArrayList<Siparis>();
               
        Statement st;
        ResultSet rs;    
        String sorgu;
        
        Giris.veritabaniBaglan.veritabanibaglan();

           
        try {
  
            sorgu = "SELECT * FROM siparis";
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
     
     
     
     
     public void urunleriYazdir(ArrayList<Siparis> gelen){
        
        if(gelen.isEmpty()){
            siparisler=siparisleriListele();
        }else{
            siparisler=gelen;
        }
        
        String odemeTuru="";
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Müşteri Adsoyad","Garson Adı", "Siparis Zamanı","Ödeme Türü","Tutar (TL)"});
        Object[] row= new Object[5];
        
        for (int i = 0; i <siparisler.size() ; i++) {
            row[0]= siparisler.get(i).getSiparis_adsoyad();
            row[1]= siparisler.get(i).getKullanici_ad();
            row[2]= siparisler.get(i).getSiparis_tarihi();
            if (siparisler.get(i).getSiparis_tip().equals("0")) {
                odemeTuru="Nakit";
            }else{
                odemeTuru="Kredi Kartı";
            }
            row[3]= odemeTuru;
            row[4]= siparisler.get(i).getSiparis_toplam();
            model.addRow(row);
        }
         siparisler_Table.setModel(model);
  
    }
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yonetim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yonetim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_listele;
    private javax.swing.JButton btn_yenile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> odeme_CB;
    private javax.swing.JTable siparisler_Table;
    // End of variables declaration//GEN-END:variables
}
