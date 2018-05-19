package p08_GetFirstOddOrEvenElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numberCollection = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] commands = reader.readLine().split("\\s+");
        int elementsToGet = Integer.valueOf(commands[1]);
        String typeOfElements = commands[2];


        for (int number : numberCollection) {
            if (elementsToGet == 0) {
                break;
            }
            switch (typeOfElements) {
                case "even":
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                        elementsToGet--;
                    }
                    break;
                case "odd":
                    if (number % 2 != 0) {
                        System.out.print(number + " ");
                        elementsToGet--;
                    }
                    break;
            }

        }
    }
}
