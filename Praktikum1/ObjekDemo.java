package Praktikum1;

public class ObjekDemo {
    public static void main(String[] args) {
        Meja mj1 = new Meja();
        Parfum pfm1 = new Parfum();
        JamTangan jmTg = new JamTangan();
        JamDinding jmDg = new JamDinding();

        mj1.setBahan("Kayu");
        mj1.setUkuran(60, 40, 30);
        mj1.setBerat(2);
        mj1.cetakStatus();
        mj1.letakanBarang("Vas");
        System.out.println();

        pfm1.setMerek("Malaikat Subuh");
        pfm1.setBotol(100);
        pfm1.setIsi(100);
        pfm1.cetakStatus();
        pfm1.spray(80);
        pfm1.isiUlang(50);
        pfm1.cetakStatus();
        System.out.println();

        jmDg.setMerek("Casio");
        jmDg.setDiameter(20);
        jmDg.setWaktu(5, 00);
        jmDg.setFrame("kotak", "Lingkaran");
        jmDg.cekStatus();
        System.out.println();

        jmTg.setMerek("Alba");
        jmTg.setDiameter(6);
        jmTg.setWaktu(9, 00);
        jmTg.setStrap("karet", "Biru");
        jmTg.cekStatus();
    }
}
