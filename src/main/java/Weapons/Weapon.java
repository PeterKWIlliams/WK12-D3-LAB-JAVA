package Weapons;

import behaviours.IWeapon;

abstract public class Weapon implements IWeapon {
    protected int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }
}
