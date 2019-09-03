package p02_Snake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;       //100/100
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Snake {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int matrixSize = Integer.parseInt(reader.readLine());
        List<String> commands = Arrays.stream(reader.readLine().split(", ")).collect(Collectors.toList());

        String[][] matrix = new String[matrixSize][matrixSize];

        matrix = fillMatrix(matrix, reader);

        int[] startPosition = findStartPosition(matrix);
        int snakeLength = 1;

        for (String command : commands) {
            switch (command) {
                case "up":
                    startPosition = moveUp(matrix, startPosition);
                    break;
                case "down":
                    startPosition = moveDown(matrix, startPosition);
                    break;
                case "left":
                    startPosition = moveLeft(matrix, startPosition);
                    break;
                case "right":
                    startPosition = moveRight(matrix, startPosition);
                    break;
            }

            if (matrix[startPosition[0]][startPosition[1]].equals("f")) {
                snakeLength++;
                matrix[startPosition[0]][startPosition[1]] = "*";
            }

            if (matrix[startPosition[0]][startPosition[1]].equals("e")) {
                System.out.println("You lose! Killed by an enemy!");
                return;
            }

            if (isEatAllFood(matrix)) {
                System.out.printf("You win! Final snake length is %d", snakeLength);
                return;
            }
        }

        int foodInMatrix = countLeftFood(matrix);

        if (!isEatAllFood(matrix)) {
            System.out.printf("You lose! There is still %d food to be eaten.", foodInMatrix);
        } else {
            System.out.printf("You win! Final snake length is %d", snakeLength);
        }

    }

    private static int countLeftFood(String[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("f")) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isEatAllFood(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("f")) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[] moveRight(String[][] matrix, int[] startPosition) {
        int row = startPosition[0];
        int col = startPosition[1] + 1;

        int[] newPosition = new int[2];
        newPosition[0] = row;
        newPosition[1] = col;
        newPosition = returnCorrectPosition(matrix, row, col);

        return newPosition;
    }

    private static int[] moveLeft(String[][] matrix, int[] startPosition) {
        int row = startPosition[0];
        int col = startPosition[1] - 1;

        int[] newPosition = new int[2];
        newPosition[0] = row;
        newPosition[1] = col;
        newPosition = returnCorrectPosition(matrix, row, col);

        return newPosition;
    }

    private static int[] moveDown(String[][] matrix, int[] startPosition) {
        int row = startPosition[0] + 1;
        int col = startPosition[1];

        int[] newPosition = new int[2];
        newPosition[0] = row;
        newPosition[1] = col;
        newPosition = returnCorrectPosition(matrix, row, col);

        return newPosition;
    }

    private static int[] moveUp(String[][] matrix, int[] startPosition) {
        int row = startPosition[0] - 1;
        int col = startPosition[1];

        int[] newPosition = new int[2];
        newPosition[0] = row;
        newPosition[1] = col;
        newPosition = returnCorrectPosition(matrix, row, col);

        return newPosition;
    }

    private static int[] returnCorrectPosition(String[][] matrix, int row, int col) {
        int[] correct = new int[2];

        if (row == -1) {
            row = matrix.length - 1;
        } else if (row > matrix.length - 1) {
            row = 0;
        }

        if (col == -1) {
            col = matrix.length - 1;
        } else if (col > matrix.length - 1) {
            col = 0;
        }

        correct[0] = row;
        correct[1] = col;

        return correct;
    }

    private static int[] findStartPosition(String[][] matrix) {
        int[] startPosition = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("s")) {
                    startPosition[0] = row;
                    startPosition[1] = col;
                }
            }
        }

        return startPosition;
    }

    private static String[][] fillMatrix(String[][] matrix, BufferedReader reader) throws IOException {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = reader.readLine().split(" ");
        }

        return matrix;
    }
}
