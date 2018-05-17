package p06_02_OverlappingIntervals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class OverlappingIntervals {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(reader.readLine());

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            String[] start = reader.readLine().split(",");
            Integer key = Integer.parseInt(start[0]);
            Integer value = Integer.parseInt(start[1]);

            tm.put(key, value);
        }

        for (int i = 0; i < tm.size() - 1; i++) {

            Integer currentKey = (Integer) tm.keySet().toArray()[i];
            Integer currentValue = tm.get(currentKey);
            Integer nextKey = (Integer) tm.keySet().toArray()[i + 1];

            if (currentKey <= nextKey && nextKey <= currentValue) {
                found = true;
                break;
            }
        }
        System.out.print(found);
    }
}

