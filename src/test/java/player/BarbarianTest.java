package player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {
    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian(100,"Nick");
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