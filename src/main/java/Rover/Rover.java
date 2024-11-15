package Rover;

import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Plateau;
import Boundaries.Position;

import java.util.ArrayList;

public class Rover {
    String name;
    public Position position;
    //public Position currentPosition;

    public Rover(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public Position rotate(Instruction turn) {
        CompassPoint facing = position.direction;

        if (turn == Instruction.L) {
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
        position = new Position(position.xCoordinate, position.yCoordinate, facing);
        return position;
    }

    public Position move(){
        CompassPoint facing = position.direction;

        switch(facing) {
            case N -> position.yCoordinate += 1;
            case E -> position.xCoordinate += 1;
            case S -> position.yCoordinate -= 1;
            case W -> position.xCoordinate -= 1;
        }
        position = new Position(position.xCoordinate, position.yCoordinate, position.direction);
        return position;
    }

    public void readInstructions(ArrayList<Instruction> instructions, Position position) {
        for (Instruction instr : instructions) {
            switch (instr) {
                case L, R -> rotate(instr);
                case M -> move();
            }
        }
    }
}

