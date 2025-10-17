package Praktikum9.Tugas;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
    public void tampilkanInformasi(int sudutA, int sudutB, int sisiA, int sisiB, int sisiC) {
        System.out.println("Total sudut jika diketahui satu sudut: " + totalSudut(sudutA));
        System.out.println("Total sudut jika diketahui dua sudut: " + totalSudut(sudutA, sudutB));
        System.out.println("Keliling segitiga (tiga sisi): " + keliling(sisiA, sisiB, sisiC));
        System.out.println("Keliling segitiga (dua sisi, sisi miring): " + keliling(sisiA, sisiB));
    }
}
