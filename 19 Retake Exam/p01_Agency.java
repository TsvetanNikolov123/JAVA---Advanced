import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p01_Agency {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] idNumbers = reader.readLine().split("\\s+");
        String[] agents = reader.readLine().split("\\s+");

        Deque<String> idNumbersDeque = new ArrayDeque<>();
        Deque<String> agentsDeque = new ArrayDeque<>();

        for (String s : idNumbers) {
            idNumbersDeque.addLast(s);
        }

        for (String idNumber : agents) {
            agentsDeque.addLast(idNumber);
        }

        try {
            while (true) {
                String commands = reader.readLine();
                if ("stop".equals(commands)) break;

                String[] tokens = commands.split("\\s+");

                switch (tokens[0]) {
                    case "add-ID":
                        idNumbersDeque.addLast(tokens[1]);
                        break;

                    case "add-agent":
                        agentsDeque.addLast(tokens[1]);
                        break;

                    case "remove-ID":
                        System.out.println(String.format("%s has been removed.", idNumbersDeque.pollLast()));
                        break;

                    case "remove-agent":
                        System.out.println(String.format("%s has left the queue.", agentsDeque.pollLast()));
                        break;
                    case "sort-ID":
                        List<String> sortedList = new ArrayList<>(idNumbersDeque);
                        Collections.sort(sortedList);
                        idNumbersDeque= new ArrayDeque<>();

                        for (String s : sortedList) {
                            idNumbersDeque.addLast(s);
                        }
                        String debug = "";
                        break;
                }
            }

            Deque<String> dequeResult = new ArrayDeque<>();
            while (true) {
                if (agentsDeque.isEmpty() && idNumbersDeque.isEmpty()) {
                    break;
                }
                if (agentsDeque.isEmpty()) {
                    System.out.println("No more agents left.");
                    while (!idNumbersDeque.isEmpty()) {
                        System.out.println(String.format("ID number: %s", idNumbersDeque.pollFirst()));
                    }
                    break;
                }

                if (idNumbersDeque.isEmpty()) {
                    while (!agentsDeque.isEmpty()) {
                        System.out.println(String.format("%s does not have an ID.", agentsDeque.pollFirst()));
                    }
                    break;
                }

                System.out.println(String.format("%s takes ID number: %s", agentsDeque.pollFirst(), idNumbersDeque.pollLast()));
            }
        } catch (Exception e){
            ;
        }

    }
}