package p05_BalancedParentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] braces = reader.readLine().toCharArray();

        if (braces.length % 2 != 0) {
            System.out.println("NO");
            return;
        }

        Deque<Character> openBraces = new ArrayDeque<>();
        boolean isBalanced = true;

        for (char brace : braces) {
            if (brace == '{' || brace == '[' || brace == '(') {
                openBraces.push(brace);
            } else {
                char currentBrace = openBraces.pop();
                if (brace == '}') {
                    brace = '{';
                }
                if (brace == ']') {
                    brace = '[';
                }
                if (brace == ')') {
                    brace = '(';
                }
                if (brace != currentBrace) {
                    System.out.println("NO");
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        }
    }
}
