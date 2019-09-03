package p14_DragonArmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DragonArmy {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInputLines = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        while (numberOfInputLines-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String type = tokens[0];
            String name = tokens[1];
            int damage = 45;
            int health = 250;
            int armor = 10;

            if (!"null".equals(tokens[2])) {
                damage = Integer.parseInt(tokens[2]);
            }

            if (!"null".equals(tokens[3])) {
                health = Integer.parseInt(tokens[3]);
            }

            if (!"null".equals(tokens[4])) {
                armor = Integer.parseInt(tokens[4]);
            }

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }

            if (!dragons.get(type).containsKey(name)) {
                dragons.get(type).put(name, new int[3]);
            }

            dragons.get(type).get(name)[0] = damage;
            dragons.get(type).get(name)[1] = health;
            dragons.get(type).get(name)[2] = armor;
        }

        for (Map.Entry<String, TreeMap<String, int[]>> type : dragons.entrySet()) {
            String typeOfDragons = type.getKey();
            TreeMap<String, int[]> dragonsNamesAndStats = type.getValue();
            double[] averageStats = getAverageStats(dragonsNamesAndStats);

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n",
                    typeOfDragons,
                    averageStats[0],
                    averageStats[1],
                    averageStats[2]);

            for (Map.Entry<String, int[]> dragon : dragonsNamesAndStats.entrySet()) {
                String dragonName = dragon.getKey();
                int[] stats = dragon.getValue();

                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",

                        dragonName,
                        stats[0],
                        stats[1],
                        stats[2]);

            }
        }
    }

    private static double[] getAverageStats(TreeMap<String, int[]> map) {
        double[] average = new double[3];

        int entryCounts = map.size();
        double totalDamage = 0d;
        double totalHealth = 0d;
        double totalArmor = 0d;

        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            totalDamage += entry.getValue()[0];
            totalHealth += entry.getValue()[1];
            totalArmor += entry.getValue()[2];
        }

        average[0] = totalDamage / entryCounts;
        average[1] = totalHealth / entryCounts;
        average[2] = totalArmor / entryCounts;

        return average;
    }
}
