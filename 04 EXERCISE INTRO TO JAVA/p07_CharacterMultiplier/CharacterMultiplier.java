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
            int firstCharValue = firstStr.charAt(i);
            int secondCharValue = secondStr.charAt(i);

            sum += firstCharValue * secondCharValue;
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
