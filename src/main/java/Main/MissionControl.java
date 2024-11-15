package Main;

import Boundaries.CompassPoint;
import Boundaries.Plateau;
import Boundaries.Position;

public class MissionControl {

    public Position checkBoundaries(Plateau plateau, Position position) {
        if (position.xCoordinate > plateau.get_xLength() ||
            position.yCoordinate > plateau.get_yLength() ||
            position.xCoordinate < 0 ||
            position.yCoordinate < 0) {
            System.out.println("Due to budget constraints, the rover cannot proceed further. Rover has returned to 0 0 N");
            return new Position(0,0, CompassPoint.N);
        }
        return position;
    }
}
