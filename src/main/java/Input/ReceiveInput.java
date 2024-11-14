package Input;

import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Position;

import java.util.ArrayList;

public class ReceiveInput {


    public Position inputToPosition(String input) {

    }

    public ArrayList<Instruction> inputToInstructions(String input) {

        ArrayList<Instruction> instructions = new ArrayList<>();
        char[] commands = input.toCharArray();
        for(char command : commands) {
            switch(command) {
                case 'L':
                    instructions.add(Instruction.L);
                    break;
                case 'R':
                    instructions.add(Instruction.R);
                    break;
                case 'M':
                    instructions.add(Instruction.M);
                    break;
                default:
                    System.out.printf("Command %c omitted.\n", command);
            }
        }
        return instructions;
        }



    }

