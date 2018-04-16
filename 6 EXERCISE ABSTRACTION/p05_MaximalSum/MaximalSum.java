package p05_MaximalSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixDimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(matrixDimensions[0]);
        int cols = Integer.parseInt(matrixDimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] input = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[col];
            }
        }

        maxSumOf3x3Elements(matrix, rows, cols);
    }

    private static void maxSumOf3x3Elements(int[][] matrix, int rows, int cols) {

        int sum = Integer.MIN_VALUE;
        int[][] maxSumMatrix = new int[3][3];

        List<Integer> matrixElements = new ArrayList<>();

        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                if (matrix[row - 1][col - 1] +
                        matrix[row - 1][col] +
                        matrix[row - 1][col + 1] +
                        matrix[row][col - 1] +
                        matrix[row][col] +
                        matrix[row][col + 1] +
                        matrix[row + 1][col - 1] +
                        matrix[row + 1][col] +
                        matrix[row + 1][col + 1] > sum) {


                    sum = matrix[row - 1][col - 1] +
                            matrix[row - 1][col] +
                            matrix[row - 1][col + 1] +
                            matrix[row][col - 1] +
                            matrix[row][col] +
                            matrix[row][col + 1] +
                            matrix[row + 1][col - 1] +
                            matrix[row + 1][col] +
                            matrix[row + 1][col + 1];

                    matrixElements.clear();

                    matrixElements.add(matrix[row - 1][col - 1]);
                    matrixElements.add(matrix[row - 1][col]);
                    matrixElements.add(matrix[row - 1][col + 1]);
                    matrixElements.add(matrix[row][col - 1]);
                    matrixElements.add(matrix[row][col]);
                    matrixElements.add(matrix[row][col + 1]);
                    matrixElements.add(matrix[row + 1][col - 1]);
                    matrixElements.add(matrix[row + 1][col]);
                    matrixElements.add(matrix[row + 1][col + 1]);
                }
            }
        }

        System.out.println("Sum = " + sum);

        int count = 0;
        for (Integer matrixElement : matrixElements) {
            count++;
            System.out.print(matrixElement + " ");
            if (count % 3 == 0) {
                System.out.println();
            }
        }
    }
}
