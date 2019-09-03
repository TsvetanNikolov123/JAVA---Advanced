package p10_BasicQueueOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class BasicQueueOperations {
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

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < countToPush; i++) {
            queue.add(lineOfNumbers[i]);
        }

        for (int i = 0; i < countToPop; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }

        if (queue.contains(searchedElement)) {
            System.out.println(true);
        } else {
            int smallestNum = Integer.MAX_VALUE;
            for (Integer num : queue) {
                if (smallestNum > num) {
                    smallestNum = num;
                }
            }
            System.out.println(smallestNum);
        }
    }
}