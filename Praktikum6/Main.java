package Praktikum6;

public class Main {
    public static void main(String[] args) {
        BangunDatar persegiPanjang = new PersegiPanjang(5, 3);
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar segitiga = new Segitiga(6, 8);

        System.out.println("Persegi Panjang:");
        System.out.println("Luas = " + persegiPanjang.luas());
        System.out.println("Keliling = " + persegiPanjang.keliling());

        System.out.println("\nLingkaran:");
        System.out.println("Luas = " + lingkaran.luas());
        System.out.println("Keliling = " + lingkaran.keliling());

        System.out.println("\nSegitiga:");
        System.out.println("Luas = " + segitiga.luas());
        System.out.println("Keliling = " + segitiga.keliling());
    }
}
