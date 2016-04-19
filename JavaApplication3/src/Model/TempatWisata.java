/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 1301144328_HendrawanIF3008
 */
public class TempatWisata {
    private int idWisata;
    private String nama;
    private String kota;
    private String provinsi;
    private String jeniswisata;

    public TempatWisata(int idWisata,String nama, String kota, String provinsi, String jeniswisata) {
        this.idWisata = idWisata;
        this.nama = nama;
        this.kota = kota;
        this.provinsi = provinsi;
        this.jeniswisata = jeniswisata;
    }
    
    public TempatWisata(String nama, String kota, String provinsi, String jeniswisata) {
        this.nama = nama;
        this.kota = kota;
        this.provinsi = provinsi;
        this.jeniswisata = jeniswisata;
    }

    public int getId(){
        return idWisata;
    }
    
    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }
    
    public String getProvinsi() {
        return provinsi;
    }
    
    public void setIdTempatWisata(int idWisata){
        this.idWisata = idWisata;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    
    public void setJenisWisata(String jeniswisata){
        this.jeniswisata = jeniswisata;
    }
    
    public String getJenisWisata(){
        return jeniswisata;
    }

    @Override
    public String toString() {
       return (" Tempat Wisata   : " +this.getNama()+ '\n' +
               " Kota  : "+ this.getKota() + '\n' +
               " Provinsi : " + this.getProvinsi());
    }
}
