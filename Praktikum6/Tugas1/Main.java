package Praktikum6.Tugas1;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(5);

        Dosen d1 = new Dosen("123", "Albert", "Jakarta");
        d1.setSKS(10);

        Dosen d2 = new Dosen("124", "Speed", "Bandung");
        d2.setSKS(8);

        daftar.addPegawai(d1);
        daftar.addPegawai(d2);

        daftar.printSemuaGaji();
    }
}
