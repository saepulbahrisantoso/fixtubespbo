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
    
    public String getNamaTempatWisata(){
        return daftarTujuanWisata.get(idPaket).getNama();
    }
    
    public String getKotaTempatWisata(){
        return daftarTujuanWisata.get(idPaket).getKota();
    }
    
    public String getProvinsiTempatWisata(){
        return daftarTujuanWisata.get(idPaket).getProvinsi();
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
}

