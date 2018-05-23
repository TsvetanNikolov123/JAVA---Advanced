package p04_MaximalSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaximalSum {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        int[][] matrix = createMatrix(rows, cols, reader);

        find3x3MaxSumMatrix(matrix);

        String debug = "";
    }

    private static void find3x3MaxSumMatrix(int[][] matrix) {
        int[][] resultMatrix = new int[3][3];

        int maxSum = Integer.MIN_VALUE;
        int indexOfRow = 0;
        int indexOfCol = 0;

        List<Integer> matrixElements = new ArrayList<>();

        for (int row = 1; row < matrix.length - 1; row++) {
            for (int col = 1; col < matrix[row].length - 1; col++) {
                if (matrix[row - 1][col - 1] +
                        matrix[row - 1][col] +
                        matrix[row - 1][col + 1] +
                        matrix[row][col - 1] +
                        matrix[row][col] +
                        matrix[row][col + 1] +
                        matrix[row + 1][col - 1] +
                        matrix[row + 1][col] +
                        matrix[row + 1][col + 1] > maxSum) {

                    maxSum = matrix[row - 1][col - 1] +
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
        System.out.println("Sum = " + maxSum);
        printMatrix3x3(matrixElements);
    }

    private static void printMatrix3x3(List<Integer> matrixElements) {
        int count = 0;
        for (Integer matrixElement : matrixElements) {
            count++;
            System.out.print(matrixElement + " ");
            if (count % 3 == 0) {
                System.out.println();
            }
        }
    }

    private static int[][] createMatrix(int rows, int cols, BufferedReader reader) throws IOException {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = reader.readLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        return matrix;
    }
}
