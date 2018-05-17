package p06_MagicExchangeableWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MagicExchangeableWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        String firstWord = input[0];
        String secondWord = input[1];

        if (firstWord.length() > secondWord.length()) {
            System.out.println(exchangeableWords(secondWord, firstWord));
        } else {
            System.out.println(exchangeableWords(firstWord, secondWord));
        }
    }

    private static boolean exchangeableWords(String firstWord, String secondWord) {

        HashMap<Character, Character> store = new HashMap<>();

        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();

        for (int i = 0; i < firstWord.length(); i++) {
            if (!word1.toString().contains(firstWord.charAt(i) + "")) {
                word1.append(firstWord.charAt(i));
            }

            if (store.containsKey(firstWord.charAt(i))) {
                if (store.get(firstWord.charAt(i)) != secondWord.charAt(i)) {
                    return false;
                }
            } else {
                store.put(firstWord.charAt(i), secondWord.charAt(i));
            }
        }

        for (int i = 0; i < secondWord.length(); i++) {
            if (!word2.toString().contains(secondWord.charAt(i) + "")) {
                word2.append(secondWord.charAt(i));
            }
        }

        return word1.length() == word2.length();
    }
}