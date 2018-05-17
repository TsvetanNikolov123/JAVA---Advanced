package p02_01_NestedLoopsToRecursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedLoopsToRecursion {

    static int numberOfLoops;
    static int numberOfIterations;
    static int[] loops;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numberOfLoops = Integer.parseInt(reader.readLine());
        numberOfIterations = numberOfLoops;
        loops = new int[numberOfLoops];
        nestedLoops(0);
    }

    private static void nestedLoops(int currentLoop) {
        if (currentLoop == numberOfLoops){
            printLoops();
            return;
        }

        for (int counter = 1; counter <= numberOfIterations; counter++) {
            loops[currentLoop] = counter;
            nestedLoops(currentLoop + 1);
        }
    }

    private static void printLoops() {
        for (int i = 0; i < numberOfLoops; i++) {
            System.out.print(loops[i] + " ");
        }
        System.out.println();
    }
}
