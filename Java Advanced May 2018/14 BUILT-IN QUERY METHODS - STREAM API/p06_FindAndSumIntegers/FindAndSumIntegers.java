package p06_FindAndSumIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class FindAndSumIntegers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> tokens = Arrays.asList(reader.readLine().split("\\s+"));

        int sum = tokens.stream()
                .filter(x -> isNumber(x))
                .mapToInt(x -> Integer.valueOf(x))
                .sum();

        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("No match");
        }
    }

    private static boolean isNumber(String string) {
        if (string.isEmpty()) {
            return false;
        }

        char[] characters = string.toCharArray();
        for (int i = 0; i < characters.length; i++) {

            if (i == 0) {
                if (characters[i] == '-' || characters[i] == '+') {
                    continue;
                }
            }

            if (!Character.isDigit(characters[i])) {
                return false;
            }
        }

        return true;
    }
}

