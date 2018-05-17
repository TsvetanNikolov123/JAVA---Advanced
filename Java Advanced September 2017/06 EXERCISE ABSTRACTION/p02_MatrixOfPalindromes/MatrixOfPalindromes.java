package p02_MatrixOfPalindromes;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = createPalindromeMatrix(rows, cols);
        printMatrix(matrix, rows, cols);

    }

    private static String[][] createPalindromeMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = "aaa";
                int charValueFirst = palindrome.charAt(0) + row;
                int charValueSecond = palindrome.charAt(1) + row + col;
                int charValueThird = palindrome.charAt(2) + row;
                String result = "" + (char) charValueFirst + (char) charValueSecond + (char) charValueThird;
                matrix[row][col] = result;
            }
        }

        return matrix;
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
