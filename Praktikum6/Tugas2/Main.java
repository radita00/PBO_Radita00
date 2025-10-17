package Praktikum6.Tugas2;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc("Asus", "Intel Core i5", 3200, 8, 19);
        Mac mac = new Mac("Macbook Air", "Apple M1", 3200, 8, "Non-Removable", "Touch ID");
        Windows windows = new Windows("Lenovo", "Intel Core i7", 3600, 16, "Removable", "Microsoft Store");

        System.out.println("Data PC");
        pc.tampilPc();
        System.out.println("\nData Mac");
        mac.tampilMac();
        System.out.println("\nData Windows");
        windows.tampilWindows();
    }
}
