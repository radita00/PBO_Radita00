package Praktikum6.Percobaan2_1;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap st = new StaffTetap("Budi", "Malang", "Laki-laki", 20, 2000000, 250000, 200000, "2A", 100000);
        st.tampilDataStaffTetap();

        StaffHarian sh = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        sh.tampilDataStaffHarian();
    }
}