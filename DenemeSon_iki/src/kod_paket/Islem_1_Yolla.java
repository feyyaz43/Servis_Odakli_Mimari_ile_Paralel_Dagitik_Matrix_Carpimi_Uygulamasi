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
public class Islem_1_Yolla implements Runnable {

    LinkedBlockingQueue<Integer> matris_2_kuyruk_1;
    List<Integer> matris2;
    List<Integer> matris_2_satir = new ArrayList<>();
    int gelen_matris_2_no;
    int satir_sayisi;

    public Islem_1_Yolla(int satir_sayisi, LinkedBlockingQueue<Integer> matris_2_kuyruk, List<Integer> matris2) {
        this.matris_2_kuyruk_1 = matris_2_kuyruk;
        this.matris2 = matris2;
        this.satir_sayisi = satir_sayisi;
    }

    @Override
    public void run() {
        
        matrisBoyutAyarla(satir_sayisi);
        
        while (true) {
            try {
                gelen_matris_2_no = matris_2_kuyruk_1.take();
            } catch (InterruptedException ex) {
                Logger.getLogger(Islem_1_Yolla.class.getName()).log(Level.SEVERE, null, ex);
            }

            matris_2_satir.removeAll(matris_2_satir);
            for (int i = 0; i < satir_sayisi; i++) {
                matris_2_satir.add(matris2.get(gelen_matris_2_no * satir_sayisi + i));
            }

//            System.out.println(gelen_matris_2_no+ " ---" + matris_2_satir.size());
            ikinciMatrisAl(gelen_matris_2_no,matris_2_satir);
//            System.out.println(gelen_matris_2_no+ " ---" + matris_2_satir.size());
        }
    }    

    private static void matrisBoyutAyarla(int matrisBoyut) {
        pack1.MyWebService1_Service service = new pack1.MyWebService1_Service();
        pack1.MyWebService1 port = service.getMyWebService1Port();
        port.matrisBoyutAyarla(matrisBoyut);
    }

    private static void ikinciMatrisAl(int satirNo, java.util.List<java.lang.Integer> matris2Satir) {
        pack1.MyWebService1_Service service = new pack1.MyWebService1_Service();
        pack1.MyWebService1 port = service.getMyWebService1Port();
        port.ikinciMatrisAl(satirNo, matris2Satir);
    }




    
}
