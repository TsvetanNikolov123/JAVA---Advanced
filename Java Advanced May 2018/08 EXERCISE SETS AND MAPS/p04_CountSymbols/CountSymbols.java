package p04_CountSymbols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> occurrencesCount = new TreeMap<>();

        char[] inputLine = reader.readLine().toCharArray();
        for (char c : inputLine) {
            if (!occurrencesCount.containsKey(c)) {
                occurrencesCount.put(c, 0);
            }

            occurrencesCount.put(c, occurrencesCount.get(c) + 1);
        }

        for (Map.Entry<Character, Integer> entry : occurrencesCount.entrySet()) {
            char currentChar = entry.getKey();
            int currentCharCount = entry.getValue();
            System.out.println(String.format("%s: %d time/s", currentChar, currentCharCount));
        }
    }
}
