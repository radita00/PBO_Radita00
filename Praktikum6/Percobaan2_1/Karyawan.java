package Praktikum6.Percobaan2_1;

public class Karyawan {
    String nama, alamat, jk;
    int umur, gaji;

    Karyawan(){

    }
    Karyawan(String nama, String alamat, String jk, int umur, int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    void tampilData(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Jenis Kelamin\t: " + jk);
        System.out.println("Umur\t\t: " + umur + " tahun");
        System.out.println("Gaji\t\t: Rp " + gaji);
    }
}
