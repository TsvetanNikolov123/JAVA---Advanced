package p03_FormattingNumbers;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        String hexadecimal = padRight(Integer.toHexString(firstNum));
        String binary = padLeft(Integer.toBinaryString(firstNum));

        String secondNumTwoDigits = String.format("%.2f", secondNum);
        String thirdNumThreeDigits = String.format("%.3f", thirdNum);

        System.out.print("|");
        System.out.print(hexadecimal.toUpperCase());
        System.out.print("|");
        System.out.print(binary.replace(' ', '0'));
        System.out.print("|");
        System.out.print(padLeft(secondNumTwoDigits.replace(',', '.')));
        System.out.print("|");
        System.out.print(padRight(thirdNumThreeDigits.replace(',', '.')));
        System.out.print("|");
    }

    private static String padLeft(String s) {
        int n = 10;
        return String.format("%0$" + n + "s", s);
    }

    private static String padRight(String s) {
        int n = 10;
        return String.format("%0$-" + n + "s", s);
    }
}