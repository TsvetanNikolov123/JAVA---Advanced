package p05_FilterStudentsByEmailDomain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> studentMails = new LinkedList<>();

        while (true) {
            String inputLine = reader.readLine();
            if ("END".equals(inputLine)) break;

            if (inputLine == null || inputLine.isEmpty()) continue;

            studentMails.add(inputLine);
        }

        studentMails.stream()
                .filter(s -> s.endsWith("gmail.com"))
                .forEach(s -> System.out.println(s.split("\\s+")[0] +
                        " " + s.split("\\s+")[1]));
    }
}
