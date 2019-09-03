package p12_VehiclePark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class VehiclePark {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] cars = reader.readLine().split("\\s+");
        ArrayList carList = new ArrayList<>(Arrays.asList(cars));

        int countOfSoldCars = 0;
        while (true) {
            String customers = reader.readLine();
            if ("End of customers!".equals(customers)) break;

            String[] tokens = customers.split("\\s+");
            char carType = tokens[0].toLowerCase().charAt(0);
            int seats = Integer.parseInt(tokens[2]);

            String searched = "" + carType + seats;
            if (carList.contains(searched)) {
                int price = seats * carType;
                System.out.printf("Yes, sold for %d$%n", price);
                carList.remove(searched);
                countOfSoldCars++;
            } else {
                System.out.println("No");
            }
        }

        System.out.println(String.format("Vehicles left: %s",
                carList.toString().substring(1, carList.toString().length() - 1)));
        System.out.println("Vehicles sold: " + countOfSoldCars);
    }
}
