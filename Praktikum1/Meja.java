package Praktikum1;

public class Meja {
    private String bahan;
    private int panjang,lebar,tinggi;
    private int berat;

    public void setBahan(String newvalue){
        bahan = newvalue;
    }

    public void setUkuran(int p,int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public void setBerat(int newValue){
        berat = newValue;
    }

    public void cetakStatus() {
        System.out.println("Bahan Meja: " + bahan);
        System.out.println("Ukuran meja\nPanjang: " + panjang + "\nLebar:" + lebar + "\nTinggi: " + tinggi);
        System.out.println("Berat: " + berat + " g");
    }

    public void letakanBarang(String barang){
        System.out.println("Barang " + barang + " diletakan di meja");
    }
}
