package p12_LegendaryFarming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junkMaterials = new TreeMap<>();

        String legendaryItem = "";
        while (legendaryItem.length() == 0) {
            String[] tokens = reader.readLine().split(" ");
            for (int i = 0; i < tokens.length; i += 2) {
                String material = tokens[i + 1].toLowerCase();
                int quantity = Integer.parseInt(tokens[i]);

                if ("shards".equals(material) || "fragments".equals(material) || "motes".equals(material)) {
                    int keyMaterialQuantityUpdate = keyMaterials.get(material) + quantity;
                    keyMaterials.put(material, keyMaterialQuantityUpdate);

                    if (keyMaterials.get(material) >= 250) {
                        legendaryItem = finishedLegendary(material);
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        break;
                    }
                } else {
                    if (!junkMaterials.containsKey(material)) {
                        junkMaterials.put(material, 0);
                    }
                    junkMaterials.put(material, junkMaterials.get(material) + quantity);
                }
            }
        }
        System.out.println(legendaryItem + " obtained!");

        keyMaterials.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(a -> System.out.println(a.getKey() + ": " + a.getValue()));

        junkMaterials.entrySet()
                .stream()
                .forEach(a -> System.out.println(a.getKey() + ": " + a.getValue()));

    }

    private static String finishedLegendary(String material) {
        String legendary = "";
        switch (material) {
            case "shards":
                legendary = "Shadowmourne";
                break;
            case "fragments":
                legendary = "Valanyr";
                break;
            case "motes":
                legendary = "Dragonwrath";
                break;
        }

        return legendary;
    }
}
