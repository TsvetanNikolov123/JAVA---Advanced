package p15_InfixToPostfix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class InfixToPostfix {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] expression = reader.readLine().split(" ");
        // queue
        Deque<String> output = new ArrayDeque<>();
        //stack
        Deque<String> operators = new ArrayDeque<>();

        Map<String, Integer> priorities = new HashMap<>();
        priorities.put("*", 3);
        priorities.put("/", 3);
        priorities.put("+", 2);
        priorities.put("-", 2);
        priorities.put("(", 1);

        for (String token : expression) {
            try {
                double num = Double.parseDouble(token);
                output.add(token);
            } catch (Exception e) {
                if (Character.isLetter(token.charAt(0))) {
                    output.add(token);
                } else {
                    if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                        if (operators.isEmpty()) {
                            operators.push(token);
                            continue;
                        } else {
                            while (!operators.isEmpty() && priorities.get(operators.peek()) >= priorities.get(token)) {
                                String operatorOnTopOfStack = operators.pop();
                                output.add(operatorOnTopOfStack);
                            }
                        }
                        operators.push(token);
                    } else if (token.equals("(")) {
                        operators.push(token);
                    } else if (token.equals(")")) {
                        while (!operators.peek().equals("(")) {
                            String operatorOnTopOfStack = operators.pop();
                            output.add(operatorOnTopOfStack);
                        }
                        operators.pop();
                    }
                }
            }
        }

        while (!operators.isEmpty()) {
            String operatorOnTopOfStack = operators.pop();
            output.add(operatorOnTopOfStack);
        }

        while (output.size() > 0) {
            System.out.print(output.pop() + " ");
        }

        System.out.println();
    }
}
