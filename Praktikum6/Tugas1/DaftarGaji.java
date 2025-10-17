package Praktikum6.Tugas1;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
        index = 0;
    }

    public void addPegawai(Pegawai p) {
        if (index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        } else {
            System.out.println("Daftar gaji penuh!");
        }
    }

    public void printSemuaGaji() {
    for (Pegawai p : listPegawai) {
        if (p != null) {
            System.out.println("Nama: " + p.getNama() + ", Gaji: " + p.getGaji());
            }
        }
    }  
}
