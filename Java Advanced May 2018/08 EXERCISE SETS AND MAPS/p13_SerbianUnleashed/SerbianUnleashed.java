package p13_SerbianUnleashed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SerbianUnleashed {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, LinkedHashMap<String, Long>> data = new LinkedHashMap<>();

        while (true) {
            String[] input = reader.readLine().trim().split(" @");
            if ("End".equals(input[0])) break;

            if (input.length != 2) continue;

            String singerName = input[0];
            String[] singer = singerName.split("\\s+");
            if (singer.length > 3 || singer.length < 1) continue;
            if (singerName.equals(" ")) continue;

            String[] tokens = input[1].split("\\s+");
            String venue = "";
            Long ticketPrice = 0L;
            Long ticketCount = 0L;

            if (tokens.length == 3) {
                venue = tokens[0];
                try {
                    ticketPrice = Long.parseLong(tokens[1]);
                    ticketCount = Long.parseLong(tokens[2]);

                } catch (Exception e) {
                    continue;
                }
            } else if (tokens.length == 4) {
                venue = tokens[0] + " " + tokens[1];
                try {
                    ticketPrice = Long.parseLong(tokens[2]);
                    ticketCount = Long.parseLong(tokens[3]);

                } catch (Exception e) {
                    continue;
                }
            } else if (tokens.length == 5) {
                venue = tokens[0] + " " + tokens[1] + " " + tokens[2];
                try {
                    ticketPrice = Long.parseLong(tokens[3]);
                    ticketCount = Long.parseLong(tokens[4]);

                } catch (Exception e) {
                    continue;
                }
            } else {
                continue;
            }

            if (!data.containsKey(venue)) {
                data.put(venue, new LinkedHashMap<>());
            }

            if (!data.get(venue).containsKey(singerName)) {
                data.get(venue).put(singerName, 0L);
            }

            Long currentMoney = ticketCount * ticketPrice;
            Long currentMoneyUpdate = data.get(venue).get(singerName) + currentMoney;

            data.get(venue).put(singerName, currentMoneyUpdate);
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : data.entrySet()) {
            String venue = entry.getKey();

            LinkedHashMap<String, Long> sortedSingerByMoney = data.get(venue)
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

            System.out.println(venue);
            for (Map.Entry<String, Long> singerAndMoney : sortedSingerByMoney.entrySet()) {
                System.out.printf("#  %s -> %d%n", singerAndMoney.getKey(), singerAndMoney.getValue());
            }
        }
    }
}
