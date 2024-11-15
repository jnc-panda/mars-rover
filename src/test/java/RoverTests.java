import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Position;
import Rover.Rover;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class RoverTests {

    @Test
    @Description("Rotate the rover's position")
    public void testRotation() {
        Position position = new Position(1,2, CompassPoint.S);
        Rover rover = new Rover("Geoff", position);

        CompassPoint newPos = rover.rotate(Instruction.L);

        CompassPoint expected = CompassPoint.E;

        assertEquals(expected, newPos);

    }
    @Test
    @Description("Move the rover one unit")
    public void testMove() {
        Position position = new Position(1,2, CompassPoint.S);
        Rover rover = new Rover("Geoff", position);

        Position newPos = rover.move();

        Position expected = new Position(1,1, CompassPoint.S);

        System.out.println(newPos);
        System.out.println(expected);

        assertEquals(expected.toString(), newPos.toString());

    }

}
