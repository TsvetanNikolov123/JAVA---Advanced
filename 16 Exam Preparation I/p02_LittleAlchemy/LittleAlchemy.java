package p02_LittleAlchemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LittleAlchemy {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> stones = new ArrayDeque<>();
        int[] nums = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int num : nums) {
            stones.addLast(num);
        }

        int gold = 0;

        while (true) {
            String inputLine = reader.readLine();
            String[] commandArgs = inputLine.split("\\s+");

            switch (commandArgs[0]) {
                case "Apply":
                    gold = applyAcid(stones, gold, commandArgs[2]);
                    break;
                case "Air":
                    gold = airLeak(stones, gold, commandArgs[2]);
                    break;
                default:
                    printResult(stones, gold);
                    return;
            }
        }
    }

    private static int airLeak(Deque<Integer> stones, int gold, String commandArg) {
        if (gold <= 0) {
            return gold;
        }
        gold--;
        stones.addLast(Integer.parseInt(commandArg));
        return gold;
    }

    private static int applyAcid(Deque<Integer> stones, int gold, String commandArg) {
        int acid = Integer.parseInt(commandArg);
        while (acid-- > 0 && !stones.isEmpty()) {
            int element = stones.pop();
            if (--element <= 0) {
                gold++;
            } else {
                stones.addLast(element);
            }
        }
        return gold;
    }

    private static void printResult(Deque<Integer> stones, int gold) {
        while (!stones.isEmpty()) {
            System.out.print(stones.pop() + " ");
        }
        System.out.println("\n" + gold);
    }
}
