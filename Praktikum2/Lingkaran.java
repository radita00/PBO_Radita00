package Praktikum2;

public class Lingkaran {
    double phi;
    double r;

    public Lingkaran(double r){
        phi = 3.14;
        this.r = r;
    }

    public double hitungLuas(){
        return phi * r * r;
    }

    public double hitungKeliling(){
        return phi * r * 2;
    }

    public void tampilkanHasil(){
        System.out.println("luas = " + hitungLuas());
        System.out.println("Keliling = " + hitungKeliling());
    }
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.tampilkanHasil();
    }
}
