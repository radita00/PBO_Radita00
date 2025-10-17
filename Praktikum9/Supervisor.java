package Praktikum9;

public class Supervisor extends Manager{
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }
    public void naikkanGaji() {
        gaji += 1500000;
    }
}
