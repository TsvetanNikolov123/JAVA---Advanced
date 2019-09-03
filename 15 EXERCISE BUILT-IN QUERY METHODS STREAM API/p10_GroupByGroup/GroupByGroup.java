package p10_GroupByGroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByGroup {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new LinkedList<Person>();

        while (true) {
            String inputLine = reader.readLine();
            if ("END".equals(inputLine)) break;

            List<String> arguments = Arrays.stream(inputLine.split("\\s+"))
                    .collect(Collectors.toList());

            Person person = new Person(arguments.get(0) + " " + arguments.get(1),
                    Integer.parseInt(arguments.get(2)));


            persons.add(person);
        }

        persons.stream()
                .collect(Collectors.groupingBy(Person::getGroup))
                .forEach((key, value) -> {
                    List<String> names = value.stream()
                            .map(Person::getName)
                            .collect(Collectors.toList());
                    System.out.printf("%d - %s%n", key, String.join(", ", names));
                });
    }

    private static class Person {
        private String name;
        private int group;

        Person(String name, int group) {
            this.name = name;
            this.group = group;
        }

        public String getName() {
            return this.name;
        }

        public int getGroup() {
            return this.group;
        }
    }
}
