package p04_CalculateExpression;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double firstFormula = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / Math.sqrt(c));

        double secondFormula = Math.pow(((a * a) + (b * b) - (c * c * c)), (a - b));

        double thirdFormula = Math.abs(((a + b + c) / 3) - ((firstFormula + secondFormula) / 2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                firstFormula, secondFormula, thirdFormula);
    }
}
