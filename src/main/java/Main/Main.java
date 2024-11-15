package Main;

import Boundaries.Instruction;
import Boundaries.Plateau;
import Boundaries.Position;
import Input.ProcessInput;
import Input.PlateauReceiveInput;
import Input.RoverReceiveInstructions;
import Input.RoverReceiveSpawn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlateauReceiveInput plateauReceiveInput = new PlateauReceiveInput();
        RoverReceiveSpawn roverReceiveSpawn = new RoverReceiveSpawn();
        RoverReceiveInstructions roverReceiveInstructions = new RoverReceiveInstructions();
        ProcessInput processInput = new ProcessInput();

        Plateau domain = processInput.inputToPlateau(plateauReceiveInput.receiveDimensions());
        Position spawnPoint = processInput.inputToPosition(roverReceiveSpawn.provideInfo());
        ArrayList<Instruction> instructions = processInput.inputToInstructions(roverReceiveInstructions.provideInfo());

        System.out.println(domain);
        System.out.println(spawnPoint);
        System.out.println(instructions);

    }
}
