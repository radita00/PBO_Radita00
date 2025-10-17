package Praktikum2;

public class Nomer5 {
    public static void main(String[] args) {
    int [] angka = {1,2,3};
    System.out.println("awal program");
    try {
        System.out.println(angka[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Terjadi error: Indeks array di luar batas!");
    }
    System.out.println("akhir program");   
    }
}
