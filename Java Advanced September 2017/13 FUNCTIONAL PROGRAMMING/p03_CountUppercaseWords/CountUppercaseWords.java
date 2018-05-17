package p03_CountUppercaseWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().split(" ");

        Predicate<String> checkUpperCase = word -> word.charAt(0) == word.toUpperCase().charAt(0);

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (checkUpperCase.test(words[i])) {
                result.add(words[i]);
            }
        }

        System.out.println(result.size());

        for (String word : result) {
            System.out.println(word);
        }
    }
}
