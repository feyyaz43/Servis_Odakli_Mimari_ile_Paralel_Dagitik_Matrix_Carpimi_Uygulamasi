/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kod_paket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Feyyaz
 */
public class MyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyJFrame
     */
    LinkedBlockingQueue<Integer> islem_kuyruk = new LinkedBlockingQueue<>();
    LinkedBlockingQueue<Integer> matris_2_kuyruk_1 = new LinkedBlockingQueue<>();
    LinkedBlockingQueue<Integer> matris_2_kuyruk_2 = new LinkedBlockingQueue<>();
    List<List<Integer>> sonuc_listesi = new ArrayList<>();
    int kaca_kac;
    List<Integer> matris1 = new ArrayList<>();
    List<Integer> matris2 = new ArrayList<>();

    long islem_baslangic = 0;
    static long islem_bitis = 0;
    static long yazdir_basla = 0;
    static long yazdir_bitis = 0;

    public MyJFrame() {
        initComponents();
    }

    public void rasgele_sayi_dosya(int kaca_kac_deger) {

        Random rasgele = new Random();

        int sayi;
        FileWriter yazici1 = null;
        BufferedWriter yaz1 = null;
        FileWriter yazici2 = null;
        BufferedWriter yaz2 = null;

        File dosya1 = new File("D://txt_dosyaları//matris1_" + kaca_kac_deger + ".txt");

        if (!dosya1.exists()) {
            try {
                dosya1.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        File dosya2 = new File("D://txt_dosyaları//matris2_" + kaca_kac_deger + ".txt");
        if (!dosya2.exists()) {
            try {
                dosya2.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            yazici1 = new FileWriter(dosya1, false);
            yaz1 = new BufferedWriter(yazici1);
            yazici2 = new FileWriter(dosya2, false);
            yaz2 = new BufferedWriter(yazici2);
        } catch (IOException ex) {
            Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < kaca_kac_deger * kaca_kac_deger; i++) {
            sayi = 1 + rasgele.nextInt(100);
            matris1.add(sayi);
            sayi = 1 + rasgele.nextInt(100);
            matris2.add(sayi);
        }

        for (int i = 0; i < kaca_kac_deger; i++) {
            for (int j = 0; j < kaca_kac_deger; j++) {
                try {
                    yaz1.write(matris1.get(i * kaca_kac_deger + j) + "\t");
                    yaz2.write(matris2.get(i * kaca_kac_deger + j) + "\t");
                } catch (IOException ex) {
                    Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                yaz1.write("\n");
                yaz2.write("\n");
            } catch (IOException ex) {
                Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            yaz1.close();
            yaz2.close();
        } catch (IOException ex) {
            Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("satır sayısını giriniz : ");

        jLabel2.setText("süre : ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("çarp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        kaca_kac = Integer.parseInt(jTextField1.getText());

        for (int i = 0; i < kaca_kac; i++) {
            islem_kuyruk.add(i);
            matris_2_kuyruk_1.add(i);
            matris_2_kuyruk_2.add(i);
        }

        islem_baslangic = System.nanoTime();

        rasgele_sayi_dosya(kaca_kac);

        new Thread(new Islem_1_Yolla(kaca_kac, matris_2_kuyruk_1, matris2)).start();
        new Thread(new Islem_2_Yolla(kaca_kac, matris_2_kuyruk_2, matris2)).start();
        new Thread(new Islem_1(kaca_kac, matris_2_kuyruk_1, islem_kuyruk, matris1, sonuc_listesi)).start();
        new Thread(new Islem_2(kaca_kac, matris_2_kuyruk_2, islem_kuyruk, matris1, sonuc_listesi)).start();

        new Thread(new Sonuc_Yazdir(kaca_kac, sonuc_listesi)).start();

        
        
        //  GEÇEN SÜRE HESAPLAR.       *****
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (yazdir_bitis != 0) {
                        long fark1 = islem_bitis - islem_baslangic;
                        long fark2 = yazdir_bitis - yazdir_basla;
                        float toplam = ((float) fark1 / (float) 1000000000) + ((float) fark2 / (float) 1000000000);
                        jTextArea1.setText("geçen süre(sn) : " + toplam);

                        try {
                            Thread.sleep(1000000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MyJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        t.start();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}