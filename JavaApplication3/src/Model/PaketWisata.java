/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Amalia
 */
public class PaketWisata {
    private ArrayList<TempatWisata> daftarTujuanWisata = new ArrayList<TempatWisata>();
    private String JenisWisata; 
    private int Kapasitas;
    private double Biaya;
    private int idPaket;
	
    public PaketWisata(int idPaket, TempatWisata w, String JW, int Kap, double Biaya){
        
    }
    
    public int getId(){
        return idPaket;
    }
    
    public void addTempatWisata(TempatWisata w){
        daftarTujuanWisata.add(w);
    }
    
    public ArrayList<TempatWisata> getAllWisata(){
        return daftarTujuanWisata;
    }
    
    public int getNWisata(){
        return daftarTujuanWisata.size();
    }
    
    public double getBiaya(){
        return Biaya;
    }
    
    public String getJenisWisata(){
        return JenisWisata;
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
	
    public void setJenisWisata(String JenisWisata){
        this.JenisWisata=JenisWisata;
    }
}

