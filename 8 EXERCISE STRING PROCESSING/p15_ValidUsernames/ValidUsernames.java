package p15_ValidUsernames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("(?<=[ \\/\\\\() ]|^)[a-zA-Z][a-zA-Z0-9_]{2,25}(?=[ \\/\\\\()]|$)");

        String input = reader.readLine();
        List<String> names = new ArrayList<>();

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            names.add(matcher.group());
        }

        int maxLenght = -1;
        int firstIndex = 0;

        for (int i = 0; i < names.size() - 1; i++) {
            int currentLenght = names.get(i).length() + names.get(i + 1).length();
            if (currentLenght > maxLenght) {
                maxLenght = currentLenght;
                firstIndex = i;
            }
        }
        System.out.printf("%s\n%s", names.get(firstIndex), names.get(firstIndex + 1));
    }
}