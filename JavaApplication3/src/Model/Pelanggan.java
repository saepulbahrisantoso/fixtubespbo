/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MR.SBS
 */
public class Pelanggan extends Orang {
    int idPelanggan;
    
    public Pelanggan(String nama, String alamat, String jeniskelamin, int idPelanggan){
        super(nama,alamat,jeniskelamin);
        this.idPelanggan = idPelanggan;
    }
    public Pelanggan(String nama, String alamat, String jeniskelamin){
        super(nama,alamat,jeniskelamin);
    }
    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public int getIdPelanggan() {
        return idPelanggan;
    }
    @Override
    public String display() {
       return (" Id Pelanggan   : " +this.getIdPelanggan()+ '\n' +
               " Nama  : "+ this.getNama() + '\n' +
               " Alamat : "+ this.getAlamat() + '\n' +
               " Jenis Kelamin : " + this.getJenisKelamin());
    }
}