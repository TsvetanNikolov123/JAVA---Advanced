package p06_AMinerTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AMinerTask {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> resources = new HashMap<>();

        while (true) {
            String input = reader.readLine();
            if ("stop".equals(input)) break;

            String resource = input;
            int quantity = Integer.parseInt(reader.readLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, 0);
            }
            resources.put(resource, resources.get(resource) + quantity);
        }

        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            String resource = entry.getKey();
            int quantity = entry.getValue();

            System.out.println(String.format("%s -> %d", resource, quantity));
        }
    }
}
