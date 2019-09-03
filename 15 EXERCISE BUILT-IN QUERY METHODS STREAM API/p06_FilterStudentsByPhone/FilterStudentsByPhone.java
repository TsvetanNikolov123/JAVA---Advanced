package p06_FilterStudentsByPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FilterStudentsByPhone {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> studentsNumbers = new LinkedHashMap<>();

        while (true) {
            String inputLine = reader.readLine();
            if ("END".equals(inputLine)) break;

            if (inputLine == null || inputLine.isEmpty()) continue;
            String[] tokens = inputLine.split("\\s+");

            studentsNumbers.put(tokens[0] + " " + tokens[1], tokens[2]);
        }

        studentsNumbers.entrySet()
                .stream()
                .filter(s -> s.getValue().startsWith("02") || s.getValue().startsWith("+3592"))
                .forEach(s -> System.out.println(s.getKey()));
    }
}
