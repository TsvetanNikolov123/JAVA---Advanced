package p03_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int searchedNum = Integer.parseInt(reader.readLine());
        System.out.println(recursiveBinarySearch(nums, searchedNum, 0, nums.length - 1));
    }

    private static int recursiveBinarySearch(int sortedArray[], int key, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        if (key > sortedArray[mid]) {
            return recursiveBinarySearch(sortedArray, key, mid + 1, hi);
        } else if (key < sortedArray[mid]) {
            return recursiveBinarySearch(sortedArray, key, lo, hi - 1);
        } else {
            return mid;
        }
    }
}
