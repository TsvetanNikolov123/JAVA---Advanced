package p03_CopyBytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath = "C:\\resources\\input.txt";
        String outputPath = "C:\\resources\\output.txt";

        try (FileInputStream fis = new FileInputStream(inputPath);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            int oneByte = fis.read();
            while (oneByte >= 0) {
                if (oneByte == ' ' || oneByte == '\n') {
                    fos.write(oneByte);
                } else {
                    String digit = String.valueOf(oneByte);
                    for (char c : digit.toCharArray()) {
                        fos.write(c);
                    }
                }

                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
