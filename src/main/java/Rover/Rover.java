package Rover;

import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Position;

public class Rover {
    String name;
    Position position;

    public Rover(String name, Position position) {
        this.name = name;
        this.position = position;
    }


    public CompassPoint rotate(Instruction direction) {
        CompassPoint facing = position.direction;

        if (direction == Instruction.L) {
            switch (facing) {
                case CompassPoint.N -> facing = CompassPoint.W;
                case CompassPoint.E -> facing = CompassPoint.N;
                case CompassPoint.S -> facing = CompassPoint.E;
                case CompassPoint.W -> facing = CompassPoint.S;
            }
        } else {
            switch (facing) {
                case CompassPoint.N -> facing = CompassPoint.E;
                case CompassPoint.E -> facing = CompassPoint.S;
                case CompassPoint.S -> facing = CompassPoint.W;
                case CompassPoint.W -> facing = CompassPoint.N;
            }
        }
        return facing;
    }

    public Position move(){
        CompassPoint facing = position.direction;

        switch(facing) {
            case N -> position.yCoordinate += 1;
            case E -> position.xCoordinate += 1;
            case S -> position.yCoordinate -= 1;
            case W -> position.xCoordinate -= 1;
        }
        return position;
    }
}

