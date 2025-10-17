package Praktikum2;

public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public Barang(String kode, String namaBarang, int hargaDasar, float diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual(){
        return (int) (hargaDasar -(diskon * hargaDasar));
    }

    public void tampilData(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga Jual: " + hitungHargaJual());
    }
    
    public static void main(String[] args) {
        Barang b1 = new Barang("001", "Buku", 244000, 0.25f);

        b1.hitungHargaJual();
        b1.tampilData();
    }
}
