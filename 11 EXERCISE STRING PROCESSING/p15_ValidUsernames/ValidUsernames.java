package p15_ValidUsernames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = Arrays.stream(reader.readLine().split("[\\\\/()\\s+]"))
                .filter(s -> !s.equals(""))
                .toArray(String[]::new);


        List<String> userNames = new ArrayList<>();
        for (String token : tokens) {
            String regex = "^[a-zA-Z][\\w]{2,25}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(token);

            if (matcher.find()) {
                userNames.add(matcher.group());
            }
        }

        int maxLength = 0;
        List<String> longestWords = new ArrayList<>();

        for (int i = 0; i < userNames.size() - 1; i++) {
            int currentLength = userNames.get(i).length() + userNames.get(i + 1).length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestWords.clear();
                longestWords.add(userNames.get(i));
                longestWords.add(userNames.get(i + 1));
            }
        }

        for (String longestWord : longestWords) {
            System.out.println(longestWord);
        }
    }
}
