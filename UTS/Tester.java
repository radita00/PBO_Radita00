package UTS;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());

        System.out.println("----------------------------");

        // Lakukan penghancuran sampai zombie & barrier kalah
        int round = 1;
        while (wz.health > 0 && jz.health > 0 && b.getStrength() > 0) {
            System.out.println("Round " + round + ":");
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());
            System.out.println(b.getBarrierInfo());
            System.out.println("----------------------------");
            round++;
        }


        System.out.println("=== HASIL AKHIR ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
    }
}
