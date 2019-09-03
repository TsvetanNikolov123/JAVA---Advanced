package p09_UserLogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UserLogs {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        while (true) {
            String input = reader.readLine();
            if ("end".equals(input)) break;

            String[] tokens = input.split(" ");
            String[] tempIp = tokens[0].split("=");
            String[] tempName = tokens[2].split("=");
            String ip = tempIp[1];
            String name = tempName[1];

            if (!map.containsKey(name)) {
                map.put(name, new LinkedHashMap<>());
            }

//            if (map.get(name).containsKey(ip)) {
//                int countUpdate = map.get(name).get(ip) + 1;
//                map.get(name).put(ip, countUpdate);
//            } else {
//                map.get(name).put(ip, 1);
//            }

            if (!map.get(name).containsKey(ip)) {
                map.get(name).put(ip, 0);
            }

            int countUpdate = map.get(name).get(ip) + 1;
            map.get(name).put(ip, countUpdate);
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            String userName = entry.getKey();
            LinkedHashMap<String, Integer> ipAddressAndCount = entry.getValue();

            System.out.println(String.format("%s: ", userName));

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> item : ipAddressAndCount.entrySet()) {
                String ip = item.getKey();
                Integer messageCount = item.getValue();
                sb.append(ip).append(" => ").append(messageCount).append(", ");
            }
            sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1).append(".");
            System.out.println(sb);
        }
    }
}
