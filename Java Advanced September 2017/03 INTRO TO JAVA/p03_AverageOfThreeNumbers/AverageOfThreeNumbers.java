/* Write program that reads three numbers. Print the average of the three,
 * formatted to the second digit after the decimal point.
 * */

package p03_AverageOfThreeNumbers;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstDouble = scanner.nextDouble();
        double secondDouble = scanner.nextDouble();
        double thirdDouble = scanner.nextDouble();

        double average = (firstDouble + secondDouble + thirdDouble) / 3D;

        System.out.printf("%.2f", average);
    }
}
