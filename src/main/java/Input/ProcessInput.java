package Input;

import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Plateau;
import Boundaries.Position;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.function.Function;

public class ProcessInput {



    public Plateau inputToPlateau(int[] dimensions){
        return new Plateau(dimensions[0], dimensions[1]);
    }

    public Position inputToPosition(ArrayList<String> input) {

       try {
               int xCord = Integer.parseInt(input.get(0));
               int yCord = Integer.parseInt(input.get(1));
               String direction = input.get(2).toUpperCase();

               Function<String, CompassPoint> compassDirection = CompassPoint::valueOf;

               return new Position(xCord, yCord, compassDirection.apply(direction));
           }
       catch(IndexOutOfBoundsException | IllegalArgumentException e) {
           System.out.println(e.getMessage());
           return null;
       }
    }

    public ArrayList<Instruction> inputToInstructions(ArrayList<String> input) {

        ArrayList<Instruction> instructions = new ArrayList<>();

        for(String command : input) {
            switch(command) {
                case "L":
                    instructions.add(Instruction.L);
                    break;
                case "R":
                    instructions.add(Instruction.R);
                    break;
                case "M":
                    instructions.add(Instruction.M);
                    break;
                default:
                    System.out.printf("Command %s omitted.\n", command);
            }
        }
        return instructions;
        }

    }

