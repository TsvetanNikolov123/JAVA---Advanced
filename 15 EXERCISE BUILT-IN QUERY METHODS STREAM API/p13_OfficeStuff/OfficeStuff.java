package p13_OfficeStuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OfficeStuff {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(reader.readLine());
        Map<String, LinkedHashMap<String, Integer>> companies = new TreeMap<>();

        while (numberOfLines-- > 0) {
            String inputLine = reader.readLine();
            String[] tokens = inputLine
                    .substring(1, inputLine.length() - 1)
                    .split(" - ");

            String company = tokens[0];
            Integer amount = Integer.valueOf(tokens[1]);
            String product = tokens[2];

            if (!companies.containsKey(company)) {
                companies.put(company, new LinkedHashMap<>());
            }

            if (!companies.get(company).containsKey(product)) {
                companies.get(company).put(product, 0);
            }

            companies.get(company).put(product, companies.get(company).get(product) + amount);
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : companies.entrySet()) {
            String companyName = entry.getKey();
            LinkedHashMap<String, Integer> map = entry.getValue();
            System.out.printf("%s: ", companyName);

            StringBuilder result = new StringBuilder();
            for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {
                String product = mapEntry.getKey();
                Integer quantity = mapEntry.getValue();
                String asd = product + "-" + quantity + ", ";
                result.append(asd);
            }

            System.out.println(result.substring(0, result.length() - 2));
        }
    }
}

