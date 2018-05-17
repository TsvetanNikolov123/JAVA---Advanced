package p08_01_MultiplyBigNumber;

import java.io.BufferedReader;      // 80/100
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] firstNumAsChars = reader.readLine().toCharArray();
        int secondNum = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        int temp = 0;

        for (int i = firstNumAsChars.length - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(firstNumAsChars[i]));
            int sum = digit * secondNum + temp;
            sb.append(sum % 10);
            temp = sum / 10;
        }

        if (temp != 0) {
            sb.append(temp);
        }

        sb.reverse();


        if (sb.charAt(0) == '0') {
            System.out.println("0");
            return;
        }

        System.out.println(sb);
    }
}
