package p02_HotPotato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class HotPotato {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] childrenNames = reader.readLine().split("\\s+");
        int n = Integer.valueOf(reader.readLine());

        Deque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, childrenNames);

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }

            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}
