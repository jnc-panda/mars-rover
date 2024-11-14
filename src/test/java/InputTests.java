import Boundaries.Instruction;
import Boundaries.ReceiveInput;
import jdk.jfr.Description;
import org.junit.Test;



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

        Instruction[] expected1 = {Instruction.L};
        Instruction[] expected2 = {Instruction.M};

        Instruction[] result1 = receiver.inputToInstructions(input1);
        Instruction[] result2 = receiver.inputToInstructions(input2);

        assertEquals(expected1, result1);
        assertEquals(expected2, result2);




    }
}
