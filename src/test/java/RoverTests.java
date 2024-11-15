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
}
