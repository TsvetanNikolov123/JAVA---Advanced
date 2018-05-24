package p01_UniqueUsernames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> uniqueNames = new LinkedHashSet<>();
        int countOfInputs = Integer.parseInt(reader.readLine());

        while (countOfInputs-- > 0){
            String currentName = reader.readLine();
            uniqueNames.add(currentName);
        }

        for (String uniqueName : uniqueNames) {
            System.out.println(uniqueName);
        }
    }
}
