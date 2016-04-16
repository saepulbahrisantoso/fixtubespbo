/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MR.SBS
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Model.Pelanggan;
import Model.Petugas;
import Model.Perjalanan;
import Model.TempatWisata;
import Model.PaketWisata;


public class Driver {
/////////////////////////////////// MENU UTAMA //////////////////////////////////
    private List<Petugas> daftarPetugas = new ArrayList<Petugas>();
    private List<Pelanggan> daftarPelanggan = new ArrayList<Pelanggan>();
    private List<Perjalanan> daftarPerjalanan = new ArrayList<Perjalanan>();
    private List<TempatWisata> daftarTempatWisata = new ArrayList<TempatWisata>();
    private List<PaketWisata> daftarPaketWisata = new ArrayList<PaketWisata>();
    
    public void addPetugas(Petugas pet){
        daftarPetugas.add(pet);
    }
    
    public void addPelanggan(Pelanggan pel){
        daftarPelanggan.add(pel);
    }
    
    public void addPerjalanan(Perjalanan per){
        daftarPerjalanan.add(per);
    }
    
    public Petugas getPetugas(int id) {
        return getListPetugasFromFile().get(id);
    }
    
    public Pelanggan getPelanggan(int id) {
        return getListPelangganFromFile().get(id);
    }
    
    public PaketWisata getPaketWisata(int id) {
        return getListPaketWisataFromFile().get(id);
    }
    
    public TempatWisata getTempatWisata(int id) {
        return getListTempatWisataFromFile().get(id);
    }
    
    public Perjalanan getPerjalanan(int id){
        return getListPerjalananFromFile().get(id);
    }
    
    public void deletePetugas(int id) {
        daftarPetugas.remove(id);
    }
    
    public void deletePelanggan(int id) {
        daftarPelanggan.remove(id);
    }
    
    public void deletePaketWisata(int id) {
        daftarPaketWisata.remove(id);
    }
    
    public void deleteTempatWisata(int id) {
        daftarTempatWisata.remove(id);
    }
    
    public void deletePerjalanan(int id){
        daftarPerjalanan.remove(id);
    }
    
    public void addPelangganToPerjalanan(Perjalanan per, Pelanggan pel) {
        per.addPelanggan(pel);
    }
    
    public void addTempatWisataToPaketWisata(PaketWisata paket, TempatWisata TW) {
        paket.addTempatWisata(TW);
    }
    
    public void setPaketToPerjalanan(Perjalanan per, PaketWisata paket) {
       per.setPaket(paket);
    }
    
    public void removePelangganFromPerjalanan(Perjalanan per, Pelanggan p) {
        String nama = p.getNama();
        per.removePelanggan(nama);
    }
    
    public ArrayList<Pelanggan> viewAllPelangganDoingPerjalanan(Perjalanan per) {
        return per.getAllPelanggan();
    }
    
    public void viewAllPelanggan(){
        for (int i = 0; i < getListPelangganFromFile().size(); i++) {
            System.out.println(i);
            System.out.println(" Nama : " + getListPelangganFromFile().get(i).getNama());
            System.out.println(" Alamat : " + getListPelangganFromFile().get(i).getAlamat());
            System.out.println(" Jenis Kelamin : " + getListPelangganFromFile().get(i).getJenisKelamin());
            System.out.println(" ID Pelanggan : " + getListPelangganFromFile().get(i).getId());
        }
    }
    
    public void viewAllPetugas(){
        for (int i = 0; i < getListPetugasFromFile().size(); i++) {
            System.out.println(i);
            System.out.println(" Nama : " + getListPetugasFromFile().get(i).getNama());
            System.out.println(" Alamat : " + getListPetugasFromFile().get(i).getAlamat());
            System.out.println(" Jenis Kelamin : " + getListPetugasFromFile().get(i).getJenisKelamin());
            System.out.println(" ID Pelanggan : " + getListPetugasFromFile().get(i).getId());
        }
    }
    
    public void viewAllPaketWisata(){
        for (int i = 0; i < getListPaketWisataFromFile().size(); i++) {
            System.out.println(i);
            System.out.println(" ID Paket Wisata : " + getListPaketWisataFromFile().get(i).getId());
            System.out.println(" Jenis Wisata : " + getListPaketWisataFromFile().get(i).getJenisWisata());
            System.out.println(" Biaya : " + getListPaketWisataFromFile().get(i).getBiaya());
            System.out.println(" Kapasitas : " + getListPaketWisataFromFile().get(i).getKapasitas());
        }
    }
    
    
    public void createFile() {
        try {
            Pelanggan pel1 = new Pelanggan("Saepul","Bandung","laki-laki",1);
            Pelanggan pel2 = new Pelanggan("Bahri","Solo","laki-laki",2);
            Pelanggan pel3 = new Pelanggan("Santoso","Jawa Barat","laki-laki",3);
            Pelanggan pel4 = new Pelanggan("Hendra","Karawang","laki-laki",4);
            Pelanggan pel5 = new Pelanggan("Wan","Panas","laki-laki",5);
            daftarPelanggan.add(pel1);
            daftarPelanggan.add(pel2);
            daftarPelanggan.add(pel3);
            daftarPelanggan.add(pel4);
            daftarPelanggan.add(pel5);
            
            Petugas pet1 = new Petugas("Ama","Kali","Perempuan",11);
            Petugas pet2 = new Petugas("Lia","Mantan","Perempuan",12);
            Petugas pet3 = new Petugas("Elma","Banjar","Perempuan",13);
            Petugas pet4 = new Petugas("Sari","Baru","Perempuan",14);
            Petugas pet5 = new Petugas("Wuhu","Indonesia","Perempuan",15);
            daftarPetugas.add(pet1);
            daftarPetugas.add(pet2);
            daftarPetugas.add(pet3);
            daftarPetugas.add(pet4);
            daftarPetugas.add(pet5);
            
            FileOutputStream fos1 = new FileOutputStream("pelanggan.txt");
            ObjectOutputStream obj1 = new ObjectOutputStream(fos1);

            FileOutputStream fos2 = new FileOutputStream("petugas.txt");
            ObjectOutputStream obj2 = new ObjectOutputStream(fos2);
                        
            FileOutputStream fos3 = new FileOutputStream("tempatwisata.txt");
            ObjectOutputStream obj3 = new ObjectOutputStream(fos3);
            
            FileOutputStream fos4 = new FileOutputStream("paketwisata.txt");
            ObjectOutputStream obj4 = new ObjectOutputStream(fos4);
            
            FileOutputStream fos5 = new FileOutputStream("perjalanan.txt");
            ObjectOutputStream obj5 = new ObjectOutputStream(fos5);
            
            obj1.writeObject(daftarPelanggan);
            obj2.writeObject(daftarPetugas);
            obj3.writeObject(daftarTempatWisata);
            obj4.writeObject(daftarPaketWisata);
            obj5.writeObject(daftarPerjalanan);

            obj1.flush();
            obj2.flush();
            obj3.flush();
            obj4.flush();
            obj5.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<Pelanggan> getListPelangganFromFile() {
        try {
            FileInputStream fis = new FileInputStream("pelanggan.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Pelanggan> pelanggan = (ArrayList<Pelanggan>)ois.readObject();
            return pelanggan;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Petugas> getListPetugasFromFile() {
        try {
            FileInputStream fis = new FileInputStream("petugas.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Petugas> petugas = (ArrayList<Petugas>)ois.readObject();
            return petugas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ArrayList<TempatWisata> getListTempatWisataFromFile() {
        try {
            FileInputStream fis = new FileInputStream("tempatwisata.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<TempatWisata> tempatwisata = (ArrayList<TempatWisata>)ois.readObject();
            return tempatwisata;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ArrayList<PaketWisata> getListPaketWisataFromFile() {
        try {
            FileInputStream fis = new FileInputStream("paketwisata.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<PaketWisata> paket = (ArrayList<PaketWisata>)ois.readObject();
            return paket;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
        
        public ArrayList<Perjalanan> getListPerjalananFromFile() {
        try {
            FileInputStream fis = new FileInputStream("perjalanan.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Perjalanan> jalan = (ArrayList<Perjalanan>)ois.readObject();
            return jalan;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
        
    public void MenuAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Admin");
        System.out.println("1. Menu Petugas");
        System.out.println("2. Menu Pelanggan");
        System.out.println("3. Menu Tempat wisata");
        System.out.println("4. Menu Paket wisata");
        System.out.println("5. Menu Perjalanan");
        System.out.println("6. Exit"); 
        System.out.print("Pilihan : "); 
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuPetugas();
                     break;
            case 2 : //MenuPelanggan();
                     break;
            case 3 : //MenuTempatWisata();
                     break;
            case 4 : //MenuPaketWisata();
                     break;
            case 5 : //MenuPerjalanan();
                     break;
            case 6 : 
                     break;
            default : System.out.println("Salah input");
                     break;
        }
    }
    
    public void MenuPetugas(List<Petugas> listpetugas){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Petugas");
        System.out.println("1. Tambah Petugas");
        System.out.println("2. Cari Petugas");
        System.out.println("3. Hapus Petugas");
        System.out.println("4. Lihat petugas");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        int id;
        Petugas x;
        switch (pilih) {
            case 1 :
                    int jumlah = listpetugas.size();
                    System.out.println("Nama : "); String nama = scanner.next();
                    System.out.println("Alamat : ");  String alamat = scanner.next();
                    System.out.println("Jenis Kelamin : "); String jk = scanner.next();
                    jumlah++;
                    AddPetugas(nama,alamat,jk,jumlah,listpetugas);
                    System.out.println("Petugas berhasi ditambahkan ! ");
                    MenuPetugas(listpetugas);
                    break;
            case 2 : 
                    System.out.println("Masukkan id petugas yang akan dicari : "); id = scanner.nextInt();
                    x = Search(listpetugas,id);
                    if(x == null){
                        System.out.println("Petugas tersebut tidak ada");
                    } else {
                        System.out.println("Data Petugas");
                        System.out.println("ID : " + x.getId());
                        System.out.println("Nama : " + x.getNama());
                        System.out.println("Alamat : " + x.getAlamat());
                        System.out.println("Jenis Kelamin : " + x.getJenisKelamin());
                    }
                    MenuPetugas(listpetugas);
                    break;
            case 3 :
                    System.out.println("Masukkan id petugas yang akan dihapus : "); id = scanner.nextInt();
                    MenuPetugas(listpetugas);
                    break;
            case 4 :
                    for(Petugas petugas: listpetugas) {
                        System.out.println(petugas); 
                    }
                    System.out.println("asasas1");
                    MenuPetugas(listpetugas);
                    break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
            break;
        }
     }
     }


/*    public static void AddPetugas(String nama, String alamat, String jk, int jumlah, List list) {
         Petugas petugas = new Petugas(nama,alamat,jk,jumlah);
         list.add(petugas);
     }
     public static Petugas Search(List<Petugas> list, int id) {
        Petugas x = null;
        for(int i=0;i<list.size();i++){
            if (list.get(i).getId() == id) {
                x = list.get(i);
                break;
            }
        }
        return x;
     }
 
    
public void MenuUtama(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Utama Sistem biro perjalanan");
        System.out.println("1. Menu admin");
        System.out.println("2. Menu non admin [MASIH BETA, PROGRESS SELANJUTNYA KARENA TIDAK ADA DI PROPOSAL]" );
        System.out.print("Pilihan : "); 
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : MenuAdmin();
                     break;
            case 2 : MenuNonAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
    }
    
/////////////////////////////////// MENU ADMIN //////////////////////////////////

     public static void MenuPelanggan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Pelanggan");
        System.out.println("1. Tambah Pelanggan");
        System.out.println("2. Cari Pelanggan");
        System.out.println("3. Hapus Pelanggan");
        System.out.println("4. Lihat Pelanggan");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        List<Pelanggan> listpelanggan = new ArrayList<Pelanggan>();
        switch (pilih) {
            case 1 : 
                    int jumlah = listpelanggan.size();
                    System.out.println("Nama : "); String nama = scanner.next();
                    System.out.println("Alamat : ");  String alamat = scanner.next();
                    System.out.println("Jenis Kelamin : "); String jk = scanner.next();
                    jumlah++;
                    AddPelanggan(nama,alamat,jk,jumlah,listpelanggan);
                    System.out.println("Pelanggan berhasil ditambahkan ! ");
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     
     public static void AddPelanggan(String nama, String alamat, String jk, int jumlah, List list) {
         Pelanggan pelanggan = new Pelanggan(nama,alamat,jk,jumlah);
         list.add(pelanggan);
     }
     public static void MenuTempatWisata(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Tempat Wisata");
        System.out.println("1. Tambah Tempat Wisata");
        System.out.println("2. Edit Tempat Wisata");
        System.out.println("3. Hapus Tempat Wisata");
        System.out.println("4. Lihat Tempat Wisata");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : //MenuPetugas(listpetugas);
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     public static void MenuPaketWisata(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Paket Wisata");
        System.out.println("1. Tambah Paket Wisata");
        System.out.println("2. Edit Paket Wisata");
        System.out.println("3. Hapus Paket Wisata");
        System.out.println("4. Lihat PaketWisata");
        System.out.println("5. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : //MenuPetugas();
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     public static void MenuPerjalanan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Kelola Petugas");
        System.out.println("1. Edit Perjalanan");
        System.out.println("2. Hapus Perjalanan");
        System.out.println("3. Lihat Data Perjalanan");
        System.out.println("4. Kembali");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : //MenuPetugas(listpetugas);
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuAdmin();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
     }
     
/////////////////////////////////// MENU NON ADMIN //////////////////////////////////
    
    public static void MenuNonAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu pelanggan");
        System.out.println("1. Lihat data pelanggan");
        System.out.println("2. Menu Pelanggan");
        System.out.println("3. Menu Tempat wisata");
        System.out.println("4. Menu Paket wisata");
        System.out.println("5. Menu perjalanan");
        System.out.println("6. Exit");
        System.out.print("Pilihan : ");
        int pilih = scanner.nextInt();
        switch (pilih) {
            case 1 : //MenuPetugas(listpetugas);
                     break;
            case 2 : MenuPelanggan();
                     break;
            case 3 : MenuTempatWisata();
                     break;
            case 4 : MenuPaketWisata();
                     break;
            case 5 : MenuPerjalanan();
                     break;
            case 6 : MenuUtama();
                     break;
            default : System.out.println("Salah input");
                     break;
        }
    }
    
} 
*/