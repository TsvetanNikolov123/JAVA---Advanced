package p04_SeriesOfLetters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriesOfLetters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        sb.append(input[0]);

        for (char c : input) {
            if (sb.charAt(sb.length()-1) != c){
                sb.append(c);
            }
        }

        System.out.print(sb);
    }
}
