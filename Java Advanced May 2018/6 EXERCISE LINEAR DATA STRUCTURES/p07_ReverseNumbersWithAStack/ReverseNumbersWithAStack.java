package p07_ReverseNumbersWithAStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");

        Deque<String> stack = new ArrayDeque<>();
        for (String string : input) {
            stack.push(string);
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }
}
