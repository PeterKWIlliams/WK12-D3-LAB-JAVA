package Weapons;

import behaviours.IWeapon;
import enemy.Enemy;

public class Axe extends Weapon implements IWeapon {


    public Axe(int damage) {
        super(damage);
    }


    @Override
    public void attack(Enemy enemy) {
    }
}
