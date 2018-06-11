package p04_Ranking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ranking {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> contestAndPassword = new LinkedHashMap<>();
        takeContestsAndPasswordsFomConsole(reader, contestAndPassword);

        Map<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();
        takeContestPasswordUsernamePointsFromConsole(reader, contestAndPassword, map);

        String bestCandidateAndPoints = searchBestCandidate(map);
        String bestCandidate = bestCandidateAndPoints.split(" ")[0];
        Integer bestPoint = Integer.parseInt(bestCandidateAndPoints.split(" ")[1]);

        System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate, bestPoint);
        System.out.println("Ranking: ");

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey());

            LinkedHashMap<String, Integer> contestAndPoints = entry.getValue();
            contestAndPoints.entrySet()
                    .stream()
                    .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                    .forEach(s -> {
                        System.out.printf("#  %s -> %d%n", s.getKey(), s.getValue());
                    });

        }
    }

    private static String searchBestCandidate(Map<String, LinkedHashMap<String, Integer>> map) {
        String winnerName = "";
        int winnerPoints = Integer.MIN_VALUE;

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            String name = entry.getKey();
            LinkedHashMap<String, Integer> contestAndPoints = entry.getValue();
            Integer sumOfAllPoints = 0;

            for (Map.Entry<String, Integer> contestPoints : contestAndPoints.entrySet()) {
                Integer points = contestPoints.getValue();
                sumOfAllPoints += points;
            }

            if (winnerPoints < sumOfAllPoints) {
                winnerName = name;
                winnerPoints = sumOfAllPoints;
            }
        }


        return winnerName + " " + winnerPoints;
    }

    private static void takeContestPasswordUsernamePointsFromConsole(BufferedReader reader, Map<String, String> contestAndPassword, Map<String, LinkedHashMap<String, Integer>> map) throws IOException {
        while (true) {
            String input = reader.readLine();
            if ("end of submissions".equalsIgnoreCase(input)) {
                break;
            }

            String[] tokens = input.split("=>");

            String contest = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if (contestAndPassword.containsKey(contest) &&
                    contestAndPassword.get(contest).equals(password)) {

                if (!map.containsKey(username)) {
                    map.put(username, new LinkedHashMap<>());
                }

                if (!map.get(username).containsKey(contest)) {
                    map.get(username).put(contest, 0);
                }

                if (map.get(username).get(contest) < points) {
                    map.get(username).put(contest, points);
                }
            }
        }
    }

    private static void takeContestsAndPasswordsFomConsole(BufferedReader reader, Map<String, String> contestAndPassword) throws IOException {
        while (true) {
            String input = reader.readLine();
            if ("end of contests".equals(input)) {
                break;
            }

            String[] tokens = input.split(":");
            String contest = tokens[0];
            String password = tokens[1];
            contestAndPassword.putIfAbsent(contest, password);
        }
    }
}
