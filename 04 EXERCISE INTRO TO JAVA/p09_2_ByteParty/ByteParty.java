package p09_2_ByteParty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteParty {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfNumbers = Integer.parseInt(reader.readLine());
        int[] numbers = new int[countOfNumbers];

        for (int i = 0; i < countOfNumbers; i++) {
            int input = Integer.parseInt(reader.readLine());
            numbers[i] = input;
        }

        String line;
        while (true) {
            if ("party over".equals(line = reader.readLine())) {
                break;
            }

            String[] tokens = line.split("\\s+");
            int pattern = Integer.parseInt(tokens[0]);
            int position = Integer.parseInt(tokens[1]);

            for (int i = 0; i < numbers.length; i++) {
                switch (pattern) {
                    case 1:
                        changeValueToOne(numbers, position);
                        break;
                    case 0:
                        changeValueToZero(numbers, position);
                        break;
                    case -1:
                        changeValueByPosition(numbers, position, i);
                        break;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    //binary representation of int 1 - 00000000000000000000000000000001
    // First zero test
    //                            44 -                         00101100
    //                           106 -                         01101010
    //                            13 -                         00001100


    private static void changeValueToOne(int[] numbers, int position) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int mask = 1 << position;
            numbers[i] = number | mask;
        }
    }

    private static void changeValueToZero(int[] numbers, int position) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int mask = ~(1 << position);
            numbers[i] = number & mask;
        }
    }

    private static void changeValueByPosition(int[] numbers, int position,int i) {
        int number = numbers[i];
        int numberAfterShift = number >> position;
        int firstBit=  numberAfterShift & 1;

        if (firstBit == 0){
            int mask = 1 << position;
            numbers[i] = number | mask;
        } else {
            int mask = ~ (1 << position);
            numbers[i] = number & mask;
        }
    }
}
