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
public class Pelanggan extends Orang implements Serializable {
    int idPelanggan;
    
    public Pelanggan(String nama, String alamat, String jeniskelamin, int idPelanggan){
        super(nama,alamat,jeniskelamin);
        this.idPelanggan = idPelanggan;
    }
    void setId(int idPelanggan){
        this.idPelanggan=idPelanggan;
    }
    int getId(){
        return idPelanggan;
    }
    @Override
    public String display() {
       return (" Id Pelanggan   : " +this.getId()+ '\n' +
               " Nama  : "+ this.getNama() + '\n' +
               " Alamat : "+ this.getAlamat() + '\n' +
               " Jenis Kelamin : " + this.getJenisKelamin());
    }
}