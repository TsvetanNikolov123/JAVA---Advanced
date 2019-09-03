package p10_ModifyABit;

import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int bitPos = scanner.nextInt();
        int bitValue = scanner.nextInt();

        if (bitValue == 0) {

            int mask = ~(1 << bitPos);
            int result = num & mask;
            System.out.println(result);

        } else {

            int mask = 1 << bitPos;
            int result = num | mask;
            System.out.println(result);

        }

    }
}
