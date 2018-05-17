package p02_02_NestedLoopsToRecursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NestedLoopsToRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nestedLoopCounts = Integer.parseInt(reader.readLine());

        printNestedLoops(nestedLoopCounts);
    }

    private static void printNestedLoops(int loopCount) {
        iterateNestedLoops(new Stack<Integer>(), 0, loopCount);
    }

    private static void iterateNestedLoops(Stack<Integer> nestedLoops, int currentIteration, int iterationCount) {
        if (currentIteration == iterationCount) {
            System.out.println(nestedLoops.toString().replaceAll("[,\\[\\]]", ""));
            return;
        }

        for (int currentNumber = 1; currentNumber <= iterationCount; currentNumber++) {
            nestedLoops.push(currentNumber);
            iterateNestedLoops(nestedLoops, currentIteration + 1, iterationCount);
            nestedLoops.pop();
        }
    }
}
