package p03_Ascent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> decoded = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile("([_,])([a-zA-Z]+)([0-9])");

        while (true) {
            String inputLine = reader.readLine();
            if ("Ascend".equalsIgnoreCase(inputLine)) break;
            if (inputLine == null || inputLine.isEmpty()) continue;

            for (Map.Entry<String, String> decodedWord : decoded.entrySet()) {
                inputLine = inputLine.replaceAll(decodedWord.getKey(), decodedWord.getValue());
            }

            Matcher matcher = pattern.matcher(inputLine);

            while (matcher.find()) {
                String decodedLine = decode(matcher.group(1),
                        matcher.group(2), Integer.parseInt(matcher.group(3)));

                inputLine = inputLine.replaceAll(matcher.group(0), decodedLine);
                decoded.put(matcher.group(0), decodedLine);
            }

            System.out.println(inputLine);
        }
    }

    private static String decode(String sign, String encodedString, int digit) {
        String decodedString = "";

        for (int i = 0; i < encodedString.length(); i++) {
            char resultChar = '\0';

            if (sign.equalsIgnoreCase(",")) {
                resultChar = (char) (encodedString.charAt(i) + (char) digit);
            } else {
                resultChar = (char) (encodedString.charAt(i) - (char) digit);
            }

            decodedString = decodedString + resultChar;
        }

        return decodedString;
    }
}
