package p01_ParkingLot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> cars = new HashSet<>();

        while (true) {
            String input = reader.readLine();
            if ("END".equals(input)) break;

            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String carPlate = tokens[1];

            switch (direction) {
                case "IN":
                    cars.add(carPlate);
                    break;
                case "OUT":
                    cars.remove(carPlate);
                    break;
            }
        }

        if (!cars.isEmpty()) {
            for (String car : cars) {
                System.out.println(car);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
