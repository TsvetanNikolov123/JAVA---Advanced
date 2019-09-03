package p04_MaximumSumOf2x2SubMatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = fillMatrix(reader);

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

    private static int[][] fillMatrix(BufferedReader reader) throws IOException {
        List<String> dimensions = Arrays
                .stream(reader.readLine().split(", "))
                .collect(Collectors.toList());

        int rows = Integer.parseInt(dimensions.get(0));
        int cols = Integer.parseInt(dimensions.get(1));

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] numbers = reader.readLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(numbers[col]);
            }
        }
        return matrix;
    }
}