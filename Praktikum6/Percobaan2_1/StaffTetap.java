package Praktikum6.Percobaan2_1;

public class StaffTetap extends Staff {
    String golongan;
    int asuransi;

    StaffTetap(){

    }
    StaffTetap(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    void tampilDataStaffTetap(){
        super.tampilDataStaff();
        System.out.println("Golongan\t: " + golongan);
        System.out.println("Jumlah Asuransi\t: Rp " + asuransi);
        System.out.println("Total Gaji\t: Rp " + (gaji + lembur - potongan - asuransi));
    }
}
