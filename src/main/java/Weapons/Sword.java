package Weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Sword extends Weapon implements IWeapon {


    public Sword(int damage) {
        super(damage);
    }

    @Override
    public void attack(Enemy enemy) {

    }
}
