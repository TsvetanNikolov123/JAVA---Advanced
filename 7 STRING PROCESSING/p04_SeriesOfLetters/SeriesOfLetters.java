package p04_SeriesOfLetters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriesOfLetters {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        char[] inputChars = reader.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputChars.length; i++) {
            if (i == 0){
                sb.append(inputChars[0]);
            }

            if (sb.charAt(sb.length() - 1) != inputChars[i]){
                sb.append(inputChars[i]);
            }
        }
        System.out.println(sb);
    }
}
