package p02_EncryptSortAndPrintArray;

import java.lang.reflect.Array;
import java.util.*;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNames = Integer.parseInt(scanner.nextLine());

        List<Long> result = new ArrayList<>();

        while (numberOfNames-- > 0) {
            long sum = 0L;
            char[] name = scanner.nextLine().toCharArray();
            for (char c : name) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    sum += c * name.length;
                } else {
                    sum += c / name.length;
                }
            }
            result.add(sum);
        }

        Collections.sort(result);

        for (Long aLong : result) {
            System.out.println(aLong);
        }
    }
}
