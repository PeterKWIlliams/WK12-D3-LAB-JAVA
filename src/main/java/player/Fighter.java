package player;

import behaviours.IWeapon;

abstract public class Fighter extends Player  {
    private IWeapon weapon;
    public Fighter(String name, int health,IWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
