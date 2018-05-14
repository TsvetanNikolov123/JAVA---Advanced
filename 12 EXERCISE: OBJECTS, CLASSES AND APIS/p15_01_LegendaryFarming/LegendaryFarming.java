package p15_01_LegendaryFarming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> junkMaterials = new LinkedHashMap<>();
        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        String legendaryMaterial = "";
        boolean isOk = true;

        while (isOk) {
            String[] tokens = reader.readLine().split("\\s+");

            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.valueOf(tokens[i]);
                String material = tokens[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int collected = keyMaterials.get(material);
                    keyMaterials.put(material, collected + quantity);
                } else {
                    if (!junkMaterials.containsKey(material)) {
                        junkMaterials.put(material, 0);
                    }
                    int collected = junkMaterials.get(material);
                    junkMaterials.put(material, collected + quantity);
                }

                if (keyMaterials.containsKey(material) && keyMaterials.get(material) >= 250) {
                    keyMaterials.put(material, keyMaterials.get(material) - 250);
                    legendaryMaterial = material;
                    isOk = false;
                    break;
                }
            }
        }

        switch (legendaryMaterial) {
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }

        keyMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(material -> System.out.println(material.getKey() + ": " + material.getValue()));

        junkMaterials
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(material -> System.out.println(material.getKey() + ": " + material.getValue()));
    }
}

