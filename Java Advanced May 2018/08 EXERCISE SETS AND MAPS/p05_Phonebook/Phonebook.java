package p05_Phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> phoneBook = new HashMap<>();

        while (true) {
            String input = reader.readLine();
            if ("search".equals(input)) break;

            String[] tokens = input.split("-");
            if (tokens.length != 2) break;

            String name = tokens[0];
            String number = tokens[1];
            phoneBook.put(name, number);
        }

        while (true) {
            String input = reader.readLine();
            if ("stop".equals(input)) break;

            if (phoneBook.containsKey(input)) {
                System.out.println(String.format("%s -> %s",
                        input, phoneBook.get(input)));
            } else {
                System.out.println(String.format("Contact %s does not exist.", input));
            }
        }
    }
}
