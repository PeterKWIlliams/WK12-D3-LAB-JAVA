package enemy;

import behaviours.ITakeDamage;
import player.Player;

public class Basilisk extends Enemy implements ITakeDamage {
    public Basilisk(String name,int health ) {
        super(name, health);
    }



    @Override
    public void takeDamage(Player player) {

    }
}
