package Praktikum6.Percobaan2_1;

public class Manager extends Karyawan {
    int tunjangan;
    Manager(){

    }
    void tampilDataManager(){
        super.tampilData();
        System.out.println("Tunjangan\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t: Rp " + (gaji + tunjangan));
    }
}
