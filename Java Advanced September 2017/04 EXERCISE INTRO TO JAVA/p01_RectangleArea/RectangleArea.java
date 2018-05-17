/*  Write a program that reads the sides of a rectangle (two integers a and b), calculates and prints the rectangle's
    area. Format the result to the second digit after the decimal separator.
*/

package p01_RectangleArea;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();

        double area = sideA * sideB;

        System.out.printf("%.2f", area);
    }
}
