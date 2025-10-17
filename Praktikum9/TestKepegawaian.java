package Praktikum9;

public class TestKepegawaian {
    public static void main(String[] args) {
        Manager man = new Manager("Bill Gates", 5000000);
        Supervisor sup = new Supervisor("Susanto", 1000000);

        System.out.println("Manager");
        man.cetakStatus();
        System.out.println("\nSupervisor");
        sup.cetakStatus();
    }
}
