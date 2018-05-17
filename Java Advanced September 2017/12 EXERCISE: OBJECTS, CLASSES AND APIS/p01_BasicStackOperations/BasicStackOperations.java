package p01_BasicStackOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class BasicStackOperations {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] commands = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int countToPush = commands[0];
        int countToPop = commands[1];
        int searchedElement = commands[2];

        int[] lineOfNumbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < countToPush; i++) {
            deque.push(lineOfNumbers[i]);
        }

        for (int i = 0; i < countToPop; i++) {
            deque.pop();
        }

        if (deque.isEmpty()) {
            System.out.println(0);
            return;
        }

        if (deque.contains(searchedElement)) {
            System.out.println(true);
        } else {
            int smallestNum = Integer.MAX_VALUE;
            for (Integer num : deque) {
                if (smallestNum > num) {
                    smallestNum = num;
                }
            }
            System.out.println(smallestNum);
        }

    }
}
