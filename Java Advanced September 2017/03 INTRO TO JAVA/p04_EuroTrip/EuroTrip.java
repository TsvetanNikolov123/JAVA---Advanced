/* You need to calculate the price of a given quantity of "wurst" in Deutsche Marks.
 * Read the quantity as a double value and print the price in marks, given the following:
 * • The price of 1 kg wurst is 1.20 BGN
 * • The exchange rate is 4210500000000 DM : 1 BGN
 * Print the price, rounded to the second digit after the decimal separator
 **/

package p04_EuroTrip;

import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantity = scanner.nextDouble();

        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal priceInLeva = new BigDecimal(1.2 * quantity);
        BigDecimal totalPrice = priceInLeva.multiply(exchangeRate);

        System.out.printf("%.2f marks", totalPrice);

    }
}
