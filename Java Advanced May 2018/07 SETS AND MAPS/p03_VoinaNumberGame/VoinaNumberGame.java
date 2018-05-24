package p03_VoinaNumberGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class VoinaNumberGame {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();

        fillNumbers(reader, firstPlayer, secondPlayer);

        for (int i = 0; i < 50; i++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                System.out.println(firstPlayer.isEmpty() ? "Second player win!" : "First player win!");
                return;
            }

            int firstNum = firstPlayer.iterator().next();
            firstPlayer.remove(firstNum);
            int secondNum = secondPlayer.iterator().next();
            secondPlayer.remove(secondNum);

            if (firstNum > secondNum) {
                firstPlayer.add(firstNum);
                firstPlayer.add(secondNum);
            } else if (secondNum > firstNum) {
                secondPlayer.add(firstNum);
                secondPlayer.add(secondNum);
            }
        }

        printResult(firstPlayer, secondPlayer);
    }

    private static void printResult(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }

    private static void fillNumbers(BufferedReader reader, Set<Integer> firstPlayer, Set<Integer> secondPlayer) throws IOException {
        String[] firstPlayerNumbers = reader.readLine().split(" ");
        String[] secondPlayerNumbers = reader.readLine().split(" ");

        for (String firstPlayerNumber : firstPlayerNumbers) {
            firstPlayer.add(Integer.parseInt(firstPlayerNumber));
        }

        for (String secondPlayerNumber : secondPlayerNumbers) {
            secondPlayer.add(Integer.parseInt(secondPlayerNumber));
        }
    }
}
