package p11_LogsAggregator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, TreeMap<String, Integer>> logs = new TreeMap<>();
        int numberOfInputs = Integer.parseInt(reader.readLine());

        while (numberOfInputs-- > 0) {
            String[] tokens = reader.readLine().split(" ");

            String ip = tokens[0];
            String name = tokens[1];
            Integer duration = Integer.parseInt(tokens[2]);

            if (!logs.containsKey(name)) {
                logs.put(name, new TreeMap<>());
            }

            if (!logs.get(name).containsKey(ip)) {
                logs.get(name).put(ip, 0);
            }

            int durationUpdate = logs.get(name).get(ip) + duration;
            logs.get(name).put(ip, durationUpdate);
        }

        for (Map.Entry<String, TreeMap<String, Integer>> entry : logs.entrySet()) {
            String name = entry.getKey();
            TreeMap<String, Integer> ipAndDuration = entry.getValue();

            int totalDuration = 0;
            for (Integer integer : ipAndDuration.values()) {
                totalDuration+=integer;
            }

            List<String> ipList = new LinkedList<>();

            ipList.addAll(ipAndDuration.keySet());
            System.out.printf("%s: ", name);
            System.out.printf("%d ", totalDuration);
            System.out.println(ipList);
        }
    }
}
