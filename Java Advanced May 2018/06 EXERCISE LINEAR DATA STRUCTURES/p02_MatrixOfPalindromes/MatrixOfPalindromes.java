package p02_MatrixOfPalindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixOfPalindromes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbs = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(numbs[0]);
        int cols = Integer.parseInt(numbs[1]);

        String[][] matrixFromPalindromes = createPalindromeMatrix(rows, cols);

        printMatrix(matrixFromPalindromes);
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

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
