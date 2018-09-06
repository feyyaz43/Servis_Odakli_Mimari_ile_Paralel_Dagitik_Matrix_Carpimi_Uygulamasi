/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paket1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Feyyaz
 */
@WebService(serviceName = "MyWebService1")
public class MyWebService1 {

    /**
     * This is a sample web service operation
     */
    int[][] matris_2;
    int sayac = 0;
    
    @WebMethod(operationName = "matris_boyut_ayarla")
    public void matris_boyut_ayarla(@WebParam(name = "matris_boyut") int matris_boyut) {
        matris_2 = new int[matris_boyut][matris_boyut];
    }

    @WebMethod(operationName = "ikinci_matris_al")
    public void ikinci_matris_al(@WebParam(name = "satir_no") int satir_no, @WebParam(name = "matris_2_satir") int[] matris_2_satir) {
        int satir_sayisi = matris_2_satir.length;
        for (int i = 0; i < satir_sayisi; i++) {
            matris_2[satir_no][i] = matris_2_satir[i];
        }
    }

    @WebMethod(operationName = "carpim")
    public int[] carpim(@WebParam(name = "satir_no") int satir_no, @WebParam(name = "satir") int[] satir) {

        int topla = 0;
        int[] donen_satir = new int[satir.length + 1];
        donen_satir[0] = satir_no;

        
                //ÇARPMA İŞLEMİ                                     ******************************
        for (int k = 0; k < satir.length; k++) {            
            topla = 0;
            for (int m = 0; m < satir.length; m++) {
                topla = topla + satir[m] * matris_2[m][k];
            }
            donen_satir[k + 1] = topla;
        }

        return donen_satir;
    }

}
