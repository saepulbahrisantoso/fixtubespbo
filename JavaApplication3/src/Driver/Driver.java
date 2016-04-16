/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Model.Aplikasi;

/**
 *
 * @author MR.SBS
 */

public class Driver {
    public static void main(String[] argh){
        Aplikasi model = new Aplikasi();
        model.createPelanggan("Budi", "Bojongsoang","Laki");
        model.createPelanggan("Ali", "Dakol","Laki");
        String[] daftarId = model.getListIdPelanggan();
        for (int i = 0; i < daftarId.length; i++) {
            System.out.println(daftarId[i]);
        }    
    }
}