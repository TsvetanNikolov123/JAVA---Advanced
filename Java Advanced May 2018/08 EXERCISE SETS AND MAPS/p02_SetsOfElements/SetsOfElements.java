package p02_SetsOfElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] setsLength = reader.readLine().split(" ");
        int firstSetLength = Integer.parseInt(setsLength[0]);
        int secondSetLength = Integer.parseInt(setsLength[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        while (firstSetLength-- > 0) {
            int num = Integer.parseInt(reader.readLine());
            firstSet.add(num);
        }

        while (secondSetLength-- > 0) {
            int num = Integer.parseInt(reader.readLine());
            secondSet.add(num);
        }

        for (Integer currentNum : firstSet) {
            if (secondSet.contains(currentNum)) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
