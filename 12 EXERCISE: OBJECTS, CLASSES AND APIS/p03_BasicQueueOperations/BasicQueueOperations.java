package p03_BasicQueueOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class BasicQueueOperations {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = reader.readLine().split("\\s+");
        int elementsToAdd = Integer.parseInt(commands[0]);
        int elementsToRemove = Integer.parseInt(commands[1]);
        int searchedElement = Integer.parseInt(commands[2]);
        int[] elements = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Deque<Integer> integers = new ArrayDeque<>();

        for (int i = 0; i < elementsToAdd; i++) {
            integers.add(elements[i]);
        }

        for (int i = 0; i < elementsToRemove; i++) {
            integers.pop();
        }

        if (integers.isEmpty()) {
            System.out.println(0);
            return;
        }

        if (integers.contains(searchedElement)) {
            System.out.println(true);
        } else {
            int minNumber = Integer.MAX_VALUE;
            for (Integer integer : integers) {
                if (minNumber > integer) {
                    minNumber = integer;
                }
            }
            System.out.println(minNumber);
        }
    }
}
