package p10_01_CountSymbols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] text = reader.readLine().toCharArray();
        TreeMap<Character, Integer> chars = new TreeMap<>();

        for (char ch : text) {
            if (!chars.containsKey(ch)) {
                chars.put(ch, 0);
            }
            chars.put(ch, chars.get(ch) + 1);
        }

        for (Character character : chars.keySet()) {
            System.out.println(String.format("%s: %d time/s", character, chars.get(character)));
        }
    }
}
