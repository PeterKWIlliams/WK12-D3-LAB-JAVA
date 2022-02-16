package enemy;

abstract public class Enemy {
    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }
}
