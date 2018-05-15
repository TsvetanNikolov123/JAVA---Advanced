package p03_CustomMinFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        Integer[] nums = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.valueOf(input[i]);
        }

        Function<Integer[], Integer> smallestNum = num -> Stream.of(num).min(Comparator.comparing(i -> i)).get();

        System.out.println(smallestNum.apply(nums));
    }
}
