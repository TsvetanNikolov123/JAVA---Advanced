package p01_CountSubstringOccurrences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine().toLowerCase();
        String word = reader.readLine().toLowerCase();
        int count = 0;

        int indexOfOccurence = text.indexOf(word, 0);

        while (indexOfOccurence >= 0)
        {
            count++;
            indexOfOccurence = text.indexOf(word, indexOfOccurence + 1);
        }

        System.out.println(count);
    }
}
