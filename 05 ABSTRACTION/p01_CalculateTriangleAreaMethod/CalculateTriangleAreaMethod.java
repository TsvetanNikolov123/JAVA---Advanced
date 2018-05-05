package p01_CalculateTriangleAreaMethod;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] widthHeight = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double width = widthHeight[0];
        double height = widthHeight[1];

        double area = calculateTriangleArea(width, height);
        System.out.println(String.format("Area = %.2f", area));
    }

    private static double calculateTriangleArea(double width, double height) {
        double area = width * height / 2;
        return area;
    }
}
