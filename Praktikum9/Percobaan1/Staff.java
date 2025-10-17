package Praktikum9.Percobaan1;

public class Staff extends Karyawan{
    private int lembur;
    private int gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    public int getLembur() {
        return lembur;
    }
    public void setGajiLembur(int gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    public int getGajiLembur() {
        return gajiLembur;
    }
    public double getGaji(int lembur, int gajiLembur){
        return super.getGaji() + lembur * gajiLembur;
    }
    public double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }
    public void lihatInfo(){
        System.out.println("NIP: " + getNip());
        System.out.println("Nama: " + getNama());
        System.out.println("Golongan: " + getGolongan());
        System.out.println("jumlah lembur: " + getLembur());
        System.out.println("Gaji Lembur: " + getGajiLembur());
        System.out.printf("Gaji: %.0f\n", getGaji());
    }
}
