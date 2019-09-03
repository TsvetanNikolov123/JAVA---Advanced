package p04_UnicodeCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        StringBuilder result = new StringBuilder();

        for (char ch : input) {
            result.append("\\u");
            String str = Integer.toHexString(ch | 0x10000).substring(1);
            result.append(str);
        }

        System.out.println(result);
    }
}
