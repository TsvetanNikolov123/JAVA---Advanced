package p01_02_DHARMASupplies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;             // 60/100 judge
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DharmaSupplies {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countOfInputLines = 0;
        Pattern pattern = Pattern.compile("\\[.*?\\]");
        List<String> findAllCrates = new ArrayList<>();

        while (true) {
            String inputLine = reader.readLine();
            if ("Collect".equalsIgnoreCase(inputLine)) break;
            countOfInputLines++;
            Matcher matcher = pattern.matcher(inputLine);

            while (matcher.find()) {
                findAllCrates.add(matcher.group());
            }
        }

        int lengthOfValidSupplyTags = findAllCrates.size() / countOfInputLines;

        long numberOfSupplyCrates = 0L;
        long amountOfFood = 0L;
        long amountOfDrinks = 0L;

        Pattern validCrates = Pattern.compile("\\[(#[0-9|a-z]*)[a-zA-Z 0-9]+(\\1)]");
        for (String crate : findAllCrates) {
            Matcher matcher = validCrates.matcher(crate);
            String crates = "";
            String supplyTag = "";

            if (matcher.find()) {
                crates = matcher.group(0);
                supplyTag = matcher.group(1);

            }
            String debug = "";
            if (!cratesIsValid(supplyTag, lengthOfValidSupplyTags)) {
                continue;
            }

            if (cratesIsWithFoodTag(supplyTag)) {
                numberOfSupplyCrates++;
                long food = calculateFood(crates, supplyTag);
                amountOfFood += food;

            } else if (cratesIsWithDrinkTag(supplyTag)) {
                numberOfSupplyCrates++;

                long drink = calculateDrink(crates, supplyTag);
                amountOfDrinks += drink;
            }

        }

        if (numberOfSupplyCrates == 0) {
            System.out.println("No supplies found!");
        } else {
            System.out.println("Number of supply crates: " + numberOfSupplyCrates);
            System.out.println("Amount of food collected: " + amountOfFood);
            System.out.println("Amount of drinks collected: " + amountOfDrinks);
        }
    }

    private static long calculateFood(String crates, String supplyTag) {
        int startIndex = crates.indexOf(supplyTag) + supplyTag.length();
        int endIndex = crates.indexOf(supplyTag, startIndex);
        String body = crates.substring(startIndex, endIndex);
        HashSet<Character> uniqueBodyChars = new HashSet<>();

        for (char c : body.toCharArray()) {
            uniqueBodyChars.add(c);
        }

        long sumOfChars = 0L;
        for (Character character : uniqueBodyChars) {
            sumOfChars += character;
        }

        return sumOfChars * (supplyTag.length() - 1);
    }

    private static long calculateDrink(String crates, String supplyTag) {

        int startIndex = crates.indexOf(supplyTag) + supplyTag.length();
        int endIndex = crates.indexOf(supplyTag, startIndex);
        String body = crates.substring(startIndex, endIndex);
        HashSet<Character> uniqueBodyChars = new HashSet<>();

        for (char c : body.toCharArray()) {
            uniqueBodyChars.add(c);
        }

        long sumOfChars = 0L;
        for (Character character : uniqueBodyChars) {
            sumOfChars += character;
        }

        long sumOfSupplyTag = 0L;
        for (char c : supplyTag.substring(1).toCharArray()) {
            sumOfSupplyTag += c;
        }

        return sumOfChars * sumOfSupplyTag;
    }

    private static boolean cratesIsWithFoodTag(String supplyTag) {
        char[] supplyTagChars = supplyTag.toCharArray();

        for (int i = 1; i < supplyTagChars.length; i++) {
            if (!Character.isDigit(supplyTagChars[i])) {
                return false;
            }
        }

        return true;
    }

    private static boolean cratesIsWithDrinkTag(String supplyTag) {

        char[] supplyTagChars = supplyTag.toCharArray();

        for (int i = 1; i < supplyTagChars.length; i++) {
            if (!Character.isLetter(supplyTagChars[i])) {
                return false;
            }
        }

        return true;
    }

    private static boolean cratesIsValid(String supplyTag, int lengthOfValidSupplyTags) {
        if (supplyTag.length() != lengthOfValidSupplyTags + 1) {
            return false;
        }

        if (!supplyTag.startsWith("#")) {
            return false;
        }

        return true;
    }
}
