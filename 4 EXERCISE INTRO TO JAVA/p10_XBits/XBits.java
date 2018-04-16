/*
    You are given 8 positive 32-bit integer numbers. Write a program to count all X-bits.
    X-bits are groups of 9 bits (3 rows x 3 columns) forming the letter "X". Your task is to count all X-bits
    and print their count on the console. Valid X-bits consist of 3 numbers where their corresponding bit
    indexes are exactly {"101", "010", "101"}. All other combinations like: {"111", "010", "101"} or
    {"111", "111", "111"} are invalid. All valid X-bits can be part of multiple X-bits (with overlapping).
    Check the example on the right to understand your task better.

    Input
    The input data should be read from the console.
        * On the first 8 lines, you will be given 8 32-bit positive
    integers.
    The input data will always be valid and in the format described. There is no need to check it explicitly.
    Output
    The output should be printed on the console. It should consist of exactly 1 line:
        * At the first line print the count of the X-bits.
    Constraints
        * The 8 input integers will be in the range [0 … 2 147 483 647].
        * Allowed working time: 0.2 seconds. Allowed memory: 16 MB.
*/

package p10_XBits;

import java.util.Scanner;

public class XBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] binaries = new String[8];

        for (int i = 0; i < 8; i++) {
            String binary = String.format("%32s", Integer.toBinaryString(Integer.parseInt(scanner.nextLine()))).replace(' ', '0');
            binaries[i] = binary;
        }

        int counter = 0;
        for (int i = 0; i < binaries.length - 2; i++) {
            for (int j = 0; j < binaries[i].length() - 2; j++) {
                String a = binaries[i].charAt(j) + "" + binaries[i].charAt(j + 1) + binaries[i].charAt(j + 2);
                String b = binaries[i + 1].charAt(j) + "" + binaries[i + 1].charAt(j + 1) + binaries[i + 1].charAt(j + 2);
                String c = binaries[i + 2].charAt(j) + "" + binaries[i + 2].charAt(j + 1) + binaries[i + 2].charAt(j + 2);

                if (a.equals("101") && b.equals("010") && c.equals("101")) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
