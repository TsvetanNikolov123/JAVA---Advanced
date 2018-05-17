package p01_MatchingBrackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class MatchingBrackets {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Deque<Integer> bracketsIndex = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                bracketsIndex.push(i);
            } else if (ch == ')') {
                int startIndex = bracketsIndex.pop();
                String contents = input.substring(startIndex, i + 1);
                System.out.println(contents);

            }
        }
    }
}
