package Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RoverReceiveSpawn implements RoverInfo{
    @Override
    public ArrayList<String> provideInfo() {
        Scanner receiver = new Scanner(System.in);
        System.out.println("Please provide Spawn Point Coordinates and Initial Direction");

        ArrayList<String> roverSpawnInfo = new ArrayList<>();
        roverSpawnInfo.add(receiver.next());
        roverSpawnInfo.add(receiver.next());
        roverSpawnInfo.add(receiver.next());

        return roverSpawnInfo;
    }
}
