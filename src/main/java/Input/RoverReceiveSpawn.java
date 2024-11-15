package Input;

import java.util.Scanner;

public class RoverReceiveSpawn implements RoverInfo{
    @Override
    public String provideInfo() {
        Scanner receiver = new Scanner(System.in);
        String roverInfo = receiver.next();

        return roverInfo;
    }
}
