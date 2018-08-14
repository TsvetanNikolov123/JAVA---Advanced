package p11_GameOfNames;

import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playersCount = Integer.parseInt(scanner.nextLine());

        String winnerName = "";
        Integer winnerScore = Integer.MIN_VALUE;

        while (playersCount-- > 0) {
            String playerName = scanner.nextLine();
            char[] playerNameAsChars = playerName.toCharArray();
            Integer playerScore = Integer.parseInt(scanner.nextLine());

            for (char c : playerNameAsChars) {
                if (c % 2 == 0) {
                    playerScore += c;
                } else {
                    playerScore -= c;
                }
            }

            if (playerScore > winnerScore) {
                winnerName = playerName;
                winnerScore = playerScore;
            }
        }

        System.out.printf("The winner is %s - %d points", winnerName, winnerScore);
    }
}
