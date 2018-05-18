package p02_TriangleArea;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int aX = scanner.nextInt();
        int aY = scanner.nextInt();
        int bX = scanner.nextInt();
        int bY = scanner.nextInt();
        int cX = scanner.nextInt();
        int cY = scanner.nextInt();

        int sideA = aX * (bY - cY);
        int sideB = bX * (cY - aY);
        int sideC = cX * (aY - bY);

        double area = Math.abs((sideA + sideB + sideC) / 2);
        System.out.println(String.format("%.0f", area));
    }
}
