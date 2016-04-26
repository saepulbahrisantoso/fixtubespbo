/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author MR.SBS
 */
public class Perjalanan {
    private PaketWisata paket;
    private ArrayList<Pelanggan> turis;
    private int nomorPerjalanan;
    private int jumlahorang;
    private int hargaTotal;
    private int tmpidPaket;
    private int tmpidPelanggan;
    
    
    public Perjalanan(Pelanggan p, PaketWisata paket, int hargaTotal, int jumlahorang){
        turis = new ArrayList<Pelanggan>();
        turis.add(p);
        this.paket = paket;
        this.hargaTotal = hargaTotal;
        this.jumlahorang = jumlahorang;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public int getJumlahorang() {
        return jumlahorang;
    }
    
    public Perjalanan (int nomorPerjalanan, int idPaket, int idPelanggan, int hartot, int jumlahorang){
        this.nomorPerjalanan = nomorPerjalanan;
        this.tmpidPaket = idPaket;
        this.tmpidPelanggan = idPelanggan;
        this.hargaTotal = hartot;
        this.jumlahorang = jumlahorang;
    }

    public int getTmpidPaket() {
        return tmpidPaket;
    }

    public int getTmpidPelanggan() {
        return tmpidPelanggan;
    }
    
    public int getId(){
        return nomorPerjalanan;
    }
    public void addPelanggan(Pelanggan p){
        turis.add(p);
    }
    public void removePelanggan(String nama) {
        for(int i=0; i<turis.size();i++){
            if(turis.get(i).getNama().equals(nama)){
                turis.remove(i);
            }
        }
    }
    
    public void setPaket(PaketWisata paket){
        this.paket = paket;
    }
    
    public void setNomorPerjalanan(int nomorPerjalanan){
        this.nomorPerjalanan = nomorPerjalanan;
    }
    
    public int getNomorPerjalanan(){
        return nomorPerjalanan;
    }
    
    public PaketWisata getPaket(){
       return paket;
    }
    
    public ArrayList<Pelanggan> getAllPelanggan(){
        return turis;
    }
    
    public int getJumlahPelanggan(){
        return turis.size();
    }
    
}
