package p09_1_MaximumElement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaximumElement {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInputs = Integer.parseInt(reader.readLine());
        Deque<Long> numbers = new ArrayDeque<>();

        while (numberOfInputs-- > 0) {

            long[] inputCommands = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToLong(Long::parseLong)
                    .toArray();

            if (inputCommands[0] == 1) {
                numbers.push(inputCommands[1]);
            } else if (inputCommands[0] == 2) {
                numbers.pop();
            } else if (inputCommands[0] == 3) {
                Long maxNum = Long.MIN_VALUE;
                for (Long number : numbers) {
                    if (maxNum < number) {
                        maxNum = number;
                    }
                }
                System.out.println(maxNum);
            }
        }
    }
}