package p06_ExtractTags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = reader.readLine();
            if ("end".equalsIgnoreCase(input)){
                break;
            }

            Pattern pattern = Pattern.compile("<.*?>");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                System.out.println(matcher.group(0));
            }
        }
    }
}
