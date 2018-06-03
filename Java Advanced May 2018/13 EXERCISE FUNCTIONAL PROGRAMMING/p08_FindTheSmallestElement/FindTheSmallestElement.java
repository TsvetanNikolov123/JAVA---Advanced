package p08_FindTheSmallestElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        Integer[] nums = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.valueOf(input[i]);
        }

        Function<Integer[], Integer> smallestInt = integer -> {
            Integer minIndex = -1;
            Integer minNum = Integer.MAX_VALUE;
            for (int i = 0; i < integer.length; i++) {
                if (integer[i] <= minNum) {
                    minNum = integer[i];
                    minIndex = i;
                }
            }
            return minIndex;
        };

        System.out.println(smallestInt.apply(nums));
    }
}