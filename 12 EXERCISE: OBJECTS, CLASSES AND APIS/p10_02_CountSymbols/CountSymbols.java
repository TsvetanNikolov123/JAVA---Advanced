package p10_02_CountSymbols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> occurrences = new TreeMap<>();

        String text = reader.readLine();

        for (int i = 0; i < text.length(); i++) {
            Character symbol = text.charAt(i);
            if (!occurrences.containsKey(symbol)) {
                occurrences.put(symbol, 1);
            } else {
                Integer numberOfOccurrences = occurrences.get(symbol);
                occurrences.put(symbol, ++numberOfOccurrences);
            }
        }

        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%s: %d time/s\n", entry.getKey(), entry.getValue());
        }
    }
}

