package Boundaries;

public class Position {

    int xCoordinate;
    int yCoordinate;
    CompassPoint direction;

    public Position(int xCoordinate, int yCoordinate, CompassPoint direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }
}
