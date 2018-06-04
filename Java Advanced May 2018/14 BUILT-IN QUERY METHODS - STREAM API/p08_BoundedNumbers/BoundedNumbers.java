package p08_BoundedNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoundedNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] boundaries = reader.readLine().split("\\s+");

        List<Integer> bounds = Stream.of(reader.readLine().split("\\s+"))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> sequenceOfNumbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::valueOf)
                .filter(x -> bounds.get(0) <= x && x <= bounds.get(1))
                .boxed()
                .collect(Collectors.toList());
    }
}
