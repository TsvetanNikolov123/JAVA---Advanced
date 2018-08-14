package p03_PeriodicTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> chemicalCompounds = new TreeSet<>();
        int countOfInputLines = Integer.parseInt(reader.readLine());

        while (countOfInputLines-- > 0) {
            String[] currentLine = reader.readLine().split("\\s+");
            Collections.addAll(chemicalCompounds, currentLine);
        }

        for (String chemicalCompound : chemicalCompounds) {
            System.out.print(chemicalCompound + " ");
        }
    }
}
