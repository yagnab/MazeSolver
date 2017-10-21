import uk.ac.warwick.dcs.maze.logic.IRobot;
import java.util.Random;

public class DumboController
{

    public void controlRobot(IRobot robot)
    {
        //array of directions
        int[] absDirections = {IRobot.NORTH, IRobot.EAST, IRobot.SOUTH, IRobot.WEST};
        int[] relDirections = {IRobot.LEFT, IRobot.RIGHT, IRobot.AHEAD, IRobot.BEHIND};

        //pick a random direction
        Random rng = new Random();
        int rndNum = rng.nextInt();

        //if wall ahead, change direction until no wall is ahead
        while(robot.look(relDirections[rndNum]) == IRobot.WALL)
        {
            rndNum = (rndNum + 1) % 3;
        }

        //face direction
        robot.face(rndDirection);
    }
}