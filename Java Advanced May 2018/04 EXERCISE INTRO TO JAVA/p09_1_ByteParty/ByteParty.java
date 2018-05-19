package p09_1_ByteParty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteParty {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfInts = Integer.parseInt(reader.readLine());

        int[] numbers = new int[countOfInts];
        for (int i = 0; i < countOfInts; i++) {
            int currentNum = Integer.parseInt(reader.readLine());
            numbers[i] = currentNum;
        }

        while (true) {
            String input = reader.readLine();
            if ("party over".equals(input)) {
                break;
            }

            String[] commands = input.split("\\s+");
            int action = Integer.parseInt(commands[0]);
            int position = Integer.parseInt(commands[1]);

            switch (action) {
                case -1:
                    int maskFirst = 1 << position;
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] ^ maskFirst;
                    }
                    break;
                case 0:
                    int maskSecond = ~(1 << position);
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] & maskSecond;
                    }
                    break;
                case 1:
                    int maskThird = 1 << position;
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] | maskThird;
                    }
                    break;
                default:
                    break;
            }

        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
