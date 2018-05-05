package p12_ExtractEmails;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String pattern = "(?<=\\s|^)([a-zA-Z0-9])+([-\\._]*\\w)*@\\w+(\\.|-)\\w+((?:\\.)(?:[a-z]+))*(?=\\.|,|\\s|$)";
        Pattern regex = Pattern.compile(pattern);

        while (true) {
            String input = reader.readLine();
            if ("end".equals(input)) {
                break;
            }

            Matcher matcher = regex.matcher(input);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
