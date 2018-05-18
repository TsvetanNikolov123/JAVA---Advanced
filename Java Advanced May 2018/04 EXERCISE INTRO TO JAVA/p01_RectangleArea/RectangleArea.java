package p01_RectangleArea;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();

        double area = sideA * sideB;

        System.out.println(String.format("%.2f", area));
    }
}
