package p05_AcademyGraduation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStudents = Integer.parseInt(reader.readLine());
        Map<String, double[]> students = new TreeMap<>();

        while (numberOfStudents-- > 0) {
            String currentStudentName = reader.readLine();
            double[] currentStudentsGrades = Arrays
                    .stream(reader.readLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            students.put(currentStudentName, currentStudentsGrades);
        }

        for (Map.Entry<String, double[]> student : students.entrySet()) {
            double avg = 0d;

            for (double v : student.getValue()) {
                avg += v;
            }
            avg /= student.getValue().length;
            System.out.println(String.format("%s is graduated with %s",
                    student.getKey(),
                    avg));
        }
    }
}
