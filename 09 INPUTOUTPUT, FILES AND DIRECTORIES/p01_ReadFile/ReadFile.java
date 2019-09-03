package p01_ReadFile;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\resources\\input.txt";

        try (FileInputStream fis = new FileInputStream(path)) {
            int oneBite = fis.read();
            while (oneBite >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneBite));
                oneBite = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
