package Weapons;

import Roles.Combatants;
import behaviours.IWeapon;
import enemy.Enemy;

public class Club extends Weapon implements IWeapon {


    public Club(int damage) {
        super(damage);
    }

    public void attack(Combatants combatants) {
        int value = combatants.getHealth() - this.damage;
        combatants.setHealth( value);
    }
}
