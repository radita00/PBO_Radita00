package Praktikum6.Percobaan2_1;

public class StaffHarian extends Staff {
    int jmlJamKerja;
    StaffHarian(){

    }
    StaffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    void tampilDataStaffHarian(){
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja\t: " + jmlJamKerja + " jam");
        System.out.println("Gaji Bersih\t: Rp " + (gaji*jmlJamKerja + lembur - potongan));
    }
}
