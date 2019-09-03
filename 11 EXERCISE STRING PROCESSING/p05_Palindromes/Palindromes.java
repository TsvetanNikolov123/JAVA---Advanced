package p05_Palindromes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = reader.readLine().split("[,.?! ]");
        Set<String> palindromes = new TreeSet<>();

        for (String string : text) {
            if (istPalindrome(string)){
                palindromes.add(string);
            }
        }

        System.out.println(palindromes);
    }

    private static boolean istPalindrome(String word){
        StringBuffer rev = new StringBuffer(word).reverse();

        if (word.equalsIgnoreCase(rev.toString()) && word.length() >= 1){
            return true;
        }
        return false;
    }
}
