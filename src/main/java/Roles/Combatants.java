package Roles;

import behaviours.IWeapon;

abstract public class Combatants {
    private String name;
    private int health;
    public Combatants(String name, int health) {

        this.health = health;
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }




}