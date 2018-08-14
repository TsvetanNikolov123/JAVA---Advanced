package p12_VehiclePark;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> carList = Arrays.asList(scanner.nextLine().split("\\s+"));

        String customers = scanner.nextLine();
        while (!customers.equals("End of customers!")) {
            String[] tokens = customers.split("\\s+");
            char carType = tokens[0].toLowerCase().charAt(0);
            Integer seats = Integer.parseInt(tokens[2]);

            String searched = "" + carType + seats;
            if (carList.contains(searched)) {
                int price = seats * carType;
                System.out.printf("Yes, sold for %d$", price);
                int index = carList.indexOf(searched);
                Arrays.asList(carList.remove(searched));
            } else {
                System.out.println("No");
            }
            customers = scanner.nextLine();
        }


    }
}
