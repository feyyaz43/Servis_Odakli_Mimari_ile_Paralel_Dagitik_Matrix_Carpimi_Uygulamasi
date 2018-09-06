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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Feyyaz
 */
public class Sonuc_Yazdir implements Runnable {

    int satir_sayisi;
    List<List<Integer>> sonuc_listesi;

    File dosya3;
    FileWriter yazici3 = null;
    BufferedWriter yaz3 = null;

    public Sonuc_Yazdir(int satir_sayisi, List<List<Integer>> sonuc_listesi) {
        this.satir_sayisi = satir_sayisi;
        this.sonuc_listesi = sonuc_listesi;
    }

    @Override
    public void run() {

        while (true) {
            if (sonuc_listesi.size() == satir_sayisi) {
                
                MyJFrame.yazdir_basla = System.nanoTime();

                dosya3 = new File("D://txt_dosyaları//matris_sonuc_" + satir_sayisi + ".txt");
                if (!dosya3.exists()) {
                    try {
                        dosya3.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Sonuc_Yazdir.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                try {
                    yazici3 = new FileWriter(dosya3, false);
                    yaz3 = new BufferedWriter(yazici3);
                } catch (IOException ex) {
                    Logger.getLogger(Sonuc_Yazdir.class.getName()).log(Level.SEVERE, null, ex);
                }

                for (int i = 0; i < satir_sayisi; i++) {
                    for (int j = 0; j < satir_sayisi; j++) {
                        if (sonuc_listesi.get(j).get(0) == i) {
                            for (int k = 0; k < satir_sayisi; k++) {
                                try {
                                    yaz3.write(sonuc_listesi.get(j).get(k + 1) + "\t");
                                } catch (IOException ex) {
                                    Logger.getLogger(Sonuc_Yazdir.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            try {
                                yaz3.write("\n");
                            } catch (IOException ex) {
                                Logger.getLogger(Sonuc_Yazdir.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }

                try {
                    yaz3.close();
                } catch (IOException ex) {
                    Logger.getLogger(Sonuc_Yazdir.class.getName()).log(Level.SEVERE, null, ex);
                }

                MyJFrame.yazdir_bitis = System.nanoTime();
                
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sonuc_Yazdir.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sonuc_Yazdir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
