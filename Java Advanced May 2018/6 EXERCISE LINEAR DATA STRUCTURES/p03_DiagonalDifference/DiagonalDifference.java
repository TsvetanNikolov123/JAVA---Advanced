package p03_DiagonalDifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = createMatrix(reader);
        int primaryDiagonalSum = findPrimaryDiagonalSum(matrix);
        int secondaryDiagonalSum = findSecondaryDiagonalSum(matrix);
        int difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

        System.out.println(difference);
    }

    private static int findSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    private static int findPrimaryDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    sum += matrix[row][col];
                }
            }
        }

        return sum;
    }

    private static int[][] createMatrix(BufferedReader reader) throws IOException {
        int sizeOfMatrix = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int row = 0; row < sizeOfMatrix; row++) {
            String[] input = reader.readLine().split("\\s+");
            for (int col = 0; col < sizeOfMatrix; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        return matrix;
    }
}
