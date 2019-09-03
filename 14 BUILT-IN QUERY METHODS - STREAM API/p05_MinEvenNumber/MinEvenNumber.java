package p05_MinEvenNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class MinEvenNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        OptionalDouble minEvenNum = Arrays.stream(reader.readLine().split("\\s+"))
                .filter(n -> !n.isEmpty())
                .mapToDouble(Double::parseDouble)
                .filter(num -> num % 2 == 0)
                .min();

        if (minEvenNum.isPresent()) {
            System.out.println(String.format("%.2f", minEvenNum.getAsDouble()));
        } else {
            System.out.println("No match");
        }
    }
}
