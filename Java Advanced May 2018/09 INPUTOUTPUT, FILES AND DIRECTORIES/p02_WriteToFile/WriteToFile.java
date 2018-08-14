package p02_WriteToFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class WriteToFile {
    public static void main(String[] args) {
        String inputPath = "C:\\resources\\input.txt";
        String outputPath = "C:\\resources\\output.txt";

        HashSet<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation, ',', '.', '!', '?');

        try (FileInputStream fis = new FileInputStream(inputPath);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            int oneByte = fis.read();
            while (oneByte >= 0) {
                if (!punctuation.contains((char) oneByte)) {
                    fos.write(oneByte);
                }

                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
