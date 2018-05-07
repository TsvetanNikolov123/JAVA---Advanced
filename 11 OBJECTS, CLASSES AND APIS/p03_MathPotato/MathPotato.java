package p03_MathPotato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class MathPotato {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] childrenNames = reader.readLine().split("\\s+");
        int n = Integer.valueOf(reader.readLine());

        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, childrenNames);

        int counter = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }

            if (isPrime(counter)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }

            counter++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            // i= divider
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
