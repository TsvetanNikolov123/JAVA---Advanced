package p02_UpperStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperStrings {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputLine = Arrays.stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());

        inputLine.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s + " "));

    }
}
