package p06_01_SequenceInMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


//  NOT READY

public class SequenceInMatrix {
    private static List<String> textResult = new ArrayList<>();
    private static List<String> tempResult = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = input[0];
        int cols = input[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] lines = scanner.nextLine().split("\\s+");
            matrix[row] = lines;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                tryLine(matrix, row, col);
                tryColumn(matrix, row, col);
                tryDiagonal(matrix, row, col);

            }
        }

        System.out.println(textResult);
    }

    private static void tryDiagonal(String[][] matrix, int row, int col) {
        tempResult.clear();
        int currentCol = col;
        int currentRow = row;
        tempResult.add(matrix[currentRow][currentCol]);

        while (true) {
            if (currentRow + 1 < matrix.length && currentCol + 1 < matrix[0].length) {
                if (matrix[currentRow][currentCol].equals(matrix[currentRow + 1][currentCol + 1])) {
                    tempResult.add(matrix[currentRow][currentCol]);
                }
            } else {
                if (tempResult.size() > textResult.size()) {
                    textResult.addAll(tempResult);
                }
                break;
            }

            currentCol++;
            currentRow++;
        }
    }

    private static void tryColumn(String[][] matrix, int row, int col) {
        tempResult.clear();
        for (int i = row; i < matrix.length - 1; i++) {
            tempResult.add(matrix[i][col]);
            if (matrix[i][col].equals(matrix[i + 1][col])) {
                tempResult.add(matrix[i][col]);
            } else {
                if (tempResult.size() > textResult.size()) {
                    textResult.addAll(tempResult);
                }
                break;
            }
        }
    }

    private static void tryLine(String[][] matrix, int row, int col) {
        tempResult.clear();
        for (int i = col; i < matrix[row].length - 1; i++) {
            tempResult.add(matrix[row][i]);
            if (matrix[row][i].equals(matrix[row][i + 1])) {
                tempResult.add(matrix[row][i]);
            } else {
                if (tempResult.size() > textResult.size()) {
                    textResult.addAll(tempResult);
                }
                break;
            }
        }
    }
}
