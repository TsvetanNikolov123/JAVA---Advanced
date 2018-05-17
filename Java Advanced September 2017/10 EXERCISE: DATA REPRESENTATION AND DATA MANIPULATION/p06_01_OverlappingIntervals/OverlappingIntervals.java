package p06_01_OverlappingIntervals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OverlappingIntervals {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int intervalsCount = Integer.parseInt(reader.readLine());

        int[] start = new int[intervalsCount];
        int[] end = new int[intervalsCount];

        for (int i = 0; i < intervalsCount; i++) {
            int[] currentInterval = Arrays.stream(reader.readLine().split(","))
                    .mapToInt(Integer::parseInt).toArray();
            start[i] = currentInterval[0];
            end[i] = currentInterval[1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int currentOverlap = 0;
        int i = 0;
        int j = 0;
        boolean overlappingIntervals = false;

        while (i < intervalsCount && j < intervalsCount) {
            if (start[i] <= end[j]) {
                currentOverlap++;
                i++;
            } else {
                currentOverlap--;
                j++;
            }

            if (currentOverlap > 1) {
                overlappingIntervals = true;
                break;
            }
        }

        System.out.println(overlappingIntervals);
    }
}