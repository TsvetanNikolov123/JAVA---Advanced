package p05_Chocolates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Chocolates {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPackets = Integer.parseInt(reader.readLine());
        int[] allPackets = Arrays
                .stream(reader.readLine().split(", "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int numberOfStudents = Integer.parseInt(reader.readLine());

        int min = 0;
        int max = 0;

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < numberOfPackets; i++) {

            if (i + numberOfStudents - 1 < allPackets.length) {
                min = allPackets[i];
                max = allPackets[i + numberOfStudents - 1];

                if (max - min < minDiff) {
                    minDiff = max - min;
                }
            }
        }
        System.out.printf("Min Difference is %s.", minDiff);
    }
}
