package p04_AverageOfDoubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageOfDoubles {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();

        if (inputLine.isEmpty()) {
            System.out.println("No match");
            return;
        }

        List<String> elements = Arrays.stream(inputLine.split("\\s+"))
                .collect(Collectors.toList());

        OptionalDouble average = elements.stream()
                .filter(n -> !n.isEmpty())
                .mapToDouble(Double::valueOf)
                .average();

        System.out.println(String.format("%.2f", average.getAsDouble()));
    }
}
