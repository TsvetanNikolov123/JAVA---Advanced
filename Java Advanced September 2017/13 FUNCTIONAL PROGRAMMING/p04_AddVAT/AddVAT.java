package p04_AddVAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(", ");
        List<Double> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Double.parseDouble(s));
        }

        Function<Double, Double> addVat = x -> x * 1.2;

        System.out.println("Prices with VAT:");
        for (Double num : numbers) {
            System.out.println(String.format("%.2f",
                    addVat.apply(num)).replace(".", ","));
        }
    }
}
