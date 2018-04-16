package p01_FillTheMatrix;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String a = input[1];

        if (a.equals("A")) {
            int[][] matrix = patternA(n);
            printMatrix(matrix);
        } else if (a.equals("B")) {
            int[][] matrix = patternB(n);
            printMatrix(matrix);
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] patternB(int n) {
        int[][] matrix = new int[n][n];

        int count = 0;
        int columnCount = 0;
        for (int row = 0; row < n; row++) {
            if (columnCount % 2 == 0) {
                for (int col = 0; col < n; col++) {
                    count++;
                    matrix[col][row] = count;
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    count++;
                    matrix[col][row] = count;
                }
            }
            columnCount++;
        }

        return matrix;
    }

    private static int[][] patternA(int n) {
        int[][] matrix = new int[n][n];

        int count = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                count++;
                matrix[col][row] = count;
            }
        }
        return matrix;
    }
}
