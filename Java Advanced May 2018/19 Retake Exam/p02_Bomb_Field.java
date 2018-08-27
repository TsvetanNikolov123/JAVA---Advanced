import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_Bomb_Field {
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int fieldSize = Integer.parseInt(reader.readLine());
    String[] commands = reader.readLine().split(",");

    String[][] matrix = new String[fieldSize][fieldSize];

    fillMatrix(reader, fieldSize, matrix);

    int[] startPosition = findStartPosition(matrix);
    int foundBombsCount = 0;

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

        if (matrix[startPosition[0]][startPosition[1]].equals("B")) {
            foundBombsCount++;
            System.out.println("You found a bomb!");
            matrix[startPosition[0]][startPosition[1]] = "+";
        }

        if (matrix[startPosition[0]][startPosition[1]].equals("e")) {
            int leftBombs = countLeftBombs(matrix);
            System.out.println(String.format("END! %d bombs left on the field",leftBombs));
            return;
        }

        if (isAllBombsFound(matrix)) {
            System.out.print("Congratulations! You found all bombs!");
            return;
        }
    }

    int leftBombs = countLeftBombs(matrix);

    System.out.println(String.format("%d bombs left on the field. Sapper position: (%d,%d)", leftBombs, startPosition[0], startPosition[1]));


    String debug = "";
}

    private static int countLeftBombs(String[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("B")) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isAllBombsFound(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("B")) {
                    return false;
                }
            }
        }

        return true;
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

    private static int[] moveDown(String[][] matrix, int[] startPosition) {
        int row = startPosition[0] + 1;
        int col = startPosition[1];

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

    private static int[] moveRight(String[][] matrix, int[] startPosition) {
        int row = startPosition[0];
        int col = startPosition[1] + 1;

        int[] newPosition = new int[2];
        newPosition[0] = row;
        newPosition[1] = col;
        newPosition = returnCorrectPosition(matrix, row, col);

        return newPosition;
    }

    private static int[] returnCorrectPosition(String[][] matrix, int row, int col) {
        int[] correct = new int[2];

        if (row == -1) {
            row = 0;
        } else if (row > matrix.length - 1) {
            row = matrix.length - 1;
        }

        if (col == -1) {
            col = 0;
        } else if (col > matrix.length - 1) {
            col = matrix.length - 1;
        }

        correct[0] = row;
        correct[1] = col;

        return correct;
    }

    private static void fillMatrix(BufferedReader reader, int fieldSize, String[][] matrix) throws IOException {
        for (int i = 0; i < fieldSize; i++) {
            String[] rowCharacters = reader.readLine().split(" ");
            for (int j = 0; j < fieldSize; j++) {
                matrix[i] = rowCharacters;
            }
        }
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
}
