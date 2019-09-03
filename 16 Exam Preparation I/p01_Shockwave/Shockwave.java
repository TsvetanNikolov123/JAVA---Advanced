package p01_Shockwave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Shockwave {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = matrixFulfill(reader);

        while (true) {
            String input = reader.readLine();
            if ("Here We Go".equals(input)) break;
            if (input == null || input.isEmpty()) continue;

            String[] tokens = input.split("\\s+");
            int x1 = Integer.valueOf(tokens[0]);
            int y1 = Integer.valueOf(tokens[1]);
            int x2 = Integer.valueOf(tokens[2]);
            int y2 = Integer.valueOf(tokens[3]);

            for (int row = x1; row <= x2; row++) {
                for (int col = y1; col <= y2; col++) {
                    matrix[row][col] += 1;
                }
            }
        }

        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixFulfill(BufferedReader reader) throws IOException {
        int[] size = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = 0;
            }
        }

        return matrix;
    }
}
