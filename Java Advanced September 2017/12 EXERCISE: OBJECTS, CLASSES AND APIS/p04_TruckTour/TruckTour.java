package p04_TruckTour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class TruckTour {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Deque<String> petrolDistance = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            petrolDistance.addLast(reader.readLine());
        }

        long index = 0;
        while (true) {
            long petrol = 0;
            String currentCommand = petrolDistance.removeFirst();
            String[] station = currentCommand.split("\\s+");
            long currentPetrol = Long.parseLong(station[0]);
            long kilometers = Long.parseLong(station[1]);

            petrol += currentPetrol - kilometers;
            if (petrol >= 0) {
                boolean hasSucceeded = true;

                for (String stationData : petrolDistance) {
                    String[] stationArgs = stationData.split("\\s+");
                    long currentPetrolOfTheStation = Long.parseLong(stationArgs[0]);
                    long currentKilometers = Long.parseLong(stationArgs[1]);

                    petrol += currentPetrolOfTheStation - currentKilometers;
                    if (petrol < 0) {
                        hasSucceeded = false;
                        break;
                    }
                }

                if (hasSucceeded) {
                    System.out.println(index);
                    return;
                } else {
                    petrolDistance.addLast(currentCommand);
                }
            } else {
                petrolDistance.addLast(currentCommand);
            }
            index++;
        }
    }
}
