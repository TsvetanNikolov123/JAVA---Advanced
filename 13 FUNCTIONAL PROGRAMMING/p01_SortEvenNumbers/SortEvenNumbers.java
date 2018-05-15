package p01_SortEvenNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(",");
        List<Integer> nums = new ArrayList<>();

        for (String s : input) {
            nums.add(Integer.parseInt(s.trim()));
        }

        nums.removeIf(n -> n % 2 != 0);
        System.out.println(nums.toString().replace("[", "").replace("]", ""));

        nums.sort((a, b) -> a.compareTo(b));
        System.out.println(nums.toString().replace("[", "").replace("]", ""));
    }
}
