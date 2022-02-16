package enemy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class OgreTest {
    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre(100,"Nick");
    }

    @Test
    public void hasName(){
        assertEquals("Nick",ogre.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100,ogre.getHealth());
    }


}