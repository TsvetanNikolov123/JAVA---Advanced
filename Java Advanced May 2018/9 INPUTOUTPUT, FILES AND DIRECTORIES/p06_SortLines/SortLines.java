package p06_SortLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {
        String inputPath = "C:\\resources\\input.txt";
        String outputPath = "C:\\resources\\output.txt";

        try{
            List<String> lines = Files.readAllLines(Paths.get(inputPath));
            Collections.sort(lines);
            Files.write(Paths.get(outputPath), lines);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
