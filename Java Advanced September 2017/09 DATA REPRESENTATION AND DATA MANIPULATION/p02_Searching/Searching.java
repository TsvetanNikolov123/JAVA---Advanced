package p02_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Searching {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] elements = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int searchedElement = Integer.parseInt(reader.readLine());

        System.out.println(binarySearch(elements, searchedElement));
    }

    private static int binarySearch(int[] nums, int key) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (key < nums[mid]) {
                hi = mid - 1;
            } else if (key > nums[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
