package player;

import Weapons.Axe;
import Weapons.Sword;
import behaviours.IWeapon;
import enemy.Enemy;
import enemy.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {
    Barbarian barbarian;
    IWeapon axe;
    IWeapon sword;
    Enemy ogre;
    @Before
    public void before(){
        axe = new Axe(50);
        sword = new Sword(75);
        barbarian = new Barbarian("Nick",100,axe);
        ogre = new Ogre("Peter",1000);
    }

    @Test
    public void hasName(){
        assertEquals("Nick",barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100,barbarian.getHealth());
    }

    @Test
    public void canAttackThroughWeapon(){
        barbarian.getWeapon().attack(ogre);
        assertEquals(950,ogre.getHealth());
    }


}