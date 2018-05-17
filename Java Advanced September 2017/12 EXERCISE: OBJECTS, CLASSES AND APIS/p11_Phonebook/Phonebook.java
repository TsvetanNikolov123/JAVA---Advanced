package p11_Phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> phonebook = new HashMap<>();

        while (true) {
            String input = reader.readLine();

            if ("search".equals(input)) {
                break;
            }
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];

            phonebook.put(name, number);
        }

        while (true) {
            String input = reader.readLine();
            if ("Stop".equals(input)) {
                break;
            }

            if (phonebook.containsKey(input)) {
                String name = input;
                String number = phonebook.get(input);

                System.out.println(String.format("%s -> %s", name, number));
            } else {
                System.out.println(String.format("Contact %s does not exist.", input));
            }
        }
    }
}
