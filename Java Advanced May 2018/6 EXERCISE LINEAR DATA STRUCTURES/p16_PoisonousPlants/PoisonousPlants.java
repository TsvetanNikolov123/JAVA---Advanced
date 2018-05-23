package p16_PoisonousPlants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class PoisonousPlants {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPlants = Integer.parseInt(reader.readLine());
        String[] plantsStringLine = reader.readLine().split("\\s+");
        int[] plants = new int[plantsStringLine.length];

        for (int i = 0; i < plantsStringLine.length; i++) {
            plants[i] = Integer.valueOf(plantsStringLine[i]);
        }

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        int[] days = new int[numberOfPlants];

        for (int i = 1; i < numberOfPlants; i++) {
            int maxDays = 0;

            while (stack.size() > 0 && plants[stack.peek()] >= plants[i]) {
                maxDays = Math.max(maxDays, days[stack.pop()]);
            }

            if (stack.size() > 0) {
                days[i] = maxDays + 1;
            }

            stack.push(i);
        }

        int max = getMaxNum(days);

        System.out.println(max);
    }

    private static int getMaxNum(int[] days) {
        int max = Integer.MIN_VALUE;
        for (int day : days) {
            if(day > max){
                max = day;
            }
        }
        return max;
    }
}
