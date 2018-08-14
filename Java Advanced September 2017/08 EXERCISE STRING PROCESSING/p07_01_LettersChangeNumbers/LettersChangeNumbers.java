package p07_01_LettersChangeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

// 50/100

public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // lowercase    *  multiply
        // Uppercase    /  divide

        //              + add
        //              - subtract
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] tokens = reader.readLine().split("\\s+");

        BigDecimal result = new BigDecimal(BigInteger.ZERO);

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            char firstLetter = token.charAt(0);
            int firstLetterPosition = 1 + alphabet.indexOf(token.toLowerCase().charAt(0));

            long number = Long.parseLong(token.substring(1, token.length() - 1));

            char lastLetter = token.charAt(token.length() - 1);
            int lastLetterPosition = 1 + alphabet.indexOf(token.toLowerCase().charAt(token.length() - 1));

            BigDecimal tempSum = new BigDecimal(BigInteger.ZERO);

            if (Character.isLowerCase(firstLetter)) {
                BigDecimal current = BigDecimal.valueOf(number).multiply(BigDecimal.valueOf(firstLetterPosition));
                tempSum = tempSum.add(current);
            } else {
                BigDecimal current = BigDecimal.valueOf(number).divide(BigDecimal.valueOf(firstLetterPosition));
                tempSum = tempSum.add(current);
            }


            if (Character.isLowerCase(lastLetter)) {
                BigDecimal current = BigDecimal.valueOf(lastLetterPosition);
                tempSum = tempSum.add(current);
            } else {
                BigDecimal current = BigDecimal.valueOf(lastLetterPosition);
                tempSum = tempSum.subtract(current);
            }

            result = result.add(tempSum);
        }

        // rounding BigDecimal to two decimal places
        System.out.println(result.setScale(2,RoundingMode.CEILING));
    }
}
