package p12_ExtractEmails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder inputText = new StringBuilder();
        String line = "";

        while (!"end".equals(line = reader.readLine())) {
            inputText.append(line);
        }

        Pattern pat = Pattern.compile("(?<email>(?<=\\s|^)[a-zA-Z]+[._-]?[a-zA-Z0-9]+@(?:[a-zA-Z]+[-]?[a-zA-Z]+(?:\\.[a-zA-Z]+)+)(?=[.,?! ]|$))");
        Matcher matcher = pat.matcher(inputText.toString());

        while (matcher.find()) {
            System.out.println(matcher.group("email"));
        }
    }
}
