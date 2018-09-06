/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kod_paket;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Feyyaz
 */
public class Islem_1 implements Runnable {

    List<List<Integer>> sonuc_listesi;
    int satir_sayisi;
    LinkedBlockingQueue<Integer> islem1_kuyruk;
    LinkedBlockingQueue<Integer> matris_2_kuyruk_1;
    int gelen_satir_no;
    List<Integer> matris1_satir = new ArrayList<>();
    List<Integer> matris1 = new ArrayList<>();

    public Islem_1(int satir_sayisi, LinkedBlockingQueue<Integer> gelen_matris_2_kuy, LinkedBlockingQueue<Integer> gelen_no, List<Integer> m1, List<List<Integer>> sonuc_list) {
        this.satir_sayisi = satir_sayisi;
        this.matris_2_kuyruk_1 = gelen_matris_2_kuy;
        this.islem1_kuyruk = gelen_no;
        this.matris1 = m1;
        this.sonuc_listesi = sonuc_list;
    }

    @Override
    public void run() {

        while (true) {
            if (matris_2_kuyruk_1.size() == 0) {
                try {
                    gelen_satir_no = islem1_kuyruk.take();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Islem_1.class.getName()).log(Level.SEVERE, null, ex);
                }

                matris1_satir.removeAll(matris1_satir);
                for (int i = 0; i < satir_sayisi; i++) {
                    matris1_satir.add(matris1.get(gelen_satir_no * satir_sayisi + i));
                }

                List<Integer> carpim_sonucu = carpim(gelen_satir_no, matris1_satir);
                sonuc_listesi.add(carpim_sonucu);
                if (sonuc_listesi.size() == satir_sayisi) {
                    MyJFrame.islem_bitis = System.nanoTime();
                }
            }
        }

    }

    private static java.util.List<java.lang.Integer> carpim(int satirNo, java.util.List<java.lang.Integer> satir) {
        pack1.MyWebService1_Service service = new pack1.MyWebService1_Service();
        pack1.MyWebService1 port = service.getMyWebService1Port();
        return port.carpim(satirNo, satir);
    }
    
    
}
