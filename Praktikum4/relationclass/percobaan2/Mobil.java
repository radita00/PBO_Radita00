package Praktikum4.relationclass.percobaan2;

public class Mobil {
    private String nama;
    private int biaya;

    public Mobil(){

    }

    public void setNama(String newNama){
        this.nama = newNama;
    } 

    public String getNama(){
        return nama;
    }

    public void setBiaya(int newBiaya){
        this.biaya = newBiaya;
    }

    public int getBiaya(){
        return biaya;
    }

    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
