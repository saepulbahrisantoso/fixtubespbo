/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author MR.SBS
 */
public class Petugas extends Orang implements Serializable {
    int idPetugas;
    
    public Petugas(String nama, String alamat, String jeniskelamin, int idPetugas){
        super(nama,alamat,jeniskelamin);
        this.idPetugas = idPetugas;
    }
    
    public Petugas(String nama, String alamat, String jeniskelamin){
        super(nama,alamat,jeniskelamin);
    }
    
    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }
    public int getIdPetugas() {
        return idPetugas;
    }
    @Override
    public String display() {
       return (" Id Petugas   : " +this.getIdPetugas()+ '\n' +
               " Nama  : "+ this.getNama() + '\n' +
               " Alamat : "+ this.getAlamat() + '\n' +
               " Jenis Kelamin : " + this.getJenisKelamin());
    }
}
