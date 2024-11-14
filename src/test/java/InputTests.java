import Boundaries.CompassPoint;
import Boundaries.Instruction;
import Boundaries.Position;
import Input.ReceiveInput;
import jdk.jfr.Description;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.*;

public class InputTests {

    @Test
    @Description("Tests String of one instruction is converted to an array of valid Instructions (L,R,M)")
    public void testValidInstructionsSingle(){
        ReceiveInput receiver = new ReceiveInput();
        String input1 = "L";
        String input2 = "M";

        receiver.inputToInstructions(input1);
        receiver.inputToInstructions(input2);

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
        ReceiveInput receiver = new ReceiveInput();
        String input1 = "LRMRMML";
        String input2 = "MRRRLLRM";

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

    @Test
    @Description("Tests String of one instruction is converted to an array of valid Instructions (L,R,M)")
    public void testValidInstructionsInvalid(){
        ReceiveInput receiver = new ReceiveInput();
        String input1 = "LTR";
        String input2 = "MOL";

        ArrayList<Instruction> expected1 = new ArrayList<>();
        expected1.add(Instruction.L);
        expected1.add(Instruction.R);

        ArrayList<Instruction> expected2 = new ArrayList<>();
        expected2.add(Instruction.M);
        expected2.add(Instruction.L);

        ArrayList<Instruction> result1 = receiver.inputToInstructions(input1);
        ArrayList<Instruction> result2 = receiver.inputToInstructions(input2);

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);

    }

    @Test
    @Description("Tests a string input can be returned as Position")
    public void testSpawnPointInput(){
        ReceiveInput receiver = new ReceiveInput();
        String input1 = "00N";
        String input2 = "12S";

        Position expected1 = new Position(0, 0 , CompassPoint.N);
        Position expected2 = new Position(1 ,2, CompassPoint.S);

        Position result1 = receiver.inputToPosition(input1);
        Position result2 = receiver.inputToPosition(input2);

        System.out.println(expected1);
        System.out.println(result1);

        System.out.println(expected2);
        System.out.println(result2);

        assertEquals(expected1.toString(), result1.toString());
        assertEquals(expected2.toString(), result2.toString());

    }
//
//    @Test
//    @Description("Tests an incorrectly formatted string input can't be returned as Position")
//    public void testBadSpawnPointInput(){
//        ReceiveInput receiver = new ReceiveInput();
//        String input1 = "00T";
//        String input2 = "1S";
//
//        Position result1 = receiver.inputToPosition(input1);
//        Position result2 = receiver.inputToPosition(input2);
//
//        assertNull(result1);
//        assertNull(result2);
//
}
