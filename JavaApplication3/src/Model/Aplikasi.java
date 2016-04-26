/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;


import java.util.ArrayList;

/**
 *
 * @author MR.SBS
 */
public class Aplikasi {
    private ArrayList<Pelanggan> daftarPelanggan;
    private ArrayList<Petugas> daftarPetugas;
    private ArrayList<TempatWisata> daftarTempatWisata;
    private ArrayList<PaketWisata> daftarPaketWisata;
    private ArrayList<Perjalanan> daftarPerjalanan;
    private Database data;
    
    public Aplikasi() {
        this.daftarPelanggan = new ArrayList<>();
        this.daftarPetugas = new ArrayList<>();
        this.daftarTempatWisata = new ArrayList<>();
        this.daftarPaketWisata = new ArrayList<>();
        this.daftarPerjalanan = new ArrayList<>();
        this.data = new Database();
        data.connect();
    }
    
    public int createPelanggan(String nama, String alamat, String jeniskelamin) {
        Pelanggan p = new Pelanggan(nama, alamat,jeniskelamin);
        daftarPelanggan.add(p);
        data.savePelanggan(p);
        return p.getIdPelanggan();
    }
    
    public int createPetugas(String nama, String alamat, String jeniskelamin) {
        Petugas p = new Petugas(nama, alamat,jeniskelamin);
        daftarPetugas.add(p);
        data.savePetugas(p);
        return p.getIdPetugas();
    }
    
    public int createTempatWisata(String nama, String kota, String provinsi, String jeniswisata){
        TempatWisata tw = new TempatWisata(nama,kota,provinsi,jeniswisata);
        daftarTempatWisata.add(tw);
        data.saveTempatWisata(tw);
        return tw.getId();
    }
    
    public int createPaketWisata(TempatWisata tw, int kapasitas, double biaya, String namaPaket){
        PaketWisata pw = new PaketWisata(tw,kapasitas,biaya,namaPaket);
        daftarPaketWisata.add(pw);
        data.savePaketWisata(pw, tw);
        return pw.getId();
    }
    
    public int createPerjalanan(Pelanggan p, PaketWisata paket, int totalharga, int jumlahorang){
        Perjalanan per = new Perjalanan(p,paket,totalharga,jumlahorang);
        daftarPerjalanan.add(per);
        data.savePerjalanan(per, p, paket);
        return per.getId();
    }
    
    public Pelanggan getPelanggan(int idP) {
        for (Pelanggan p : daftarPelanggan) {
            if (p.getIdPelanggan() == idP) {
                return p;
            }
        }
        Pelanggan p = data.getPelanggan(idP);
        daftarPelanggan.add(p);
        return p;
    }
    
    public Petugas getPetugas(int idP) {
        for (Petugas p : daftarPetugas) {
            if (p.getIdPetugas() == idP) {
                return p;
            }
        }
        Petugas p = data.getPetugas(idP);
        daftarPetugas.add(p);
        return p;
    }
    
    public TempatWisata getTempatWisata(int idP) {
        for (TempatWisata p : daftarTempatWisata) {
            if (p.getId() == idP) {
                return p;
            }
        }
        TempatWisata p = data.getTempatWisata(idP);
        daftarTempatWisata.add(p);
        return p;
    }
    
    public PaketWisata getPaketWisata(int idP) {
        for (PaketWisata p : daftarPaketWisata) {
            if (p.getId() == idP) {
                return p;
            }
        }
        PaketWisata p = data.getPaketWisata(idP);
        daftarPaketWisata.add(p);
        return p;
    }
   
    public Perjalanan getPerjalanan(int idP) {
        for (Perjalanan p : daftarPerjalanan) {
            if (p.getId() == idP) {
                return p;
            }
        }
        Perjalanan p = data.getPerjalanan(idP);
        daftarPerjalanan.add(p);
        return p;
    }
    
    public void updatePelanggan(Pelanggan p) {
        data.updatePelanggan(p);
    }
    
    public void updatePetugas(Petugas p) {
        data.updatePetugas(p);
    }
    
    public void updateTempatWisata(TempatWisata p) {
        data.updateTempatWisata(p);
    }
    
    public void updatePaketWisata(PaketWisata p) {
        data.updatePaketWisata(p);
    }
    
    public void updatePerjalanan(Perjalanan p) {
        data.updatePerjalanan(p);
    }
    
    public void hapusPelanggan(Pelanggan p){
        data.HapusPelanggan(p);
    }
    
    public void hapusPetugas(Petugas p){
        data.HapusPetugas(p);
    }
    
    public void hapusTempatWisata(TempatWisata tw){
        data.HapusTempatWisata(tw);
    }
    
    public void hapusPaketWisata(PaketWisata tw){
        data.HapusPaketWisata(tw);
    }
    
    public void hapusPerjalanan(Perjalanan tw){
        data.HapusPerjalanan(tw);
    }
    
    public String[] getListIdPelanggan() {
        return data.getListIDPelanggan();
    }
}
