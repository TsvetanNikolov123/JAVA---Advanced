/*
    Write a program that returns the first N odd/even elements from a collection.
    Return as many as you can.
    Format of the input: Get {number of elements} {odd/even}
*/

package p08_GetFirstOddOrEvenElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] input = scanner.nextLine().split("\\s+");
        int numberOfElements = Integer.parseInt(input[1]);
        String oddEvenCase = input[2];

        List<Integer> result = new ArrayList<>();
        if (oddEvenCase.equals("even")) {
            result = evenElements(elements, numberOfElements);
        } else if (oddEvenCase.equals("odd")) {
            result = oddElements(elements, numberOfElements);
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static List<Integer> evenElements(int[] elements, int count) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            if (count == result.size()) {
                return result;
            }
            if (elements[i] % 2 == 0) {
                result.add(elements[i]);
            }
        }
        return result;
    }

    private static List<Integer> oddElements(int[] elements, int count) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            if (count == result.size()) {
                return result;
            }
            if (elements[i] % 2 != 0) {
                result.add(elements[i]);
            }
        }
        return result;
    }
}
