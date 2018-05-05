package p01_ReverseArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArrayRecursion {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        reverseArrayRecursion(numbers, numbers.length - 1);

    }

    private static void reverseArrayRecursion(int[] numbers, int position) {
        if (position >= 0){
            System.out.print(numbers[position] + " ");
            reverseArrayRecursion(numbers,position -1);
        }
    }
}
