package p01_CountSubstringOccurrences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine().toLowerCase();
        String word = reader.readLine().toLowerCase();
        int countOfAppears = 0;

        int index = text.indexOf(word, 0);

        while (index >= 0){
            countOfAppears++;
            index = text.indexOf(word, index + 1);
        }

        System.out.println(countOfAppears);
    }
}
