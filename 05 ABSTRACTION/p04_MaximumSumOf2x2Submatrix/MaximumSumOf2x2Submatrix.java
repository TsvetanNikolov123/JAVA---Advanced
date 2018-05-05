package p04_MaximumSumOf2x2Submatrix;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        int sum = Integer.MIN_VALUE;
        int upperLeftNum = 0;
        int upperRightNum = 0;
        int lowerLeftNum = 0;
        int lowerRightNum = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                if (matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1] > sum) {
                    sum = matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1];
                    upperLeftNum = matrix[row][col];
                    upperRightNum = matrix[row][col + 1];
                    lowerLeftNum = matrix[row + 1][col];
                    lowerRightNum = matrix[row + 1][col + 1];
                }
            }
        }

        System.out.println(upperLeftNum + " " + upperRightNum);
        System.out.println(lowerLeftNum + " " + lowerRightNum);
        System.out.println(sum);
    }
}
