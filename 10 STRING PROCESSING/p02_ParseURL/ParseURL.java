package p02_ParseURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ParseURL {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String address = reader.readLine();
        String[] tokens = address.split("://");
        if (tokens.length != 2) {
            System.out.println("Invalid URL");
            return;
        }
        String[] serverAndResources = tokens[1].split("/");
        String protocol = tokens[0];
        String server = serverAndResources[0];
        String resources = String.join("/", Arrays.stream(serverAndResources).skip(1).collect(Collectors.toList()));

        System.out.println("Protocol = " + protocol);
        System.out.println("Server = " + server);
        System.out.println("Resources = " + resources);
    }
}
