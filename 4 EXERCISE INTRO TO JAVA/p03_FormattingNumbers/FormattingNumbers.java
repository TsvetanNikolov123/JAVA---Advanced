/*
    Write a program that reads 3 numbers:
        * an integer a (0 ≤ a ≤ 500)
        * a floating-point b
        * a floating-point c
    Print them in 4 virtual columns on the console, separated with a pipe '|'. Each column should have a width of 10
    characters.

        * First, the number a should be printed in hexadecimal, left aligned
        * Second, the number a should be printed in binary form, padded with zeroes
        * Third, the number b should be printed with 2 digits after the decimal point, right aligned
        * Lastly, the number c should be printed with 3 digits after the decimal point, left aligned
    You will receive a, b and c on a single line, separated by one or more white spaces.
*/

package p03_FormattingNumbers;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int firstNum = Integer.parseInt(input[0]);
        double secondNum = Double.parseDouble(input[1]);
        double thirdNum = Double.parseDouble(input[2]);

        String hexadecimal = padRight(Integer.toHexString(firstNum));
        String binary = padLeft(Integer.toBinaryString(firstNum));

        String secondNumTwoDigits = String.format("%.2f", secondNum);
        String thirdNumThreeDigits = String.format("%.3f", thirdNum);

        System.out.print("|");
        System.out.print(hexadecimal.toUpperCase());
        System.out.print("|");
        System.out.print(binary.replace(' ', '0'));
        System.out.print("|");
        System.out.print(padLeft(secondNumTwoDigits.replace(',','.')));
        System.out.print("|");
        System.out.print(padRight(thirdNumThreeDigits.replace(',','.')));
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
