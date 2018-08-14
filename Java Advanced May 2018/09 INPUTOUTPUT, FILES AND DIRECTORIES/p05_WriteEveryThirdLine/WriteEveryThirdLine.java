package p05_WriteEveryThirdLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "C:\\resources\\input.txt";
        String outputPath = "C:\\resources\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(outputPath)) {

            String line = reader.readLine();
            int counter = 1;
            while (line != null) {
                if (counter % 3 == 0) {
                    writer.println(line);
                }

                line = reader.readLine();
                counter++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
