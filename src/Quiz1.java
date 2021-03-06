
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
                
        //make walls
        new Wall(kw, 4,2, Direction.WEST);
        new Wall(kw, 4,2, Direction.NORTH);
        new Wall(kw, 3,3, Direction.WEST);
        new Wall(kw, 3,3, Direction.NORTH);
        new Wall(kw, 2,4, Direction.WEST);
        new Wall(kw, 2,4, Direction.NORTH);
        new Wall(kw, 2,5, Direction.NORTH);
        new Wall(kw, 2,5, Direction.EAST);
        new Wall(kw, 3,6, Direction.NORTH);
        new Wall(kw, 3,6, Direction.EAST);
        new Wall(kw, 4,7, Direction.NORTH);
        new Wall(kw, 4,7, Direction.EAST);
        
        //make robot
        Robot karel = new Robot(kw, 4,0, Direction.EAST);
        
        //make things
        new Thing(kw, 4,1);
        new Thing(kw, 3,2);
        new Thing(kw, 2,3);
        new Thing(kw, 1,4);
        
        //make karel go up the stairs and pick up the things
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        
        //make karel go down the stairs and put the things
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        
    }
}
