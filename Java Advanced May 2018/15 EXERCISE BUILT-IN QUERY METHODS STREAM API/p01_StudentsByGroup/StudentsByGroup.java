package p01_StudentsByGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class StudentsByGroup {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> students = new LinkedHashMap<>();

        while (true) {
            String inputLine = reader.readLine();
            if ("END".equals(inputLine)) break;

            List<String> tokens = Arrays.stream(inputLine.split("\\s+"))
                    .filter(s -> (s != null && !s.isEmpty()))
                    .collect(Collectors.toList());

            if (tokens.isEmpty()) {
                return;
            }

            String name = tokens.get(0).concat(" ").concat(tokens.get(1));
            Integer groupNumber = Integer.valueOf(tokens.get(2));

            students.put(name, groupNumber);
        }

        students.entrySet().stream()
                .filter(s -> s.getValue() == 2)
                .sorted((s1, s2) -> s1.getKey().substring(0, s1.getKey().indexOf(" "))
                        .compareTo(s2.getKey().substring(0, s2.getKey().indexOf(" "))))
                .forEach(s -> System.out.println(s.getKey()));

        System.out.println();
    }
}


