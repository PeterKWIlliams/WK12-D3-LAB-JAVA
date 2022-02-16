package player;

import Weapons.Axe;
import Weapons.Sword;
import Weapons.Weapon;
import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {
    Barbarian barbarian;
    IWeapon axe;
    IWeapon sword;
    @Before
    public void before(){
        axe = new Axe(50);
        sword = new Sword(75);
        
        barbarian = new Barbarian(100,"Nick",axe);
    }

    @Test
    public void hasName(){
        assertEquals("Nick",barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100,barbarian.getHealth());
    }


}