package p11_Robotics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Robotics {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] robotsTokens = reader.readLine().split(";");
        int[] processTimes = new int[robotsTokens.length];
        String[] robots = new String[robotsTokens.length];
        int[] robotsCounter = new int[robotsTokens.length];

        for (int i = 0; i < robotsTokens.length; i++) {
            String[] robotsTaken = robotsTokens[i].split("-");
            robots[i] = robotsTaken[0];
            processTimes[i] = Integer.parseInt(robotsTaken[1]);
        }

        String[] time = reader.readLine().split(":");
        long h = Integer.parseInt(time[0]) * 60 * 60;
        long m = Integer.parseInt(time[1]) * 60;
        long s = Integer.parseInt(time[2]);
        long seconds = h + m + s;

        Deque<String> products = new ArrayDeque<>();
        String product = "";
        while (!"End".equals(product = reader.readLine())) {
            products.offer(product);
        }

        while (!products.isEmpty()) {
            seconds++;
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] > 0) {
                    robotsCounter[i]--;
                }
            }

            String currentProduct = products.poll();
            boolean isProductTaken = false;
            for (int i = 0; i < robots.length; i++) {
                if (robotsCounter[i] == 0) {
                    robotsCounter[i] = processTimes[i];
                    isProductTaken = true;
                    System.out.printf("%s - %s [%s]%n",
                            robots[i],
                            currentProduct,
                            convertSecondsToHMmSs(seconds));
                    break;
                }
            }

            if (!isProductTaken) {
                products.offer(currentProduct);
            }
        }
    }

    public static String convertSecondsToHMmSs(long seconds) {
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
