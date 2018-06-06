package p02_StudentsByFirstAndLastName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudentsByFirstAndLastName {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> fullNames = new LinkedHashSet<>();

        while (true) {
            String inputLine = reader.readLine().trim();
            if ("END".equals(inputLine)) break;

            if (inputLine.isEmpty()) {
                return;
            }

            fullNames.add(inputLine);
        }

        fullNames.stream()
                .filter(s -> (s != null && !s.isEmpty()))
                .filter(s -> s.split("\\s+")[0].compareTo(s.split("\\s+")[1]) < 0)
                .forEach(System.out::println);
    }
}
