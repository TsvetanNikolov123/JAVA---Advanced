package p04_UnicodeCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append("\\u")
                    .append(Integer.toHexString(input.charAt(i) | 0x10000).substring(1));
        }

        System.out.println(sb.toString());
    }
}
