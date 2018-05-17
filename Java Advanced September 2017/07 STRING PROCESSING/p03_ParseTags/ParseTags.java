package p03_ParseTags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseTags {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String input = reader.readLine();
        String upcase = "<upcase>";
        String upcaseClose = "</upcase>";

        while (input.contains(upcase)) {
            int indexOfStart = input.indexOf(upcase);
            int indexOfEnd = input.indexOf(upcaseClose);

            String reminder = input.substring(indexOfStart + upcase.length(), indexOfEnd);
            input = input.replace(upcase + reminder + upcaseClose, reminder.toUpperCase());
        }
        System.out.println(input);
    }
}
