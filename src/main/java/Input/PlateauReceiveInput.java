package Input;

import java.util.Scanner;

public class PlateauReceiveInput {


    public int[] receiveDimensions() {
            Scanner receiver = new Scanner(System.in);

            System.out.println("Please provide plateau dimensions");
            int dimensionX = receiver.nextInt();
            int dimensionY = receiver.nextInt();

            int[] dimensions = {dimensionX, dimensionY};

            return dimensions;
    }

//    public String roverReceiver() {
//        Scanner receiver = new Scanner(System.in);
//        String roverInfo = receiver.next();
//
//        return roverInfo;
//    }
}
