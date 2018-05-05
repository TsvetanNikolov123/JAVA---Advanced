package p11_ReplaceATag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();

        String line = "";
        while (!"END".equals(line = reader.readLine())) {
            input.append(line).append("\r\n");
        }

        Pattern pat = Pattern.compile("<a\\s+(href=[^>]+)>([^<]+)<\\/a>");
        Matcher matcher = pat.matcher(input);

        while (matcher.find()) {
            int startMatch = matcher.start();
            int endMatch = matcher.start() + matcher.group(0).length();
            String replacement = createReplacement(matcher);
            input.replace(startMatch, endMatch, replacement);
            matcher = pat.matcher(input);
        }
        System.out.println(input);
    }

    private static String createReplacement(Matcher matcher) {
        return "[URL " + matcher.group(1) + "]" + matcher.group(2) + "[/URL]";
    }
}
