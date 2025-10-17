package Praktikum6.Tugas2;

public class Komputer {
    protected String merk, jnsProsesor;
    protected int kecProsesor, sizeMemory;
    
    public Komputer(){

    }

    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory){
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    public void tampilData(){
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Jenis Prosesor\t: " + jnsProsesor);
        System.out.println("Kecepatan Prosesor: " + kecProsesor + " MHz");
        System.out.println("Size Memory\t: " + sizeMemory + " GB");
    }
}
