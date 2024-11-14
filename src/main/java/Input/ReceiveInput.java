package Input;

import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Plateau;
import Boundaries.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReceiveInput {



    public Plateau inputToPlateau(int[] dimensions){
        return new Plateau(dimensions[0], dimensions[1]);
    }

    public Position inputToPosition(String input) {

       try {
           if(Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1))) {
               int xCord = Character.getNumericValue(input.charAt(0));
               int yCord = Character.getNumericValue(input.charAt(1));
               char direction = input.charAt(2);

               Function<Character, CompassPoint> compassDirection = c ->
                       CompassPoint.valueOf(c.toString());

               return new Position(xCord, yCord, compassDirection.apply(direction));
           }
           else {
               throw new InputMismatchException();
           }
       }
       catch(IndexOutOfBoundsException | IllegalArgumentException e) {
           System.out.println(e.getMessage());
           return null;
       }
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

