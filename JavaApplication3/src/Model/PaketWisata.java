/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amalia
 */
public class PaketWisata {
    private ArrayList<TempatWisata> daftarTujuanWisata;
    private int Kapasitas;
    private double Biaya;
    private int idPaket;
    private String tmpnama;
    private String tmpkota;
    private String tmpprovinsi;
	
    public PaketWisata(int idPaket, TempatWisata w, int Kap, double Biaya){
        daftarTujuanWisata = new ArrayList<TempatWisata>();
        daftarTujuanWisata.add(w);
        this.Kapasitas = Kap;
        this.Biaya = Biaya;
        this.idPaket = idPaket;
    }
    
    public PaketWisata(TempatWisata w, int Kap, double Biaya){
        daftarTujuanWisata = new ArrayList<TempatWisata>();
        daftarTujuanWisata.add(w);
        this.Kapasitas = Kap;
        this.Biaya = Biaya;
        this.idPaket = idPaket;
    }
    
    public PaketWisata(int idPaket, int kapasitas, int biaya, String namatempat, String kota, String provinsi){
        this.idPaket = idPaket;
        this.Kapasitas = kapasitas;
        this.tmpnama = namatempat;
        this.tmpkota = kota;
        this.tmpprovinsi = provinsi;
    }
    
    public int getId(){
        return idPaket;
    }
    
    public void setIdPaketWisata(int idPaket){
        this.idPaket = idPaket;
    }
    
    public void addTempatWisata(TempatWisata w){
        daftarTujuanWisata.add(w);
    }
    
    public TempatWisata getTempatWisata(int id){
        return daftarTujuanWisata.get(id);
    }
    
    public List<TempatWisata> getList(){
        return daftarTujuanWisata;
    }
    
    public double getBiaya(){
        return Biaya;
    }
    
    public int getKapasitas(){
        return Kapasitas;
    }
    
    public void setKapasitas(int Kapasitas){
        this.Kapasitas=Kapasitas;
    }
	
    public void setBiaya(int Biaya){
	this.Biaya=Biaya;
    }
    
    //GET TMP SEMENTARA
    public String getTMPnama(){
        return tmpnama;
    }
    public String getTMPkota(){
        return tmpkota;
    }
    public String getTMPprovinsi(){
        return tmpprovinsi;
    }
    
}

