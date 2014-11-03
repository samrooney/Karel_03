/**
*
* Description of the program goes here  // provide a brief description
*
* @author <SAM ROONEY>  // replace <SAM> with your name
* @version <date/of/completion> // replace <2/11.14> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
            
            Display.openWorld("maps/mountain.map");
            Display.setSize(16, 16);
            Display.setSpeed(5);
            
               Climber BRUV = new Climber();
               Climber FAM = new Climber();
            
            BRUV.turnRight();
               FAM.turnRight();
            BRUV.move();
               FAM.move();
            BRUV.turnLeft();
               FAM.turnLeft();
            BRUV.climbUpRight();
               FAM.climbUpRight();
            BRUV.climbUpRight();
               FAM.climbUpRight();
            BRUV.climbUpRight();
               FAM.climbUpRight();
            BRUV.turnAround();
               FAM.turnAround();
            BRUV.climbDownRight();
               FAM.climbDownRight();
            BRUV.climbDownRight();
               FAM.climbDownRight();
            BRUV.pickBeeper();
               FAM.turnAround();
            BRUV.turnAround();
               FAM.climbUpLeft();
            BRUV.climbUpLeft();
               FAM.climbUpLeft();
            BRUV.climbUpLeft();
               FAM.turnAround();
            BRUV.turnAround();
               FAM.climbDownLeft();
            BRUV.climbDownLeft();
               FAM.climbDownLeft();
            BRUV.climbDownLeft();
               FAM.climbDownLeft();
            BRUV.climbDownLeft();
               FAM.turnRight();
            BRUV.turnRight();
               FAM.move();
            BRUV.move();
               FAM.turnRight();
            BRUV.turnRight();
            
                        
            
                    
     }   
}
