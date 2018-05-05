/*
    You are given an array of integers as a single line, separated by a space. Write a program that checks consecutive
    pairs and prints if both are odd/even or not.
    Note that the array length should also be an even number.
*/

package p05_OddAndEvenPairs;

import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (input.length % 2 != 0) {
            System.out.println("invalid length");
            return;
        }

        for (int i = 0; i < input.length; i += 2) {
            if (input[i] % 2 == 0 && input[i + 1] % 2 == 0) {
                System.out.printf("%d, %d -> both are even%n", input[i], input[i + 1]);
            } else if (input[i] % 2 != 0 && input[i + 1] % 2 != 0) {
                System.out.printf("%d, %d -> both are odd%n", input[i], input[i + 1]);
            } else {
                System.out.printf("%d, %d -> different%n", input[i], input[i + 1]);
            }
        }
    }
}
