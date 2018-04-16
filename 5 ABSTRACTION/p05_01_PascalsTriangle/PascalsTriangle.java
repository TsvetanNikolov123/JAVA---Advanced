package p05_01_PascalsTriangle;

import java.util.Scanner;

                                    // 60/100
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pascalLength = Integer.parseInt(scanner.nextLine());

        long[][] matrix = new long[pascalLength][pascalLength];

        matrix[0][0] = 1;

        for (int row = 1; row < pascalLength; row++) {
            matrix[row][0] = 1;
            for (int col = 1; col < pascalLength; col++) {
                matrix[row][col] = matrix[row - 1][col - 1] + matrix[row - 1][col];
            }
        }

        String debug = "";

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                String element = "" + matrix[row][col];
                if (element.equals("0")){
                    element = "";
                }
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
