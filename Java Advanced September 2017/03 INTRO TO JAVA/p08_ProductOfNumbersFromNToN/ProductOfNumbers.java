/*Write a program that calculates the product of all numbers in the interval [n..m] by given n and m:*/

package p08_ProductOfNumbersFromNToN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class ProductOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int firstNumber = input[0];
        int secondNumber = input[1];

        BigInteger sumOfNumbers = BigInteger.ONE;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sumOfNumbers = sumOfNumbers.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("product[%d..%d] = %d", firstNumber, secondNumber, sumOfNumbers);
    }
}
