package p12_LittleJohn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LittleJohn {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // (?<small>>-{5}>)|(?<medium>>{2}-{5}>)|(>{3}-{5}>{2})
        Pattern pattern = Pattern.compile("(?<large>>{3}-{5}>{2})|(?<medium>>{2}-{5}>)|(?<small>>-{5}>)");
        int small = 0;
        int medium = 0;
        int large = 0;

        for (int i = 0; i < 4; i++) {
            Matcher matcher = pattern.matcher(reader.readLine());

            while (matcher.find()){
                if (matcher.group("small") != null){
                    small++;
                } else if ( matcher.group("medium") != null){
                    medium++;
                } else {
                    large++;
                }
            }
        }

        String numbersAsString = Integer.toString(small) + Integer.toString(medium) + Integer.toString(large);

        String binary = Integer.toBinaryString(Integer.valueOf(numbersAsString));

        String result = new StringBuilder(binary).reverse().insert(0, binary).toString();

        System.out.println(Integer.valueOf(result, 2));
    }
}
