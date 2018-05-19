package p13_BlurFilter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BlurFilter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int blurAmount = Integer.parseInt(reader.readLine());
        int[] rowsCols = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = rowsCols[0];
        int cols = rowsCols[1];
        long[][] matrix = new long[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] input = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[col];
            }
        }

        int[] target = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String debug = "";
        long[][] blurredMatrix = blurredMatrix(matrix, target, blurAmount, rows, cols);
        printMatrix(blurredMatrix, rows, cols);
    }

    private static void printMatrix(long[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static long[][] blurredMatrix(long[][] matrix, int[] target, int blurAmount, int rows, int cols) {
        int targetRow = target[0];
        int targetCol = target[1];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if ((targetRow - 1 == row && targetCol - 1 == col) ||
                        (targetRow - 1 == row && targetCol == col) ||
                        (targetRow - 1 == row && targetCol + 1 == col) ||
                        (targetRow == row && targetCol - 1 == col) ||
                        (targetRow == row && targetCol == col) ||
                        (targetRow == row && targetCol + 1 == col) ||
                        (targetRow + 1 == row && targetCol - 1 == col) ||
                        (targetRow + 1 == row && targetCol == col) ||
                        (targetRow + 1 == row && targetCol + 1 == col)) {
                    matrix[row][col] += blurAmount;
                }
            }
        }
        return matrix;
    }
}
