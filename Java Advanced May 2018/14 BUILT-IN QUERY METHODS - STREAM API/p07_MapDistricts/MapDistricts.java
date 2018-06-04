package p07_MapDistricts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapDistricts {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, List<Integer>> cities = new HashMap<>();

        String[] tokens = reader.readLine().split("\\s+");
        int limit = Integer.parseInt(reader.readLine());

        for (String token : tokens) {
            String[] cityArgs = token.split(":");
            String cityName = cityArgs[0];
            int districtPopulation = Integer.parseInt(cityArgs[1]);

            cities.putIfAbsent(cityName, new ArrayList<>());
            cities.get(cityName).add(districtPopulation);
        }

        cities.entrySet().stream()
                .filter(city -> city.getValue()
                        .stream()
                        .mapToInt(Integer::valueOf)
                        .sum() > limit)
                .sorted((entry1, entry2) -> Integer.compare(
                        entry2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        entry1.getValue().stream().mapToInt(Integer::valueOf).sum()))
                .forEach(entry -> {
                    System.out.printf("%s: ", entry.getKey());
                    entry.getValue().stream()
                            .sorted((n1, n2) -> Integer.compare(n2, n1))
                            .limit(5)
                            .forEach(district -> System.out.print(district + " "));

                    System.out.println();
                });

    }
}
