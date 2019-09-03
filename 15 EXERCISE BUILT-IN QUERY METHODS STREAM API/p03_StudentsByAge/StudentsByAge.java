package p03_StudentsByAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class StudentsByAge {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> students = new LinkedHashMap<>();

        while (true) {
            String input = reader.readLine().trim();
            if ("END".equals(input)) break;

            List<String> tokens = Arrays.stream(input.split("\\s+"))
                    .filter(s -> (s != null && !s.isEmpty()))
                    .collect(Collectors.toList());

            String name = tokens.get(0).concat(" ").concat(tokens.get(1));
            Integer age = Integer.valueOf(tokens.get(2));

            students.put(name, age);
        }

        students.entrySet().stream()
                .filter(s -> s.getValue() >= 18 && s.getValue() <= 24)
                .forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
    }
}
