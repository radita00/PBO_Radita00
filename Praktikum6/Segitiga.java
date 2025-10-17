package Praktikum6;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    float keliling() {
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return (float) (alas + tinggi + sisiMiring);
    }
}
