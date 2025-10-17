package Praktikum4.relationclass.percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){

    }

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String newMerk){
        this.merk = newMerk;;
    } 

    public void setProc(Processor newProc){
        this.proc = newProc;
    }

    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
