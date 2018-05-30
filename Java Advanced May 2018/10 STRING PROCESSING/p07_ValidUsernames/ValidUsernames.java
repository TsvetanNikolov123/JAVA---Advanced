package p07_ValidUsernames;

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
        Pattern pattern = Pattern.compile("^[\\w-]{3,16}$");
        String line = reader.readLine();

        List<String> list = new ArrayList<>();

        while (!"END".equals(line)) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                list.add("valid");
            } else {
                list.add("invalid");
            }
            line = reader.readLine();
        }

        if (list.contains("valid")) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
