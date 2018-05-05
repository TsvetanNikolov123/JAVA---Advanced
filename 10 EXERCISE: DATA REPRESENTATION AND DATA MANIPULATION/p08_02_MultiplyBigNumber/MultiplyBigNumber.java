package p08_02_MultiplyBigNumber;

import java.io.BufferedReader;      // 100/100
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        String second = reader.readLine();

        BigInteger result = new BigInteger(first).multiply(new BigInteger(second));
        System.out.println(result);
    }
}
