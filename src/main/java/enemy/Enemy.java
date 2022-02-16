package enemy;

import Roles.Combatants;
import behaviours.IWeapon;

abstract public class Enemy extends Combatants {


    public Enemy(String name, int health) {
        super(name, health);
    }
}


