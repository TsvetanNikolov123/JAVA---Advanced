package p05_AppliedArithmetics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class AppliedArithmetics {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BiFunction<String, Integer, Integer> doMagic = (x, y) -> {
            switch (x) {
                case "add":
                    return y + 1;
                case "multiply":
                    return y * 2;
                case "subtract":
                    return y - 1;
                default:
                    return null;
            }
        };

        Consumer<int[]> printThem = x -> {
            StringBuilder sb = new StringBuilder();

            for (int aX : x) {
                sb.append(aX).append(" ");
            }
            System.out.println(sb.toString().trim());
        };

        int[] intArr = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = "";
        while (!"end".equals(command = reader.readLine())) {
            if (!"print".equals(command)) {
                for (int i = 0; i < intArr.length; i++) {
                    intArr[i] = doMagic.apply(command, intArr[i]);
                }
            }else {
                printThem.accept(intArr);
            }
        }
    }
}
