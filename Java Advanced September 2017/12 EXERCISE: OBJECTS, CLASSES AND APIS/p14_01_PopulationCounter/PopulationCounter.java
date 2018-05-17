package p14_01_PopulationCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PopulationCounter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, LinkedHashMap<String, Long>> countries = new LinkedHashMap<>();

        while (true) {
            String input = reader.readLine();
            if ("report".equals(input)) {
                break;
            }

            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            Long population = Long.valueOf(tokens[2]);

            if (!countries.containsKey(country)) {
                countries.put(country, new LinkedHashMap<>());
            }
            countries.get(country).put(city, population);
        }

        Map<String, Long> countriesPopulation = new LinkedHashMap<>();

        for (String country : countries.keySet()) {
            // Cities ordered by their total population in descending order
            Map<String, Long> sortedTowns =
                    countries.get(country).entrySet().stream()
                            .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

            Long sum = 0L;
            for (String s : sortedTowns.keySet()) {
                sum += sortedTowns.get(s);
            }
            countriesPopulation.put(country, sum);
        }

        // Countries ordered by their total population in descending order
        countriesPopulation.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(b -> {
                    System.out.println(b.getKey() + " (total population: " + b.getValue() + ")");
                    countries.get(b.getKey()).entrySet().stream()
                            .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                            .forEach(a -> System.out.println("=>" + a.getKey() + ": " + a.getValue()));
                });
    }
}
