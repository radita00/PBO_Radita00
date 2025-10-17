package Praktikum1;

public class Parfum {
    private String merek;
    private int isi;
    private int ukuranBotol;

    public void setMerek(String newValue){
        merek = newValue;
    }

    public void setIsi(int newValue){
        isi = newValue;
    }

    public void setBotol(int newValue){
        ukuranBotol = newValue;
    }

    public void spray(int decrement){
        if (isi > decrement) {
            isi -= decrement;
            System.out.println("Parfum telah digunakan sebanyak " + decrement + " ml. sisa sekarang = " + isi + " ml");
        }
    }
    
    public void isiUlang(int increment){
        if (isi + increment <= ukuranBotol) {
            isi += increment;
            System.out.println("Parfum telah diisi ulang sebnayak " + increment + " ml. Sisa sekarang = " + isi + " ml");
        }
    }

    public void cekSisa (){
        System.out.println("Sisa parfum: " + isi + " ml.");
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Isi: " + isi + " ml");
        System.out.println("Ukuran Botol: " + ukuranBotol + " ml");
    }
}
