package p02_02_ParseURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseURL {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String input = reader.readLine();
        String[] reminder = input.split("://");

        if (reminder.length != 2){
            System.out.println("Invalid URL");
            return;
        }

        String protocol = reminder[0];

        int serverEndIndex = reminder[1].indexOf("/");
        String server = reminder[1].substring(0, serverEndIndex);
        String resource = reminder[1].substring(serverEndIndex + 1, reminder[1].length());

        System.out.println(String.format("Protocol = %s", protocol));

        System.out.println(String.format("Server = %s", server));

        System.out.println(String.format("Resources = %s", resource));
    }
}
