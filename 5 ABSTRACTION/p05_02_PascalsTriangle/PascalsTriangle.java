package p05_02_PascalsTriangle;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());

        long[][] pascalTriangle = new long[height][height];

        for (int currentHeight = 0; currentHeight < height; currentHeight++) {
            pascalTriangle[currentHeight][0] = 1;
            pascalTriangle[currentHeight][currentHeight] = 1;

            if (currentHeight > 1) {
                for (int i = 1; i < currentHeight; i++) {
                    long[] previousRow = pascalTriangle[currentHeight - 1];
                    long previousRowSum = previousRow[i] + previousRow[i - 1];
                    pascalTriangle[currentHeight][i] = previousRowSum;
                }
            }
        }

        for (int row = 0; row < pascalTriangle.length; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(pascalTriangle[row][col] + " ");
            }
            System.out.println();
        }
    }
}
