package p09_ExtractABitFromInteger;

import java.util.Scanner;

public class ExtractABitFromInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int bitPos = scanner.nextInt();

        int mask = num >> bitPos;
        int result = 1 & mask;

        System.out.println(result);
    }
}
