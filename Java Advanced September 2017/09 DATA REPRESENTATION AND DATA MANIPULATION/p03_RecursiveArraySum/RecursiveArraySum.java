package p03_RecursiveArraySum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RecursiveArraySum {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println(sum(input, 0));
    }

    private static int sum(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }
        return array[index] + sum(array, index + 1);
    }
}