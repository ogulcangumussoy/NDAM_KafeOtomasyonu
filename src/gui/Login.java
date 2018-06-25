/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import veritabaniislemleri.Giris;

/**
 *
 * @author ogulcan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Login() throws IOException {
        initComponents();
        logTemizle();
        
        
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        tf_kullaniciadi = new javax.swing.JTextField();
        tf_kparola = new javax.swing.JPasswordField();
        btn_giris = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jSeparator2 = new javax.swing.JSeparator();
        btn_cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 204, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo3.png"))); // NOI18N
        jLabel1.setToolTipText("");

        label2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label2.setText("Kullanıcı Adı:");

        label3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label3.setText("Parola");

        tf_kullaniciadi.setText("kasiyer");
        tf_kullaniciadi.setToolTipText("");
        tf_kullaniciadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_kullaniciadiKeyPressed(evt);
            }
        });

        tf_kparola.setText("123456");
        tf_kparola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_kparolaKeyPressed(evt);
            }
        });

        btn_giris.setBackground(new java.awt.Color(0, 0, 0));
        btn_giris.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_giris.setForeground(new java.awt.Color(255, 255, 255));
        btn_giris.setText("Giriş");
        btn_giris.setMaximumSize(new java.awt.Dimension(117, 23));
        btn_giris.setMinimumSize(new java.awt.Dimension(117, 23));
        btn_giris.setPreferredSize(new java.awt.Dimension(117, 23));
        btn_giris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_girisMouseClicked(evt);
            }
        });
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        label1.setText("Kullanıcı Girişi");

        btn_cikis.setBackground(new java.awt.Color(204, 0, 51));
        btn_cikis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cikis.setForeground(new java.awt.Color(255, 255, 255));
        btn_cikis.setText("Kapat");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_cikis)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_kparola, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cikis)
                        .addGap(95, 95, 95)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_kparola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btn_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
       
    }//GEN-LAST:event_btn_girisActionPerformed

    private void btn_girisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_girisMouseClicked
        
        girisYap();
        
    }//GEN-LAST:event_btn_girisMouseClicked

    public void girisYap(){
        
        String parola;
        String kadi;
        parola = tf_kparola.getText();
        kadi = tf_kullaniciadi.getText();
        
        Giris gir = new Giris();
        String durum = "false";
        try {
            durum = gir.sistemgirisi(kadi,parola);
            String[] splited = durum.split(" ");
            if(splited[0].equals("true")  && splited[1].equals("yonetici")){
                
                Yonetim yonetim = new Yonetim();
                yonetim.show();
                this.hide();
            }else if(splited[0].equals("true")  && splited[1].equals("garson")){
                
                Garson.gMain = new Garson(splited[2]+" "+splited[3],kadi);
                Garson.gMain.urunleriYazdir();
                Garson.gMain.show();
                this.hide();
            }
            else{
                JOptionPane.showMessageDialog(null, "Kullanıcı Adi veya Parola Yanlış.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Bağlantı Hatası: " + ex);
        }
        
    }
    
    private void btn_cikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cikisMouseClicked

        Login giris;
        try {
            giris = new Login();
            this.hide();
            giris.show();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_btn_cikisMouseClicked

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void tf_kparolaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_kparolaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            girisYap();
        }
    }//GEN-LAST:event_tf_kparolaKeyPressed

    private void tf_kullaniciadiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_kullaniciadiKeyPressed
       
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            girisYap();
        } 
    }//GEN-LAST:event_tf_kullaniciadiKeyPressed

    
       
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_giris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JPasswordField tf_kparola;
    private javax.swing.JTextField tf_kullaniciadi;
    // End of variables declaration//GEN-END:variables

    private void logTemizle() throws FileNotFoundException, IOException {
        FileOutputStream writer = new FileOutputStream("C:/Users/ogulcan/Documents/NetBeansProjects/nesneyedayali/src/log_kayit.txt");
        writer.write(("").getBytes());
        writer.close();
    }
}
