package p06_ReverseAndExclude;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p06_ReverseAndExclude {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .toArray(Integer[]::new)));

        Integer divisor = Integer.parseInt(reader.readLine());

        numbers.removeIf(x -> x % divisor == 0);
        Collections.reverse(numbers);

        numbers.forEach(x -> System.out.print(x + " "));
    }
}