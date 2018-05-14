package p14_00_PopulationCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PopulationCounter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> citiesInCountry = new LinkedHashMap<>();
        Map<String, Long> citiesPopulation = new LinkedHashMap<>();


        while (true) {
            String input = reader.readLine();
            if ("report".equals(input)) {
                break;
            }

            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            Long population = Long.valueOf(tokens[2]);

            if (!citiesInCountry.containsKey(country)) {
                citiesInCountry.put(country, new ArrayList<>());
            }
            citiesInCountry.get(country).add(city);

            if (!citiesPopulation.containsKey(city)) {
                citiesPopulation.put(city, 0L);
            }
            citiesPopulation.put(city, population);
        }


        // TODO Sorting Outputs before to be printed


        for (Map.Entry<String, List<String>> entry : citiesInCountry.entrySet()) {
            String country = entry.getKey();
            List<String> cities = entry.getValue();
            Long countryPopulation = countCountryPopulation(cities, citiesPopulation);

            System.out.println(String.format("%s (total population: %d)", country, countryPopulation));

            for (String city : cities) {
                String cityName = city;
                Long cityPopulation = citiesPopulation.get(cityName);
                System.out.println(String.format("=>%s: %d", cityName, cityPopulation));
            }
        }
    }

    private static Long countCountryPopulation(List<String> cities, Map<String, Long> citiesPopulation) {
        Long populationCount = 0L;
        for (String city : cities) {
            populationCount += citiesPopulation.get(city);
        }
        return populationCount;
    }
}