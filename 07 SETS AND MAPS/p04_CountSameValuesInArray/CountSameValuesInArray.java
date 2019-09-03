package p04_CountSameValuesInArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CountSameValuesInArray {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = reader.readLine().split("\\s+");
        Map<String, Integer> numbersCount = new HashMap<>();

        for (String string : inputLine) {
            String currentNum = string;
            if (!numbersCount.containsKey(currentNum)) {
                numbersCount.put(currentNum, 0);
            }

            numbersCount.put(currentNum, numbersCount.get(currentNum) + 1);
        }

        for (String currentNumber : numbersCount.keySet()) {
            System.out.println(currentNumber + " - " + numbersCount.get(currentNumber) + " times");
        }
    }
}
