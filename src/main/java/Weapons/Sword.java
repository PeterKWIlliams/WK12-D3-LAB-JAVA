package Weapons;

import Roles.Combatants;
import behaviours.IWeapon;
import enemy.Enemy;

public class Sword extends Weapon implements IWeapon {


    public Sword(int damage) {
        super(damage);
    }


    @Override
    public void attack(Combatants combatant) {
        int value = combatant.getHealth() - this.damage;
        combatant.setHealth( value);
    }
}
