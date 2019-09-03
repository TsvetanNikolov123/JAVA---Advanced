package p06_DecimalToBinaryConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class DecimalToBinaryConverter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(reader.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        if (number == 0){
            System.out.println(number);
            return;
        }

        while (number > 0) {
            int reminder = number % 2;
            stack.push(reminder);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
