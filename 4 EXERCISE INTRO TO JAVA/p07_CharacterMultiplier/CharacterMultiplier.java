/*
    Create a program that takes two strings as arguments and returns the sum of their character codes multiplied in
    pairs. (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum, then continue with the next two
    characters). If one of the strings is longer than the other, add the remaining character codes to the total sum
    without multiplication.
 */

package p07_CharacterMultiplier;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.next();
        String secondStr = scanner.next();

        int maxLength = Math.max(firstStr.length(), secondStr.length());
        int minLength = Math.min(firstStr.length(), secondStr.length());

        long sum = 0L;
        for (int i = 0; i < minLength; i++) {
            sum += firstStr.charAt(i) * secondStr.charAt(i);
        }

        String biggerStr = "";

        if (firstStr.length() > secondStr.length()) {
            biggerStr = firstStr;
        } else {
            biggerStr = secondStr;
        }

        for (int i = minLength; i < maxLength; i++) {
            sum += biggerStr.charAt(i);
        }

        System.out.println(sum);
    }
}
