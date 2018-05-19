package p11_GameOfNames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfNames {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfPlayers = Integer.parseInt(reader.readLine());

        String winnerName = "";
        int winnerScore = Integer.MIN_VALUE;


        while (countOfPlayers-- > 0) {
            String playerName = reader.readLine();
            int playerScore = Integer.parseInt(reader.readLine());
            char[] playersNameAsChars = playerName.toCharArray();

            for (char c : playersNameAsChars) {
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

        System.out.println(String.format("The winner is %s - %d points", winnerName, winnerScore));
    }
}
