package p07_LettersChangeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+");

        double sum = 0.0d;

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            char firstLetter = token.charAt(0);
            double firstLetterIndex = token.toLowerCase().charAt(0) - 96;
            double num = Long.parseLong(token.substring(1, token.length() - 1));
            char lastLetter = token.charAt(token.length() - 1);
            double lastLetterIndex = token.toLowerCase().charAt(token.length() - 1) - 96;
            double tempSum = 0.0d;

            if (Character.isLowerCase(firstLetter)) {
                tempSum += num * firstLetterIndex;
            } else {
                tempSum += num / firstLetterIndex;
            }

            if (Character.isLowerCase(lastLetter)) {
                tempSum += lastLetterIndex;
            } else {
                tempSum -= lastLetterIndex;
            }
            sum += tempSum;
        }

        System.out.println(String.format("%.2f", sum));
    }
}
