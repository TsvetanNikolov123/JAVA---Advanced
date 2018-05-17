package p03_DiagonalDifference;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfMatrix = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int row = 0; row < sizeOfMatrix; row++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            for (int col = 0; col < sizeOfMatrix; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        int difference = sumDiagonalMatrix(matrix);
        System.out.println(difference);

    }

    private static int sumDiagonalMatrix(int[][] matrix) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][matrix.length - 1 - i];
        }

        int difference = Math.abs(primaryDiagonal - secondaryDiagonal);
        return difference;
    }
}
