package p08_WeakStudents;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WeakStudents {
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

        students.entrySet().stream()
                .filter(filterStudentsWithAtLeastTwoMarksUnderOrEqualToNumber())
                .forEach(s -> System.out.println(s.getKey()));
    }

    private static Predicate<Map.Entry<String, List<Integer>>> filterStudentsWithAtLeastTwoMarksUnderOrEqualToNumber() {
        return s -> {
            List<Integer> grades = s.getValue();
            int count = 0;
            for (Integer grade : grades) {
                if (grade <= 3) {
                    count++;
                }
            }

            return count >= 2;
        };
    }
}
