package p04_2x2SquaresInMatrix;

import java.util.Scanner;

public class TwoXTwoSquaresInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = inputTokens[col];
            }
        }

        int count = checkSquaresForEqualElements(matrix,rows,cols);
        System.out.println(count);
    }

    private static int checkSquaresForEqualElements(String[][] matrix, int rows, int cols) {
        int count = 0;

        int checkCounts = 0;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                checkCounts++;
                if (matrix[row][col].equals(matrix[row][col+1]) &&
                        matrix[row][col].equals(matrix[row + 1][col]) &&
                        matrix[row][col].equals(matrix[row+1][col+1])){
                    count++;
                }
            }
        }

        return count;
    }
}
