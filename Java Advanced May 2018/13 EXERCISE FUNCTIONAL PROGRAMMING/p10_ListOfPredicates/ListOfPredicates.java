package p10_ListOfPredicates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] nums = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Predicate<Integer>> predicates = new ArrayList<>();

        for (int num : nums) {
            Predicate<Integer> predicate = x -> x % num == 0;
            predicates.add(predicate);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divisible = false;
            for (Predicate<Integer> predicate : predicates) {
                if (predicate.test(i)) {
                    divisible = true;
                } else {
                    divisible = false;
                    break;
                }
            }

            if (divisible) {
                result.add(i);
            }
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
