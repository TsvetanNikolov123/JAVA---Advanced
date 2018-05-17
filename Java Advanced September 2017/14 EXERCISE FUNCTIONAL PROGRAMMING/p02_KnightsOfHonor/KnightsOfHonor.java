package p02_KnightsOfHonor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = reader.readLine().split("\\s+");
        Consumer<String> printSirs = name -> System.out.println("Sir " + name);

        printList(names, printSirs);
    }

    private static void printList(String[] names, Consumer<String> print) {
        for (String name : names) {
            print.accept(name);
        }
    }
}
