package p03_Genome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;     // 100/100
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Genome {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("([a-z@#$?!]+)=([0-9]+)--([0-9]+)<<([a-z]+)");

        Map<String, Integer> organisms = new LinkedHashMap<>();

        while (true) {
            String input = reader.readLine();
            if ("Stop!".equals(input)) break;

            Matcher matcher = pattern.matcher(input);
            boolean isFound = false;

            if (matcher.find()) {
                isFound = true;
            }

            if (!(isFound && checkForNameOfGeneLength(matcher.group(1), matcher.group(2)))) {
                continue;
            }

            String organismName = matcher.group(4);
            int organismGenomSize = Integer.parseInt(matcher.group(3));

            if (!organisms.containsKey(organismName)) {
                organisms.put(organismName, 0);
            }

            organisms.put(organismName, organisms.get(organismName) + organismGenomSize);
        }

        organisms.entrySet()
                .stream()
                .sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(s -> {
                    System.out.printf("%s has genome size of %d%n", s.getKey(), s.getValue());
                });


    }

    private static boolean checkForNameOfGeneLength(String group, String group1) {
        int length = Integer.parseInt(group1);
        char[] chars = group.toCharArray();
        int countGeneNameLength = 0;

        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                countGeneNameLength++;
            }
        }
        if (length == countGeneNameLength) {
            return true;
        }

        return false;
    }
}
