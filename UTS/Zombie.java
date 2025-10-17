package UTS;

public abstract class Zombie extends Destroyable {
    protected int health;
    protected int level;

    public abstract void heal();

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level + "\n";
    }
}
