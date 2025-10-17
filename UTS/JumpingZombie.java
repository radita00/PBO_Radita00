package UTS;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        double percent = 0;
        if (level == 1) percent = 0.30;
        else if (level == 2) percent = 0.40;
        else if (level == 3) percent = 0.50;
        int inc = (int)(health * percent);
        health += inc;
    }

    @Override
    public void destroyed() {
        int dec = (int)(health * 0.10);
        health -= dec;
        if (health <= 0) {
            health = 0;
            System.out.println("Jumping Zombie has been defeated!");
        }
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data  \n" + super.getZombieInfo();
    }
}
