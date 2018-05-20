package p02_SplitByWordCasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SplitByWordCasing {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "[\\\\,;:.!()\"\'/\\[\\] ]+";
        String[] words = reader.readLine().split(regex);

        List<String> lowerCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();

        for (String word : words) {
            if (word.trim().length() == 0){
                continue;
            }

            if (isLowerCase(word)) {
                lowerCase.add(word);
            } else if (isUpperCase(word)) {
                upperCase.add(word);
            } else {
                mixedCase.add(word);
            }
        }

        System.out.print("Lower-case: ");
        printCase(lowerCase);
        System.out.print("Mixed-case: ");
        printCase(mixedCase);
        System.out.print("Upper-case: ");
        printCase(upperCase);

//        System.out.printf("Lower-case: %s,", String.join(", ", lowerCase));
    }

    private static void printCase(List<String> arr) {
        System.out.print(arr
                .toString()
                .replace("[", "")
                .replace("]", ""));
        System.out.println();
    }

    private static boolean isUpperCase(String word) {
        boolean isUpper = true;

        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isLetter(word.charAt(i)) &&
                    Character.isUpperCase(word.charAt(i)))) {
                isUpper = false;
                break;
            }
        }

        return isUpper;
    }

    private static boolean isLowerCase(String word) {
        boolean isLower = true;

        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isLetter(word.charAt(i)) &&
                    Character.isLowerCase(word.charAt(i)))) {
                isLower = false;
                break;
            }
        }

        return isLower;
    }
}
