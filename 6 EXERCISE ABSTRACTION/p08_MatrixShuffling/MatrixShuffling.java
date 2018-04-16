package p08_MatrixShuffling;

import java.util.Arrays;
import java.util.Scanner;

// 20/100


public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] lines = scanner.nextLine().split("\\s+");
            matrix[row] = lines;
        }

        while (true) {
            String[] tokens = scanner.nextLine().split("\\s+");

            boolean invalidInput = false;

            if (tokens[0].equals("END")) {
                return;
            }

            // isCorrectLength
            if (tokens.length != 5) {
                System.out.println("Invalid input!");
                invalidInput = true;
            }

            // commands to Int and check is it num from 0-9

            int[] commands = new int[4];
            for (int i = 1; i < tokens.length; i++) {
                int num = 0;
                try {
                    num = Integer.parseInt(tokens[i]);
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                    invalidInput = true;
                    break;
                }
                if (num > 9) {
                    System.out.println("Invalid input!");
                    invalidInput = true;
                    break;
                }
                commands[i - 1] = num;
            }

            if (!invalidInput) {
                String firstTemp = matrix[commands[0]][commands[1]];
                String secondTemp = matrix[commands[2]][commands[3]];

                matrix[commands[2]][commands[3]] = firstTemp;
                matrix[commands[0]][commands[1]] = secondTemp;

                printMatrix(matrix, rows, cols);
            }


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
