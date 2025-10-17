package Praktikum9.Tugas;

public class Dosen extends Manusia {
    @Override
    void makan() {
        System.out.println("Dosen makan saat istirahat mengajar");
    }

    void lembur() {
        System.out.println("Dosen lembur mengoreksi tugas mahasiswa");
    }
}

