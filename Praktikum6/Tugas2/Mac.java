package Praktikum6.Tugas2;

public class Mac extends Laptop{
    String security;

    public Mac() {
    }

    public Mac(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBaterai, String security) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security\t: " + security);
    }
}
