package player;

import behaviours.IWeapon;

abstract public class Fighter extends Player  {
    private IWeapon weapon;
    public Fighter(int health, String name,IWeapon weapon) {
        super(health, name);
        this.weapon = weapon;

    }
}
