package p07_FindTheMissingNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays
                .stream(reader.readLine().split(", "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        for (int i = 1; i <= n; i++) {

            if (i > arr.length) {
                System.out.println(i);
                break;
            }

            if (i != arr[i - 1]) {
                System.out.println(i);
                break;
            }
        }
    }
}
