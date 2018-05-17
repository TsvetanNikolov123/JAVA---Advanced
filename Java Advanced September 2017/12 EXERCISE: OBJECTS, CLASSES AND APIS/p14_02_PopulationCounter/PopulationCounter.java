package p14_02_PopulationCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class PopulationCounter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, LinkedHashMap<String, Integer>> countryAndCityPopulation = new LinkedHashMap<>();
        Map<String, Long> countryPopulation = new LinkedHashMap<>();

        enterCountriesAndPopulation(reader, countryAndCityPopulation, countryPopulation);
    }

    private static void enterCountriesAndPopulation(BufferedReader reader,
                                                    Map<String, LinkedHashMap<String, Integer>> countryAndCityPopulation,
                                                    Map<String, Long> countryPopulation) throws IOException {
        while (true) {
            String[] line = reader.readLine().split("\\|");

            if ("report".equals(line[0])) {
                break;
            }

            String city = line[0];
            String country = line[1];
            int population = Integer.valueOf(line[2]);

            if (!countryAndCityPopulation.containsKey(country)) {
                LinkedHashMap<String, Integer> cityPopulation = new LinkedHashMap<>();

                countryAndCityPopulation.put(country, cityPopulation);
                countryPopulation.put(country, 0L);
            }

            LinkedHashMap<String, Integer> citiesPopulation = countryAndCityPopulation.get(country);
            citiesPopulation.put(city, population);
            countryAndCityPopulation.put(country, citiesPopulation);
            long totalCountryPopulation = countryPopulation.get(country) + population;
            countryPopulation.put(country, totalCountryPopulation);
        }
    }
}