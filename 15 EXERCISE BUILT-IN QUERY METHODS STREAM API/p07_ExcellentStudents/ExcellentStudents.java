package p07_ExcellentStudents;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExcellentStudents {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<Integer>> students = new LinkedHashMap<>();

        while (true) {
            String inputLine = reader.readLine();
            if ("END".equals(inputLine)) break;

            if (inputLine == null || inputLine.isEmpty()) continue;

            List<String> tokens = Arrays.stream(inputLine.split("\\s+"))
                    .collect(Collectors.toList());

            String name = tokens.get(0) + " " + tokens.get(1);

            List<Integer> grades = tokens.subList(2, tokens.size())
                    .stream()
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            students.put(name, grades);
        }

        students.entrySet()
                .stream()
                .filter(s -> s.getValue().stream().anyMatch(m -> m == 6))
                .forEach(s -> System.out.println(s.getKey()));
    }
}