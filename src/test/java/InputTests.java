import Boundaries.Instruction;
import Boundaries.ReceiveInput;
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
}
