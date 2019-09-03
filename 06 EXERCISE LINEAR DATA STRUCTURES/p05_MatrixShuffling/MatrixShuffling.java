package p05_MatrixShuffling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixShuffling {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = createMatrix(rows, cols, reader);

        while (true) {
            String input = reader.readLine();
            if ("END".equals(input)) {
                break;
            }

            String[] commands = input.split(" ");
            if (commands.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }

            if (!"swap".equals(commands[0])) {
                System.out.println("Invalid input!");
                continue;
            }

            int row1 = 0;
            int col1 = 0;
            int row2 = 0;
            int col2 = 0;

            try {
                row1 = Integer.parseInt(commands[1]);
                row2 = Integer.parseInt(commands[3]);
                col1 = Integer.parseInt(commands[2]);
                col2 = Integer.parseInt(commands[4]);
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }

            try {
                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }

            printMatrix(matrix, rows, cols);
        }
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] createMatrix(int rows, int cols, BufferedReader reader) throws IOException {
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = reader.readLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[col];
            }
        }
        return matrix;
    }
}
