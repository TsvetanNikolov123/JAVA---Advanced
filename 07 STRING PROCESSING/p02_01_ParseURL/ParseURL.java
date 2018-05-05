package p02_01_ParseURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 80/100

public class ParseURL {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String URL = reader.readLine();
        String[] tokens = URL.split("://");
        if (tokens.length != 2) {
            System.out.println("Invalid URL");
            return;
        }

        String[] serverResources = tokens[1].split("/");
        if (serverResources.length < 2) {
            return;
        }

        String protocol = tokens[0];
        System.out.println(String.format("Protocol = %s", protocol));

        String server = serverResources[0];
        System.out.println(String.format("Server = %s", server));

        StringBuilder resources = new StringBuilder();
        for (int i = 1; i < serverResources.length; i++) {
            resources.append("/").append(serverResources[i]);
        }
        System.out.println(String.format("Resources = %s", resources.substring(1)));
    }
}
