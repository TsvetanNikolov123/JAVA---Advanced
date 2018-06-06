package p09_StudentsByEnrollmentYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsByEnrollmentYear {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> facultyNumberAndGrades = new LinkedHashMap<>();

        while (true) {
            String input = reader.readLine();
            if ("END".equals(input)) break;

            if (input == null || input.isEmpty()) continue;

            List<String> tokens = Arrays.stream(input.split("\\s+"))
                    .collect(Collectors.toList());

            String number = tokens.get(0);
            List<String> grades = tokens.subList(1, tokens.size());

            facultyNumberAndGrades.put(number, grades);
        }

        facultyNumberAndGrades.entrySet()
                .stream()
                .filter(s -> (s.getKey().endsWith("14") || s.getKey().endsWith("15")))
                .forEach(s -> System.out.println(Arrays.toString(s.getValue().toArray())
                                .replaceAll("[\\[\\],]", "")));

    }
}
