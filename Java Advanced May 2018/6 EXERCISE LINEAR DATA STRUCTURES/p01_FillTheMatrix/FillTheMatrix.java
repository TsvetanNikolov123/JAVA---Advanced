package p01_FillTheMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillTheMatrix {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = reader.readLine().split(", ");
        int size = Integer.parseInt(commands[0]);
        String pattern = commands[1];

        if (pattern.equals("A")) {
            int[][] matrix = patternA(size);
            printMatrix(matrix);
        } else if (pattern.equals("B")) {
            int[][] matrix = patternB(size);
            printMatrix(matrix);
        }
    }


    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] patternA(int size) {
        int[][] matrix = new int[size][size];

        int count = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                count++;
                matrix[col][row] = count;
            }
        }

        return matrix;
    }

    private static int[][] patternB(int size) {
        int[][] matrix = new int[size][size];

        int count = 0;
        int columnCount = 0;
        for (int row = 0; row < size; row++) {
            if (columnCount % 2 == 0) {
                for (int col = 0; col < size; col++) {
                    count++;
                    matrix[col][row] = count;
                }
            } else {
                for (int col = size - 1; col >= 0; col--) {
                    count++;
                    matrix[col][row] = count;
                }
            }
            columnCount++;
        }

        return matrix;
    }
}
