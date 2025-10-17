package Praktikum6.Percobaan2_1;

public class Staff extends Karyawan {
    int lembur, potongan;
    Staff(){

    }
    Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    void tampilDataStaff(){
        super.tampilData();
        System.out.println("Lembur\t\t: Rp " + lembur);
        System.out.println("Potongan\t: Rp " + potongan);
        System.out.println("Total Gaji\t: Rp " + (gaji + lembur - potongan));
    }
}
