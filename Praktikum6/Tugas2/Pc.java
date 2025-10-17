package Praktikum6.Tugas2;

public class Pc extends Komputer{
    int ukuranMonitor;

    public Pc() {
    }

    public Pc(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, int ukuranMonitor) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor\t: " + ukuranMonitor + " inch");
    }
}
