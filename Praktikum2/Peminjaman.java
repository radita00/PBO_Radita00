package Praktikum2;

public class Peminjaman {
    Member member;
    Game game;
    int lamaSewa;

    public Peminjaman(Member m, Game g, int lama){
        member = m ;
        game = g;
        lamaSewa = lama;
    }

    public int hitungHarga(){
        return lamaSewa * game.hargaSewa;
    }

    public void cetakInformasi(){
        System.out.println("Id Member: " + member.idMember);
        System.out.println("Nama Member: " + member.namaMember);
        System.out.println("Nama Game: " + game.namaGame);
        System.out.println("Harga: " + game.hargaSewa);
        System.out.println("Lama Sewa: " + lamaSewa);
        System.out.println("Total Bayar: " + hitungHarga());
    }
}
