package p07_ValidUsernames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String regex = "^[\\w-]{3,16}$";
        String line = reader.readLine();
        int counter = 0;

        while (!"END".equals(line)){
            if(Pattern.matches(regex,line))
            {
                counter++;
                sb.append("valid");
                sb.append("\n");
            }
            else
            {
                sb.append("invalid");
                sb.append("\n");
            }
            line = reader.readLine();
        }

        if (counter > 0){
            System.out.println(sb);
        }
    }
}
