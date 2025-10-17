package Praktikum1;

public class JamTangan extends Jam{
    private String bahanStrap;
    private String warnaStrap;
    
    public void setStrap(String bahan, String warna){
        bahanStrap = bahan;
        warnaStrap = warna;
    }

    public void cekStatus(){
        super.cekStatus();
        System.out.println("Bahan Strap: " + bahanStrap);
        System.out.println("Warna Strap: " + warnaStrap);
    }
}