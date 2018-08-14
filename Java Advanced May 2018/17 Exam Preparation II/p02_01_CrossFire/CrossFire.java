package p02_01_CrossFire;

import java.io.BufferedReader;
import java.io.IOException;             // 60/100
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CrossFire {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] matrixSize = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[][] matrix = fulfillMatrix(matrixSize);

        while (true) {
            String commandLine = reader.readLine();
            if ("Nuke it from orbit".equalsIgnoreCase(commandLine)) break;

            int[] commands = Arrays.stream(commandLine.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            matrix = crossFireMatrix(commands, matrix);
            matrix = matrixBlancRowRemove(matrix);
        }

        printResultMatrix(matrix);
    }

    private static int[][] matrixBlancRowRemove(int[][] matrix) {

        List<List<Integer>> tmp = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            //todo remove the row
        }
        return matrix;
    }

    private static void printResultMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != 0) {
                    System.out.print(matrix[row][col] + " ");
                }
            }

            System.out.println();
        }
    }

    private static int[][] crossFireMatrix(int[] commands, int[][] matrixx) {
        int[][] matrix = matrixx;
        int rowBlast = commands[0];
        int colBlast = commands[1];
        int radius = commands[2];

        int rowBlastMax = rowBlast + radius;
        int rowBlastMin = rowBlast - radius;

        int colBlastMax = colBlast + radius;
        int colBlastMin = colBlast - radius;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                try {
                    if (row <= rowBlastMax && row >= rowBlastMin && col == colBlast ||
                            col <= colBlastMax && col >= colBlastMin && row == rowBlast) {
                        matrix[row][col] = 0;

                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = newMatrixRow(matrix[row]);
        }

        return matrix;
    }

    private static int[] newMatrixRow(int[] matrix) {
        int length = matrix.length;
        List<Integer> temp = new LinkedList<>();
        int count = 0;

        for (int i : matrix) {
            if (i != 0) {
                temp.add(i);
            } else {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            temp.add(0);
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = temp.get(i);
        }

        return matrix;
    }

    private static int[][] fulfillMatrix(int[] matrixSize) {
        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        int startNum = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = startNum;
                startNum++;
            }
        }

        return matrix;
    }
}
