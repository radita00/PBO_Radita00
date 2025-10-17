package Praktikum3.Tugas;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota (String noKtp, String nama, int limitPeminjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPeminjaman;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int values){
        if (values < limitPinjaman && jumlahPinjaman < limitPinjaman) {
            jumlahPinjaman += values;
        } else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
    public void angsur(int values){
        if (values < (jumlahPinjaman * 0.1)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah peminjaman");
        } else{
            jumlahPinjaman -= values;
        }
    }
}
