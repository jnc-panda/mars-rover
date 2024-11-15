package Main;

import Boundaries.Instruction;
import Boundaries.Plateau;
import Boundaries.Position;
import Input.ProcessInput;
import Input.PlateauReceiveInput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlateauReceiveInput plateauReceiveInput = new PlateauReceiveInput();
        ProcessInput processInput = new ProcessInput();

        Plateau domain = processInput.inputToPlateau(plateauReceiveInput.receiveDimensions());
        Position spawnPoint = processInput.inputToPosition(plateauReceiveInput.roverReceiver());
        ArrayList<Instruction> instructions = processInput.inputToInstructions(plateauReceiveInput.roverReceiver());

        System.out.println(domain);
        System.out.println(spawnPoint);
        System.out.println(instructions);

    }
}
