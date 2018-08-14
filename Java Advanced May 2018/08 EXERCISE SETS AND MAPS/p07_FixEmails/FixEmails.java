package p07_FixEmails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FixEmails {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> usersAndMails = new LinkedHashMap<>();

        while (true) {
            String name = reader.readLine();
            if ("stop".equals(name)) break;
            String email = reader.readLine();

            if (email.endsWith(".us") ||
                    email.endsWith(".uk") ||
                    email.endsWith(".com")) {
                continue;
            }

            usersAndMails.put(name, email);
        }

        for (Map.Entry<String, String> stringStringEntry : usersAndMails.entrySet()) {
            String name = stringStringEntry.getKey();
            String email = stringStringEntry.getValue();

            System.out.println(String.format("%s -> %s", name, email));
        }
    }
}
