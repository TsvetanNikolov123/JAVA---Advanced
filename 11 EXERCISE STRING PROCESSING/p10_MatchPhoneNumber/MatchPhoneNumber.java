package p10_MatchPhoneNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";
        String text = reader.readLine();

        while (!"end".equalsIgnoreCase(text)) {
            if (Pattern.matches(regex, text)) {
                System.out.println(text);
            }

            text = reader.readLine();
        }
    }
}
