package p07_ProductOfNumbersNtoM;

import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbersNtoM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        BigInteger sumOfNumbers = BigInteger.ONE;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sumOfNumbers = sumOfNumbers.multiply(BigInteger.valueOf(i));
        }

        System.out.println(String.format("product[%d..%d] = %d", firstNumber, secondNumber, sumOfNumbers));
    }
}
