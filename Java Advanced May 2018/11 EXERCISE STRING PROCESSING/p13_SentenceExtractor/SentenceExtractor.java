package p13_SentenceExtractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keyWord = reader.readLine();
        String text = reader.readLine();
        String regex = "[A-Z][^!|.|?]+\\b" + Pattern.quote(keyWord) + "\\b[^.|?|!]+[.|!|?]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group(0).trim());
        }
    }
}
