package p01_StudentsResults;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StrudentsResults {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String namesOfRows = String.format("%-10s|%7s|%7s|%7s|%7s|",
                "Name",
                "JAdv",
                "JavaOOP",
                "AdvOOP",
                "Average");

        System.out.println(namesOfRows);

        String[] input = reader.readLine().trim().split(" - ");
        double[] grades = Arrays
                .stream(input[1].trim().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        String studentName = input[0];
        double jAdv = grades[0];
        double javaOOP = grades[1];
        double advOOP = grades[2];
        double averageGrade = (jAdv + javaOOP + advOOP) / 3;

        String studentAndGrades = String.format("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|",
                studentName,
                jAdv,
                javaOOP,
                advOOP,
                averageGrade);

        System.out.println(studentAndGrades);
    }
}
