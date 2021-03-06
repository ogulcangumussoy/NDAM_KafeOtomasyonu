/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import veritabaniislemleri.Baglan;
import veritabaniislemleri.Giris;
import veritabaniislemleri.Urun;
import gui.Login;
import gui.Log_Ekrani;
import static gui.Log_Ekrani.ara_veri;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Abstract_Pattern.kahvefactory.AbstractKahveFactory;
import Abstract_Pattern.kahvefactory.AmerikanKahveFactory;
import Abstract_Pattern.kahvefactory.TurkKahveFactory;
import Abstract_Pattern.kahveler.KahveA;



/**
 *
 * @author ogulcan
 */
public class Garson extends javax.swing.JFrame {
   public static Garson gMain;
   public static String garson_adi;
   public static String abstract_gelenler;
   PrintWriter writer;
   public float ToplamTutar=0;
   AbstractKahveFactory turkKahvesi = new TurkKahveFactory();
   AbstractKahveFactory amerikanKahvesi = new AmerikanKahveFactory();
   KahveA kahve = null;
   ArrayList<String> siparisler= new ArrayList<>();
   
    
    /**
     * Creates new form kasiyer
     */
    public Garson(String garsonAd, String kullanici_adi) {
        
        initComponents();
        kasiyer_ad_Label.setText(garsonAd);
        
        garson_adi= kullanici_adi;
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        musteriAd_TF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        odeme_CB = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        toplamTutar_Label = new javax.swing.JLabel();
        btn_siparisVer = new javax.swing.JButton();
        kasiyer_ad_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_cikis = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        siparisListesi = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        btn_log = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();

        setTitle("Sipariş Ekranı");
        setBackground(new java.awt.Color(0, 176, 194));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Sipariş Ekranı");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ürünler");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bilgiler");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Kasiyer Ad Soyad:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Müşteri Ad Soyad:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tutar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ödeme Türü:");

        odeme_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nakit", "Kredi Kartı" }));
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Toplam Tutar:");

        toplamTutar_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toplamTutar_Label.setText("Tutar ₺ ");

        btn_siparisVer.setBackground(new java.awt.Color(0, 0, 0));
        btn_siparisVer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_siparisVer.setForeground(new java.awt.Color(255, 255, 255));
        btn_siparisVer.setText("Siparişi Kaydet");
        btn_siparisVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_siparisVerMouseClicked(evt);
            }
        });
        btn_siparisVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siparisVerActionPerformed(evt);
            }
        });

        kasiyer_ad_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kasiyer_ad_Label.setText("Kasiyer -1-");

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setFocusCycleRoot(true);
        jTable1.setPreferredSize(new java.awt.Dimension(1034, 555));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_cikis.setBackground(new java.awt.Color(204, 0, 51));
        btn_cikis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cikis.setForeground(new java.awt.Color(255, 255, 255));
        btn_cikis.setText("Çıkış Yap");
        btn_cikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cikisMouseClicked(evt);
            }
        });
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        siparisListesi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        siparisListesi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sipariş Listesi" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        siparisListesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparisListesiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(siparisListesi);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Çift Tıklamayla Ürünü Çıkarabilirsiniz");

        btn_log.setBackground(new java.awt.Color(255, 255, 0));
        btn_log.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_log.setText("Log Kayıtları");
        btn_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logMouseClicked(evt);
            }
        });
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });

        btn_temizle.setBackground(new java.awt.Color(0, 204, 153));
        btn_temizle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_temizle.setText("Temizle");
        btn_temizle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_temizleMouseClicked(evt);
            }
        });
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_siparisVer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_temizle))
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(30, 30, 30)
                                            .addComponent(odeme_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(toplamTutar_Label))
                                        .addComponent(jSeparator3)
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(29, 29, 29)
                                            .addComponent(musteriAd_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(39, 39, 39)
                                            .addComponent(kasiyer_ad_Label))))
                                .addGap(0, 213, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_log)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cikis)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikis)
                    .addComponent(btn_log))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(btn_temizle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kasiyer_ad_Label))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(musteriAd_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(odeme_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(toplamTutar_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btn_siparisVer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void odeme_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odeme_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odeme_CBActionPerformed

    private void btn_siparisVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_siparisVerMouseClicked
       
        //Sipariş Verme İşlemi
        
        
        
        
        
        
    }//GEN-LAST:event_btn_siparisVerMouseClicked

    private void btn_siparisVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siparisVerActionPerformed
           siparisOlustur();
         
    }//GEN-LAST:event_btn_siparisVerActionPerformed

    private void btn_cikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseClicked
       
        Login giris = null;
       try {
           giris = new Login();
       } catch (IOException ex) {
           Logger.getLogger(Garson.class.getName()).log(Level.SEVERE, null, ex);
       }
        this.hide();
        giris.show();
        
    }//GEN-LAST:event_btn_cikisMouseClicked

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
            JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            String s=source.getModel().getValueAt(row, 1)+"";
            
            String urunAdi=source.getModel().getValueAt(row, 0)+"";
            
            ToplamTutar+=Float.valueOf(s);
            String siparisFis=urunAdi+"  "+s+" TL";
            siparisListesiDoldur(siparisFis);
            toplamTutar_Label.setText(String.valueOf(ToplamTutar)+" TL");
            
            //Log Ekranına verileri yazdırma işlemi
            
            if(urunAdi.isEmpty()){

            }else if(urunAdi.equals("Türk Kahvesi") || urunAdi.equals("Damla Sakızlı Kahve")){
                if (urunAdi.equals("Türk Kahvesi")) {
                    urunAdi="turk_kahvesi";
                }else if(urunAdi.equals("Damla Sakızlı Kahve")){
                    urunAdi="damla_sakizli";
                }
                kahve = turkKahvesi.siparisVer(urunAdi);
                
            }else if(urunAdi.equals("Americano") || urunAdi.equals("Mocha") || urunAdi.equals("Espresso")){
                if (urunAdi.equals("Americano")) {
                    urunAdi="americano";
                }else if(urunAdi.equals("Mocha")){
                    urunAdi="mocha";
                }else if(urunAdi.equals("Espresso")){
                    urunAdi="espresso";
                }
                 kahve = amerikanKahvesi.siparisVer(urunAdi);
            }else{
                kahve = turkKahvesi.siparisVer("turk_kahvesi");
            }
        
       try {
           DosyayaYazdir(abstract_gelenler+kahve + "\n**********************\n");
       } catch (IOException ex) {
           Logger.getLogger(Garson.class.getName()).log(Level.SEVERE, null, ex);
       }
            System.out.println(kahve + "\n**********************\n");
              
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void odeme_CBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odeme_CBMouseClicked
        
        
    }//GEN-LAST:event_odeme_CBMouseClicked

    private void siparisListesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparisListesiMouseClicked
      
            if (evt.getClickCount() == 2) {
                siparisListesindenCikar(siparisListesi.getSelectedIndex());
            }
        
    }//GEN-LAST:event_siparisListesiMouseClicked

    private void btn_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logMouseClicked
        
       try {
           Log_Ekrani.log_ekrani=new Log_Ekrani();
       } catch (IOException ex) {
           Logger.getLogger(Garson.class.getName()).log(Level.SEVERE, null, ex);
       }
        Log_Ekrani.log_ekrani.show();
        
    }//GEN-LAST:event_btn_logMouseClicked

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logActionPerformed

    private void btn_temizleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_temizleMouseClicked
         verileriTemizle();
       try {
           logTemizle();
       } catch (IOException ex) {
           Logger.getLogger(Garson.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btn_temizleMouseClicked

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_temizleActionPerformed

    
        public void siparisOlustur (){

        PreparedStatement ps=null;
        ResultSet rs;
        String deger="0";
        
        Giris.veritabaniBaglan.veritabanibaglan();
        
            if ((odeme_CB.getSelectedItem().toString()).equals("Kredi Kartı")) {
                deger="1";
            } else {
                deger="0";
            }
        
         
        try {
                        
            ps = Giris.veritabaniBaglan.conn.prepareStatement("INSERT INTO siparis(siparis_zaman, kullanici_ad, "
                    + "siparis_adsoyad,siparis_tip,siparis_toplam) VALUES (?,?,?,?,?)");

            ps.setTimestamp(1, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            ps.setString(2, garson_adi);
            ps.setString(3, musteriAd_TF.getText().toString());
            ps.setString(4, deger);
            ps.setFloat(5, ToplamTutar);
            
            ps.executeUpdate();
            
            //Kayıt sonrası verileri temizleme metodu
            verileriTemizle();

            JOptionPane.showMessageDialog(null, "Kayıt işlemi Başarılı");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        }
        
        
        public void DosyayaYazdir(String gelen) throws IOException {

       
                PrintWriter out = null;
                try {
                    out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/ogulcan/Documents/NetBeansProjects/nesneyedayali/src/log_kayit.txt", true)));
                    out.println(gelen);
                }catch (IOException e) {
                    System.err.println(e);
                }finally{
                    if(out != null){
                        out.close();
                    }
                }
        }

  
 
   
    
    public ArrayList<Urun> urunleriListele(){
        
        
        ArrayList<Urun> urunListesi= new ArrayList<Urun>();
               
        Statement st;
        ResultSet rs;         
        
        Giris.veritabaniBaglan.veritabanibaglan();

           
        try {
               
            String sorgu = "SELECT * FROM urun";
            st = Giris.veritabaniBaglan.conn.createStatement();
            rs=st.executeQuery(sorgu);
            Urun urun;
            while (rs.next()) {                
                urun = new Urun(
                rs.getString("urun_ad"),
                rs.getFloat("urun_fiyat")
                );
                
               urunListesi.add(urun);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        return urunListesi;
        
       
    }
    
    public void verileriTemizle() {
      //temizleme işlemi
            int j = 0;
            siparisler.clear();
            /*for (int i = 0; i < siparisler.size(); i++) {
                siparisler.remove(i - j);
                j++;
                System.out.println(siparisler.size());
            }*/
            musteriAd_TF.setText("");
            toplamTutar_Label.setText("Tutar TL");
            siparisListesiDoldur("Yenile");
    }
    
    public void siparisListesiDoldur(String gelenSiparis){
        if(gelenSiparis.equals("Yenile")){
           DefaultListModel  model2=new DefaultListModel();

            for (int i = 0; i < siparisler.size(); i++)
            {
                model2.addElement(siparisler.get(i));
            }
            siparisListesi.setModel(model2);
        }else{
             siparisler.add(gelenSiparis);
             siparisListesiDoldur("Yenile");
        }
    }
    
    private void logTemizle() throws FileNotFoundException, IOException {
        FileOutputStream writer = new FileOutputStream("C:/Users/ogulcan/Documents/NetBeansProjects/nesneyedayali/src/log_kayit.txt");
        writer.write(("").getBytes());
        writer.close();
    }
    
    public void siparisListesindenCikar(int indis){
        String[] siparisKelime=siparisler.get(indis).split("  ");
        String tutarDizi[]=siparisKelime[1].split(" ");
        float tutar=Float.valueOf(tutarDizi[0]);    
        ToplamTutar-=tutar;
        toplamTutar_Label.setText(String.valueOf(ToplamTutar)+" TL");
        siparisler.remove(indis);
        siparisListesiDoldur("Yenile");
    }
    
    public void urunleriYazdir(){
        ArrayList<Urun> urunler=urunleriListele();
        
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Ürün Adı","Ürün Fiyatı (TL)"});
        Object[] row= new Object[2];
        
        for (int i = 0; i <urunler.size() ; i++) {
            row[0]= urunler.get(i).getUrunAdi();
            row[1]= urunler.get(i).getUrunFiyati();
            //row[1]= urunler.get(i).getUrunFiyati()+" TL";
            model.addRow(row);
        }
         jTable1.setModel(model);
  
    }
   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Garson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Garson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Garson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Garson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Garson("","").setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_log;
    private javax.swing.JButton btn_siparisVer;
    private javax.swing.JButton btn_temizle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kasiyer_ad_Label;
    private javax.swing.JTextField musteriAd_TF;
    private javax.swing.JComboBox<String> odeme_CB;
    private javax.swing.JList<String> siparisListesi;
    private javax.swing.JLabel toplamTutar_Label;
    // End of variables declaration//GEN-END:variables

    
}
