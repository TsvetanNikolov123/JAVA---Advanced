package p08_MatrixShuffling;

import java.util.Arrays;
import java.util.Scanner;


public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = tokens[col];
            }
        }

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }

            String[] commands = input.split(" ");
            if (commands.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }

            if (!commands[0].equals("swap")) {
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


}
