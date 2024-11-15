package Input;

import java.util.ArrayList;
import java.util.Scanner;

public class RoverReceiveInstructions {
    public ArrayList<String> provideInfo() {
        Scanner receiver = new Scanner(System.in);
        System.out.println("Please provide Instructions for Rover");

        ArrayList<String> roverInstructions = new ArrayList<>();
        String instructionSequence = receiver.next();

        for(int i = 0; i < instructionSequence.length(); i++) {
            roverInstructions.add(Character.toString(instructionSequence.charAt(i)));
        }

        return roverInstructions;
    }
}
