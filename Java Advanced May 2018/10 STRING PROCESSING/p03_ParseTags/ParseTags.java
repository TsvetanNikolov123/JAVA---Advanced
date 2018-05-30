package p03_ParseTags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseTags {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String upcaseStart = "<upcase>";
        String upcaseEnd = "</upcase>";

        while (input.contains(upcaseStart)) {
            int startIndex = input.indexOf(upcaseStart);
            int endIndex = input.indexOf(upcaseEnd);

            String reminder = input.substring(startIndex + 8, endIndex);
            String upReminder = reminder.toUpperCase();
            input = input.replaceFirst(reminder, upReminder);
            input = input.replaceFirst(upcaseStart, "");
            input = input.replaceFirst(upcaseEnd, "");
        }

        System.out.println(input);
    }
}
