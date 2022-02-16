package room;

import java.util.ArrayList;

public class Room {


    public Exit random(){
        double random = Math.random();
        if(random < 0.25 ){return Exit.EAST;
        }else if(random < 0.5){return Exit.WEST;
        }else if (random < 0.75){return Exit.NORTH;
        }else return Exit.SOUTH;
    }
    private ArrayList<Exit> exits;

    public Room(ArrayList<Exit> exits) {
        this.exits = exits;
    }


}
