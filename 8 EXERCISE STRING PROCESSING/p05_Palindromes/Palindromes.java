package p05_Palindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputText = reader.readLine().split("[,.?! ]");

        Set<String> palindromes = new TreeSet<>();
        for (int i = 0; i < inputText.length; i++) {
            if (isPalindrome(inputText[i])) {
                palindromes.add(inputText[i]);
            }
        }

        System.out.println(palindromes);
    }

    private static boolean isPalindrome(String s) {
        String variable = s;
        StringBuffer rev = new StringBuffer(variable).reverse();
        String strRev = rev.toString();

        Boolean isPalindrome = false;
        if (variable.equalsIgnoreCase(strRev) && variable.length() >= 1) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
