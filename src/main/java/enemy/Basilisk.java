package enemy;

import behaviours.ITakeDamage;
import player.Player;

public class Basilisk extends Enemy implements ITakeDamage {
    public Basilisk(int health, String name) {
        super(health, name);
    }



    @Override
    public void takeDamage(Player player) {

    }
}
