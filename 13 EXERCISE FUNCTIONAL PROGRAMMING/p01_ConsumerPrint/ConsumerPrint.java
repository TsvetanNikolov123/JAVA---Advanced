package p01_ConsumerPrint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = reader.readLine().split("\\s+");

        Consumer<String> print = name -> System.out.println(name);

        printList(names, print);
    }

    private static void printList(String[] names, Consumer<String> print) {
        for (String name : names) {
            print.accept(name);
        }
    }
}
