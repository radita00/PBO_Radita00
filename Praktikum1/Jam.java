package Praktikum1;

public class Jam {
    private String merek;
    private int diameter;
    private int jam,menit;

    public void setMerek(String newValues){
        merek = newValues;
    }

    public void setDiameter(int newValues){
        diameter = newValues;
    }

    public void setWaktu(int jm, int mnt){
        jam = jm;
        menit = mnt;
    }

    public void cekStatus(){
        System.out.println("Merek jam: " + merek);
        System.out.println("Diameter: " + diameter);
        System.out.println("Waktu sekarang: " + jam + "." + menit);
    }
}
