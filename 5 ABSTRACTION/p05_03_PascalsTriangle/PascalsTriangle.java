package p05_03_PascalsTriangle;

import java.math.BigInteger;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());

        BigInteger[][] pascalTriangle = new BigInteger[height][height];

        for (int currentHeight = 0; currentHeight < height; currentHeight++) {
            pascalTriangle[currentHeight][0] = BigInteger.ONE;
            pascalTriangle[currentHeight][currentHeight] = BigInteger.ONE;

            if (currentHeight > 1) {
                for (int i = 1; i < currentHeight; i++) {
                    BigInteger[] previousRow = pascalTriangle[currentHeight - 1];
                    BigInteger previousRowSum = previousRow[i].add(previousRow[i - 1]);
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
