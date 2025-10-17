package Praktikum6.Tugas1;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    public static final int TARIF_SKS = 120000;

    public Dosen(String nip, String nama, String alamat){
        super(nip,nama,alamat);
    }
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
