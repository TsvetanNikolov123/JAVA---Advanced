package p01_EncryptSortPrintArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EncryptSortPrintArray {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int namesCount = Integer.parseInt(reader.readLine());
        String[] names = new String[namesCount];

        for (int i = 0; i < namesCount; i++) {
            names[i] = reader.readLine();
        }

        int[] encryptedNames = new int[namesCount];
        for (int j = 0; j < names.length; j++) {

            String name = names[j];
            int currentNameSum = 0;
            for (int i = 0; i < name.length(); i++) {
                char currentLetter = name.charAt(i);

                if (isVowel(currentLetter)) {
                    currentNameSum += currentLetter * name.length();
                } else {
                    currentNameSum += currentLetter / name.length();
                }
            }
            encryptedNames[j] = currentNameSum;

        }

        Arrays.sort(encryptedNames);
        printResult(encryptedNames);
    }

    private static void printResult(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }

    private static boolean isVowel(char letter) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            if (vowel == Character.toLowerCase(letter)) {
                return true;
            }
        }
        return false;
    }
}
