package Praktikum2;

public class PeminjamanDemo {
    public static void main(String[] args) {
        Member m1 = new Member(001, "bayu");
        Game g1 = new Game("God of War", 20000);
        Peminjaman p1 = new Peminjaman(m1, g1, 3);

        p1.cetakInformasi();
    }
}
