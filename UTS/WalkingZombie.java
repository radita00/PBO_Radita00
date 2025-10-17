package UTS;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        double percent = 0;
        if (level == 1) percent = 0.20;
        else if (level == 2) percent = 0.30;
        else if (level == 3) percent = 0.40;
        int inc = (int)(health * percent);
        health += inc;
    }

    @Override
    public void destroyed() {
        int dec = (int)(health * 0.20);
        health -= dec;
        if (health <= 0) {
            health = 0;
            System.out.println("Walking Zombie has been defeated!");
        }
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data \n" + super.getZombieInfo();
    }
}
