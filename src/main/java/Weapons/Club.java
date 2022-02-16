package Weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Club extends Weapon implements IWeapon {


    public Club(int damage) {
        super(damage);
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
