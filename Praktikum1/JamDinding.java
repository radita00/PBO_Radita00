package Praktikum1;

public class JamDinding extends Jam{
    private String bentukFrame,warnaFrame;

    public void setFrame(String bentuk, String warna){
        bentukFrame = bentuk;
        warnaFrame = warna;
    }

    public void cekStatus(){
        super.cekStatus();
        System.out.println("Bentuk frame: " + bentukFrame);
        System.out.println("Warna frame: " + warnaFrame);
    }
}
