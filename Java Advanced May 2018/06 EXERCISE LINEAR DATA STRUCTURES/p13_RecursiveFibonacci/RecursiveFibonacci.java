package p13_RecursiveFibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFibonacci {

    private static long[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        memo = new long[n + 1];
        System.out.println(recursiveFibonacciWithMemoization(n));
    }

    private static long recursiveFibonacciWithMemoization(int n) {
        if (n <= 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] =
                recursiveFibonacciWithMemoization(n - 1) +
                        recursiveFibonacciWithMemoization(n - 2);
        return memo[n];
    }
}

