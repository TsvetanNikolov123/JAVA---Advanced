/*
    You will be given an integer number N and on each of the next N lines - a positive 8-bit integer.
    On the next lines you will be given a series of commands, one of the following:
        * "-1 [position]" – Upon receiving this command you should flip the bits at the specified position in
            all numbers you received. Flipping a bit means turning its value from 1 to 0 or the other way around.
        * "0 [position]" – upon receiving this command you should unset the bits at the specified position for
            all numbers, i.e. turn all bits to 0 regardless of their current value.
        * "1 [position]" – upon receiving this command you should set the bits at the specified position
            for all numbers, i.e. turn all bits to 1 regardless of their current value.
        * "party over" – when you receive this command print back the numbers after all changes have been made;
            each number stays on a separate line.
        Input
            * The input data should be read from the console.
            * The first input line holds the number N – the count of integers you'll receive.
            * On each of the next N lines you'll receive a positive 8-bit integer number. Input ends with the
                string "party over".
            * The input data will always be valid and in the format described. There is no need to check it explicitly.
        Output
            * You should print N lines, each containing a number – the numbers after all manipulations.
        Constraints
            * All input numbers are in the range [0 … 255].
            * [position] will be between [0 … 7].
            * Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
*/

package p09_ByteParty;

import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            numbers[i] = b;
        }

        while (true) {
            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("party")) {
                for (int number : numbers) {
                    System.out.println(number);
                }
                break;
            }

            int action = Integer.parseInt(command[0]);
            int position = Integer.parseInt(command[1]);

            switch (action) {
                case -1:
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = (numbers[i] ^ (1 << position));
                    }
                    break;
                case 0:
                    int mask = ~(1 << position);
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] & mask;
                    }
                    break;
                case 1:
                    int mask1 = 1 << position;
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] | mask1;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
