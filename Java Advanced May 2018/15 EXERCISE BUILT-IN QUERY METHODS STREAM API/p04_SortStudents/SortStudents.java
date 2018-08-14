package p04_SortStudents;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortStudents {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names = new ArrayList<>();

        while (true) {
            String inputLine = reader.readLine();
            if ("END".equalsIgnoreCase(inputLine)) break;

            if (inputLine == null || inputLine.isEmpty()) {
                continue;
            }

            names.add(inputLine);
        }
        //sort the students first by last name in ascending order and
        // then by first name in descending order.
        names.stream()
                .sorted((s1, s2) -> {
                    if (s1.split("\\s+")[1].compareTo(s2.split("\\s+")[1]) == 0) {
                        return s2.split("\\s+")[0].compareTo(s1.split("\\s+")[0]);
                    } else {
                        return s1.split("\\s+")[1].compareTo(s2.split("\\s+")[1]);
                    }
                })
                .forEach(s -> System.out.println(s));
    }
}
