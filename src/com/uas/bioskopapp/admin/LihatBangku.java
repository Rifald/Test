/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uas.bioskopapp.admin;

import com.uas.bioskopapp.admin.connect.Konek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class LihatBangku extends javax.swing.JFrame {

    /**
     * Creates new form LihatBangku
     */
    private Connection koneksi;
    private PreparedStatement ps;
    private Konek kdb = new Konek();
    private String baris, nomer;
    private Statement cs;
    public LihatBangku() {
        initComponents();
    }

    public void getDataBangku(String NoStudio, String NamaBioskop, int[] bangku){
     PreparedStatement ps = null;
        ResultSet rs = null;
       
        String strSql="SELECT bangku.* FROM bioskop INNER JOIN studio ON bioskop.id_bioskop=studio.id_bioskop INNER JOIN film ON film.id_film=studio.id_film INNER JOIN bangku ON bangku.id_bangku=studio.id_bangku "
                + "WHERE bioskop.nama_bioskop = '"+NamaBioskop+"' AND no_studio = '"+NoStudio+"' ";
        
        try {
            kdb.bukaKoneksi();
            koneksi = kdb.getConn();
            cs = koneksi.createStatement();
            rs = cs.executeQuery(strSql);

           
            while (rs.next()){
                
                bangku[0] = Integer.parseInt(rs.getString(2));
                bangku[1] = Integer.parseInt(rs.getString(3));
                bangku[2] = Integer.parseInt(rs.getString(4));
                bangku[3] = Integer.parseInt(rs.getString(5));
                bangku[4] = Integer.parseInt(rs.getString(6));
                bangku[5] = Integer.parseInt(rs.getString(7));
                bangku[6] = Integer.parseInt(rs.getString(8));
                bangku[7] = Integer.parseInt(rs.getString(9));
                bangku[8] = Integer.parseInt(rs.getString(10));
                bangku[9] = Integer.parseInt(rs.getString(11));
                bangku[10] = Integer.parseInt(rs.getString(12));
                bangku[11] = Integer.parseInt(rs.getString(13));
                
               setBangku(bangku,0,bangkuA1);
                setBangku(bangku,1,bangkuA2);
                setBangku(bangku,2,bangkuA3);
                setBangku(bangku,3,bangkuA4);
                
                setBangku(bangku,4,bangkuB1);
                setBangku(bangku,5,bangkuB2);
                setBangku(bangku,6,bangkuB3);
                setBangku(bangku,7,bangkuB4);
                
                setBangku(bangku,8,bangkuC1);
                setBangku(bangku,9,bangkuC2);
                setBangku(bangku,10,bangkuC3);
                setBangku(bangku,11,bangkuC4);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan : " +e);
        }
    }
    private void setBangku(int[] arrayBangku,int index, JButton tombolBangku){
        if(arrayBangku[index] == 0){
            tombolBangku.setEnabled(true);
        }else{
            tombolBangku.setEnabled(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bangkuA1 = new javax.swing.JButton();
        bangkuA2 = new javax.swing.JButton();
        bangkuA3 = new javax.swing.JButton();
        bangkuA4 = new javax.swing.JButton();
        bangkuB1 = new javax.swing.JButton();
        bangkuC1 = new javax.swing.JButton();
        bangkuB2 = new javax.swing.JButton();
        bangkuC2 = new javax.swing.JButton();
        bangkuB3 = new javax.swing.JButton();
        bangkuB4 = new javax.swing.JButton();
        bangkuC3 = new javax.swing.JButton();
        bangkuC4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        bangkuA1.setBackground(new java.awt.Color(255, 0, 0));
        bangkuA1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuA1.setForeground(new java.awt.Color(255, 255, 255));
        bangkuA1.setText("A1");
        bangkuA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA1ActionPerformed(evt);
            }
        });

        bangkuA2.setBackground(new java.awt.Color(255, 0, 0));
        bangkuA2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuA2.setForeground(new java.awt.Color(255, 255, 255));
        bangkuA2.setText("A2");
        bangkuA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA2ActionPerformed(evt);
            }
        });

        bangkuA3.setBackground(new java.awt.Color(255, 0, 0));
        bangkuA3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuA3.setForeground(new java.awt.Color(255, 255, 255));
        bangkuA3.setText("A3");
        bangkuA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA3ActionPerformed(evt);
            }
        });

        bangkuA4.setBackground(new java.awt.Color(255, 0, 0));
        bangkuA4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuA4.setForeground(new java.awt.Color(255, 255, 255));
        bangkuA4.setText("A4");
        bangkuA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuA4ActionPerformed(evt);
            }
        });

        bangkuB1.setBackground(new java.awt.Color(255, 0, 0));
        bangkuB1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuB1.setForeground(new java.awt.Color(255, 255, 255));
        bangkuB1.setText("B1");
        bangkuB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB1ActionPerformed(evt);
            }
        });

        bangkuC1.setBackground(new java.awt.Color(255, 0, 0));
        bangkuC1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuC1.setForeground(new java.awt.Color(255, 255, 255));
        bangkuC1.setText("C1");
        bangkuC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC1ActionPerformed(evt);
            }
        });

        bangkuB2.setBackground(new java.awt.Color(255, 0, 0));
        bangkuB2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuB2.setForeground(new java.awt.Color(255, 255, 255));
        bangkuB2.setText("B2");
        bangkuB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB2ActionPerformed(evt);
            }
        });

        bangkuC2.setBackground(new java.awt.Color(255, 0, 0));
        bangkuC2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuC2.setForeground(new java.awt.Color(255, 255, 255));
        bangkuC2.setText("C2");
        bangkuC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC2ActionPerformed(evt);
            }
        });

        bangkuB3.setBackground(new java.awt.Color(255, 0, 0));
        bangkuB3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuB3.setForeground(new java.awt.Color(255, 255, 255));
        bangkuB3.setText("B3");
        bangkuB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB3ActionPerformed(evt);
            }
        });

        bangkuB4.setBackground(new java.awt.Color(255, 0, 0));
        bangkuB4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuB4.setForeground(new java.awt.Color(255, 255, 255));
        bangkuB4.setText("B4");
        bangkuB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuB4ActionPerformed(evt);
            }
        });

        bangkuC3.setBackground(new java.awt.Color(255, 0, 0));
        bangkuC3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuC3.setForeground(new java.awt.Color(255, 255, 255));
        bangkuC3.setText("C3");
        bangkuC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC3ActionPerformed(evt);
            }
        });

        bangkuC4.setBackground(new java.awt.Color(255, 0, 0));
        bangkuC4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bangkuC4.setForeground(new java.awt.Color(255, 255, 255));
        bangkuC4.setText("C4");
        bangkuC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangkuC4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Layar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel9)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bangkuA1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bangkuA2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bangkuB1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bangkuC1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bangkuB2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bangkuC2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(bangkuA3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bangkuA4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bangkuB3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bangkuC3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bangkuB4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bangkuC4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bangkuA1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuA2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuA3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuA4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bangkuB4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bangkuB3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bangkuB1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bangkuB2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bangkuC2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bangkuC1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bangkuC3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bangkuC4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(backBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bangkuA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA1ActionPerformed
        // TODO add your handling code here:
        baris = "a";
        nomer = "1";
    }//GEN-LAST:event_bangkuA1ActionPerformed

    private void bangkuA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA2ActionPerformed
        // TODO add your handling code here:
        baris = "a";
        nomer = "2";
    }//GEN-LAST:event_bangkuA2ActionPerformed

    private void bangkuA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA3ActionPerformed
        // TODO add your handling code here:
        baris = "a";
        nomer = "3";
    }//GEN-LAST:event_bangkuA3ActionPerformed

    private void bangkuA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuA4ActionPerformed
        // TODO add your handling code here:
        baris = "a";
        nomer = "4";
    }//GEN-LAST:event_bangkuA4ActionPerformed

    private void bangkuB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB1ActionPerformed
        // TODO add your handling code here:
        baris = "b";
        nomer = "1";
    }//GEN-LAST:event_bangkuB1ActionPerformed

    private void bangkuC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC1ActionPerformed
        // TODO add your handling code here:
        baris = "c";
        nomer = "1";
    }//GEN-LAST:event_bangkuC1ActionPerformed

    private void bangkuB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB2ActionPerformed
        // TODO add your handling code here:
        baris = "b";
        nomer = "2";
    }//GEN-LAST:event_bangkuB2ActionPerformed

    private void bangkuC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC2ActionPerformed
        // TODO add your handling code here:
        baris = "c";
        nomer = "2";
    }//GEN-LAST:event_bangkuC2ActionPerformed

    private void bangkuB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB3ActionPerformed
        // TODO add your handling code here:
        baris = "b";
        nomer = "3";
    }//GEN-LAST:event_bangkuB3ActionPerformed

    private void bangkuB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuB4ActionPerformed
        // TODO add your handling code here:
        baris = "b";
        nomer = "4";
    }//GEN-LAST:event_bangkuB4ActionPerformed

    private void bangkuC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC3ActionPerformed
        // TODO add your handling code here:
        baris = "c";
        nomer = "3";
    }//GEN-LAST:event_bangkuC3ActionPerformed

    private void bangkuC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangkuC4ActionPerformed
        // TODO add your handling code here:
        baris = "c";
        nomer = "4";
    }//GEN-LAST:event_bangkuC4ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LihatBangku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatBangku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatBangku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatBangku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatBangku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bangkuA1;
    private javax.swing.JButton bangkuA2;
    private javax.swing.JButton bangkuA3;
    private javax.swing.JButton bangkuA4;
    private javax.swing.JButton bangkuB1;
    private javax.swing.JButton bangkuB2;
    private javax.swing.JButton bangkuB3;
    private javax.swing.JButton bangkuB4;
    private javax.swing.JButton bangkuC1;
    private javax.swing.JButton bangkuC2;
    private javax.swing.JButton bangkuC3;
    private javax.swing.JButton bangkuC4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
