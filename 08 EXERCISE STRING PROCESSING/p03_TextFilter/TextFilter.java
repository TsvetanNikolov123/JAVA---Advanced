package p03_TextFilter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] bannedWords = reader.readLine().split(", ");
        String text = reader.readLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String bannedWord = bannedWords[i];
            String bannedWithStars = bannedWordReplaceWithStars(bannedWord);
            if (text.contains(bannedWord)) {
                text = text.replaceAll(bannedWord, bannedWithStars);
            }
        }
        System.out.println(text);
    }

    private static String bannedWordReplaceWithStars(String bannedWord) {
        int len = bannedWord.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append('*');
        }
        return sb.toString();
    }
}
