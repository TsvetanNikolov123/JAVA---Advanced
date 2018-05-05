package p04_CombinationsCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsCount {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());
        System.out.println(binomial(firstNum, secondNum));
    }

    private static long binomial(int n, int k) {
        if (k > n - k)
            k = n - k;

        long b = 1;
        for (int i = 1, m = n; i <= k; i++, m--)
            b = b * m / i;
        return b;
    }
}
