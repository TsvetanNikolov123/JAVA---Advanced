package p05_OddAndEvenPairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OddAndEvenPairs {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (numbers.length % 2 != 0) {
            System.out.println("invalid length");
            return;
        }

        for (int i = 1; i < numbers.length; i += 2) {
            int firstNum = numbers[i - 1];
            int secondNum = numbers[i];

            if (firstNum % 2 == 0 && secondNum % 2 == 0) {
                System.out.println(String.format("%d, %d -> both are even", firstNum, secondNum));
            } else if (firstNum % 2 != 0 && secondNum % 2 != 0) {
                System.out.println(String.format("%d, %d -> both are odd", firstNum, secondNum));
            } else {
                System.out.println(String.format("%d, %d -> different", firstNum, secondNum));
            }
        }
    }
}
