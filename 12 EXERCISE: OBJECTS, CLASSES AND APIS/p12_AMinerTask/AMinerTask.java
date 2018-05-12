package p12_AMinerTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AMinerTask {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> resources = new LinkedHashMap<>();

        int counter = 1;
        String tempResource = "";
        while (true) {
            String input = reader.readLine();
            if ("stop".equals(input)) {
                break;
            }

            if (counter % 2 != 0) {
                if (!resources.containsKey(input)) {
                    resources.put(input, 0);
                }
                tempResource = input;
            } else {
                int quantity = Integer.valueOf(input);
                resources.put(tempResource, resources.get(tempResource) + quantity);
            }
            counter++;
        }

        for (String string : resources.keySet()) {
            System.out.println(String.format("%s -> %s", string, resources.get(string)));
        }

    }
}
