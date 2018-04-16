/*A student travels n kilometers using only one type of transport based on the distance that he will travel:
• Taxi: Initial tax: 0.70 USD. Daytime cost: 0.79 USD/km. Night time cost: 0.90 USD/km.
• Bus: Day / Night tariff: 0.09 USD/km. For at least 20 kilometers.
• Train: Day / Night tariff: 0.06 USD/km. For at least 100 kilometers.
Write a program that calculates the price of the trip by a given distance and time of day.
Format the output to the second digit after the decimal separator.*/

package p06_TransportPrice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransportPrice {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double distance = Double.parseDouble(reader.readLine());
        String timeOfDay = reader.readLine();

        double taxiRate = 0.90;
        if (timeOfDay.equals("day")) {
            taxiRate = 0.79;
        }

        if (distance < 20) {
            double initialTax = 0.70;
            double transportPrice = initialTax + (distance * taxiRate);
            System.out.printf("%.2f", transportPrice);
        } else if (distance < 100) {
            double pricePerKm = 0.09;
            double transportPrice = pricePerKm * distance;
            System.out.printf("%.2f", transportPrice);
        } else {
            double pricePerKm = 0.06;
            double transportPrice = pricePerKm * distance;
            System.out.printf("%.2f", transportPrice);
        }

    }
}
