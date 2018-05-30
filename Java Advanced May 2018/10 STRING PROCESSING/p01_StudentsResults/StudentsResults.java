package p01_StudentsResults;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StudentsResults {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" - ");
        double[] grades = Arrays.stream(input[1].split(", "))
                .mapToDouble(Double::parseDouble).toArray();
        double averageGrade = Arrays.stream(grades).average().getAsDouble();

        String categories = String.format("%-10s|%7s|%7s|%7s|%7s|",
                "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");

        String result = String.format("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|",
                input[0], grades[0], grades[1], grades[2], averageGrade);

        System.out.println(categories);
        System.out.println(result);

    }
}
