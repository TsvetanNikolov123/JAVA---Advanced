package p07_CollectTheCoins;

import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] jagged = new char[4][];

        for (int row = 0; row < jagged.length; row++) {
            char[] input = scanner.nextLine().toCharArray();
            jagged[row] = new char[input.length];

            for (int col = 0; col < input.length; col++) {
                jagged[row][col] = input[col];
            }
        }

        char[] commands = scanner.nextLine().toCharArray();

        int coins = 0;
        int walls = 0;

        int rowLocation = 0;
        int colLocation = 0;

        for (char command : commands) {

            if (command == 'V') {
                if (rowLocation + 1 < 4 && colLocation < jagged[rowLocation + 1].length) {
                    rowLocation++;
                } else {
                    walls++;
                }
            } else if (command == '>') {
                if (colLocation < jagged[rowLocation].length - 1) {
                    colLocation++;
                } else {
                    walls++;
                }
            } else if (command == '^') {
                if (rowLocation - 1 >= 0 && colLocation < jagged[rowLocation - 1].length) {
                    rowLocation--;
                } else {
                    walls++;
                }
            } else if (command == '<') {
                if (colLocation > 0) {
                    colLocation--;
                } else {
                    walls++;
                }
            }

            if (jagged[rowLocation][colLocation] == '$') {
                coins++;
                jagged[rowLocation][colLocation] = '\0';
            }
        }

        System.out.printf("Coins = %d%n", coins);
        System.out.printf("Walls = %d%n", walls);
    }
}
