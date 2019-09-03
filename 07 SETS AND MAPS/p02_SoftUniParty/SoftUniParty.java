package p02_SoftUniParty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> guests = new TreeSet<>();

        while (true) {
            String input = reader.readLine();
            if ("PARTY".equals(input)) break;

            guests.add(input);
        }

        while (true) {
            String input = reader.readLine();
            if ("END".equals(input)) break;

            guests.remove(input);
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
        //System.out.println(guests.toString().replaceAll("[\\[\\]]", ""));
    }
}
