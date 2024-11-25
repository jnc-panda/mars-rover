import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Plateau;
import Boundaries.Position;
import Input.ProcessInput;
import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InputTests {


    @Test
    @Description("Tests String of one instruction is converted to an array of valid Instructions (L,R,M)")
    public void testValidInstructionsSingle(){
        ProcessInput receiver = new ProcessInput();
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("L");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("M");

        ArrayList<Instruction> expected1 = new ArrayList<>();
        expected1.add(Instruction.L);

        ArrayList<Instruction> expected2 = new ArrayList<>();
        expected2.add(Instruction.M);

        ArrayList<Instruction> result1 = receiver.inputToInstructions(input1);
        ArrayList<Instruction> result2 = receiver.inputToInstructions(input2);

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);

    }

    @Test
    @Description("Tests String of multiple instructions is converted to an array of valid Instructions (L,R,M)")
    public void testValidInstructionsMultiple() {
        ProcessInput receiver = new ProcessInput();

        ArrayList<String> input1 = new ArrayList<>(Arrays.asList("L", "R", "M", "R", "M", "M", "L"));
        ArrayList<String> input2 = new ArrayList<>(Arrays.asList("M", "R", "R", "R", "L", "L", "R", "M"));

        ArrayList<Instruction> expected1 = new ArrayList<>();
        expected1.add(Instruction.L);
        expected1.add(Instruction.R);
        expected1.add(Instruction.M);
        expected1.add(Instruction.R);
        expected1.add(Instruction.M);
        expected1.add(Instruction.M);
        expected1.add(Instruction.L);

        ArrayList<Instruction> expected2 = new ArrayList<>();
        expected2.add(Instruction.M);
        expected2.add(Instruction.R);
        expected2.add(Instruction.R);
        expected2.add(Instruction.R);
        expected2.add(Instruction.L);
        expected2.add(Instruction.L);
        expected2.add(Instruction.R);
        expected2.add(Instruction.M);

        ArrayList<Instruction> result1 = receiver.inputToInstructions(input1);
        ArrayList<Instruction> result2 = receiver.inputToInstructions(input2);

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
    }
//
//    @Test
//    @Description("Tests String of one instruction is converted to an array of valid Instructions (L,R,M)")
//    public void testBadInstructions(){
//        ProcessInput receiver = new ProcessInput();
////        String input1 = "LTR";
////        String input2 = "MOL";
//
//        ArrayList<String> input1 = new ArrayList<>();
//        input1.add()
//
//        ArrayList<Instruction> expected1 = new ArrayList<>();
//        expected1.add(Instruction.L);
//        expected1.add(Instruction.R);
//
//        ArrayList<Instruction> expected2 = new ArrayList<>();
//        expected2.add(Instruction.M);
//        expected2.add(Instruction.L);
//
//        ArrayList<Instruction> result1 = receiver.inputToInstructions(input1);
//        ArrayList<Instruction> result2 = receiver.inputToInstructions(input2);
//
//        assertEquals(expected1, result1);
//        assertEquals(expected2, result2);
//
//    }

    @Test
    @Description("Tests a string input can be returned as Position")
    public void testSpawnPointInput(){
        ProcessInput receiver = new ProcessInput();

        ArrayList<String> input1 = new ArrayList<>();
        input1.add("0");
        input1.add("0");
        input1.add("N");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("1");
        input2.add("2");
        input2.add("S");

        Position expected1 = new Position(0, 0 , CompassPoint.N);
        Position expected2 = new Position(1 ,2, CompassPoint.S);

        Position result1 = receiver.inputToPosition(input1);
        Position result2 = receiver.inputToPosition(input2);

        assertEquals(expected1.toString(), result1.toString());
        assertEquals(expected2.toString(), result2.toString());

    }

    @Test
    @Description("Tests an incorrectly formatted string input can't be returned as Position")
    public void testBadSpawnPointInput() {
        ProcessInput receiver = new ProcessInput();
        ArrayList<String> input1  = new ArrayList<>();
        input1.add("5");
        input1.add("F");
        input1.add("S");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("1");
        input2.add("j");

        Position result1 = receiver.inputToPosition(input1);
        Position result2 = receiver.inputToPosition(input2);

        assertNull(result1);
        assertNull(result2);
    }
    @Test
    @Description("Tests an incorrectly formatted string input can't be returned as Position")
    public void testPlateauCreation() {
        ProcessInput processInput = new ProcessInput();
        int[] input1 = {5,4};
        int[] input2 = {2,3};

        Plateau expected1 = new Plateau(5,4);
        Plateau expected2 = new Plateau(2,3);

        Plateau result1 = processInput.inputToPlateau(input1);
        Plateau result2 = processInput.inputToPlateau(input2);

        assertEquals(expected1.toString(), result1.toString());
        assertEquals(expected2.toString(), result2.toString());

    }

}
