package p02_AverageOfThreeNumbers;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double firstNum = scanner.nextDouble();
        Double secondNum = scanner.nextDouble();
        Double thirdNum = scanner.nextDouble();

        Double average = (firstNum + secondNum + thirdNum) / 3;

        System.out.println(String.format("%.2f", average));
    }
}
