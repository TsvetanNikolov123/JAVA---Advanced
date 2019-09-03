package p08_HandsOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class HandsOfCards {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, HashSet<String>> players = new LinkedHashMap<>();

        while (true) {
            String command = reader.readLine();
            if ("JOKER".equals(command)) {
                break;
            }

            String[] tokens = command.split(": ");
            String name = tokens[0].trim();

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }

            String[] cards = tokens[1].trim().split(",");

            for (String card : cards) {
                String currentCard = card.trim();
                players.get(name).add(currentCard);
            }
        }

        for (Map.Entry<String, HashSet<String>> pair : players.entrySet()) {
            String currentPlayer = pair.getKey();
            int points = calculatePoints(pair.getValue());
            System.out.println(String.format("%s: %s", currentPlayer, points));
        }

    }

    private static int calculatePoints(HashSet<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            char multiplier = card.charAt(card.length() - 1);

            int cardsPoints = getPower(power) * getMultiplier(multiplier);
            points += cardsPoints;
        }
        return points;
    }

    private static int getMultiplier(char multiplier) {
        switch (multiplier) {
            case 'S':
                return 4;
            case 'H':
                return 3;
            case 'D':
                return 2;
            case 'C':
                return 1;
            default:
                return 0;
        }
    }

    private static int getPower(String power) {
        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return 0;
        }
    }
}
