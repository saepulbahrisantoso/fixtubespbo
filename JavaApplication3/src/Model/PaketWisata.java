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
    private String namaPaket;
    private int Kapasitas;
    private double Biaya;
    private int idPaket;
    private int tmpidWisata;
    	
    public PaketWisata(int idPaket, TempatWisata w, int Kap, double Biaya, String namaPaket){
        daftarTujuanWisata = new ArrayList<TempatWisata>();
        daftarTujuanWisata.add(w);
        this.Kapasitas = Kap;
        this.Biaya = Biaya;
        this.idPaket = idPaket;
        this.namaPaket = namaPaket;
    }
    
    public PaketWisata(TempatWisata w, int Kap, double Biaya, String namaPaket){
        daftarTujuanWisata = new ArrayList<TempatWisata>();
        daftarTujuanWisata.add(w);
        this.Kapasitas = Kap;
        this.Biaya = Biaya;
        this.idPaket = idPaket;
        this.namaPaket = namaPaket;
    }
    
    public PaketWisata(int idPaket, int kapasitas, double biaya, int idWisata, String namaPaket){
        this.idPaket = idPaket;
        this.Kapasitas = kapasitas;
        this.Biaya = biaya;
        this.tmpidWisata = idWisata;
        this.namaPaket = namaPaket;
    }
    
    public int getTMPidWisata(){
        return tmpidWisata;
    }
    
    public int getId(){
        return idPaket;
    }

    public String getNamaPaket() {
        return namaPaket;
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
    
}

