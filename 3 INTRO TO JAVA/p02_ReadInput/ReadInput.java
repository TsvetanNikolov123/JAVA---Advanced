/*Write a program that reads:
    • Two strings from the first line
    • Three Integers which may be on multiple lines
    • A string from the next line
Print the output in the following format {firstWord} {secondWord} {thirdWord} {sumOfNumbers}.
The sum of numbers should be an integer. */

package p02_ReadInput;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next("\\w+");
        String secondWord = scanner.next("\\w+");
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();

        scanner.nextLine();
        String thirdWord = scanner.nextLine();

        int sum = firstInt + secondInt + thirdInt;

        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + sum);
    }
}
