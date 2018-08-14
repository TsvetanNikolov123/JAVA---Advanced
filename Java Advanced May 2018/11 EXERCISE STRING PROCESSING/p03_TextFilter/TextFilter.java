package p03_TextFilter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] bannedWords = reader.readLine().split(", ");
        String text = reader.readLine();

        for (String bannedWord : bannedWords) {

            while (text.contains(bannedWord)) {
                int index = text.indexOf(bannedWord);
                text = replaceWordWithStars(text, bannedWord);
            }
        }

        System.out.println(text);
    }

    private static String replaceWordWithStars(String text, String bannedWord) {
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        StringBuilder replacedWord = new StringBuilder();
        for (int i = 0; i < bannedWord.length(); i++) {
            replacedWord.append("*");
        }

        while (sb.indexOf(bannedWord) >= 0) {
            int startIndex = sb.indexOf(bannedWord);
            int endIndex = startIndex + bannedWord.length();
            sb.replace(startIndex, endIndex, replacedWord.toString());
        }
        return sb.toString();
    }
}