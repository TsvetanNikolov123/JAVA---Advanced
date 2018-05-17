package p16_01_DragonArmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DragonArmy {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        // TreeMap orders exam score (increasingly) all students (alphabetically). Allow multiple entries per a key;

        LinkedHashMap<String, TreeMap<String, LinkedHashMap<String, Integer>>>
                typeNamesStatsValues = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = reader.readLine().trim().split("\\W+");

            // Default values are as follows: health 250, damage 45 and armor 10
            int damage = 45;
            int health = 250;
            int armor = 10;

            // {type} {name} {damage} {health} {armor}.
            String type = inputData[0];
            String name = inputData[1];

            if (!"null".equals(inputData[2])) {
                damage = Integer.parseInt(inputData[2]);
            }

            if (!"null".equals(inputData[3])) {
                health = Integer.parseInt(inputData[3]);
            }

            if (!"null".equals(inputData[4])) {
                armor = Integer.parseInt(inputData[4]);
            }

            if (!typeNamesStatsValues.containsKey(type)) {
                typeNamesStatsValues.put(type, new TreeMap<>());
            }

            if (!typeNamesStatsValues.get(type).containsKey(name)) {
                typeNamesStatsValues.get(type)
                        .put(name, new LinkedHashMap<>());
            }

            typeNamesStatsValues.get(type)
                    .get(name)
                    .put("damage", damage);
            typeNamesStatsValues.get(type)
                    .get(name)
                    .put("health", health);
            typeNamesStatsValues.get(type)
                    .get(name)
                    .put("armor", armor);
        }

        printResult(typeNamesStatsValues);
    }

    private static void printResult(
            LinkedHashMap<String, TreeMap<String, LinkedHashMap<String, Integer>>> typeNamesStatsValues) {

        for (String type : typeNamesStatsValues.keySet()) {
            // For each type, print average stats of its dragons in format
            // {Type}::({damage}/{health}/{armor})

            System.out.printf("%s::", type);

            double averageDamage = getAverageStates(typeNamesStatsValues, type, "damage");
            double averageHealth = getAverageStates(typeNamesStatsValues, type, "health");
            double averageArmor = getAverageStates(typeNamesStatsValues, type, "armor");

            System.out.printf("(%.2f/%.2f/%.2f)", averageDamage, averageHealth, averageArmor)
                    .println();

            for (String name : typeNamesStatsValues.get(type).keySet()) {
                //-Bazgargal -> damage: 100, health: 2500, armor: 25
                System.out.printf("-%s -> ", name);

                String result = typeNamesStatsValues.get(type)
                        .get(name)
                        .keySet()
                        .stream()
                        .map(state -> String.format("%s: %d", state,
                                typeNamesStatsValues.get(type)
                                        .get(name)
                                        .get(state)))
                        .collect(Collectors.joining(", "));

                System.out.println(result);
            }

        }
    }

    private static double getAverageStates(
            LinkedHashMap<String, TreeMap<String, LinkedHashMap<String, Integer>>>
                    typeNamesStatsValues, String type, String entryState) {

        double averageState = 0d;
        int countNames = typeNamesStatsValues.get(type)
                .size();

        for (String name : typeNamesStatsValues.get(type).keySet()) {

            for (String state : typeNamesStatsValues.get(type).get(name).keySet()) {

                if (state.equals(entryState)) {
                    averageState += typeNamesStatsValues.get(type)
                            .get(name)
                            .get(state);
                }
            }
        }

        return averageState = averageState * 1.0 / countNames;
    }
}
