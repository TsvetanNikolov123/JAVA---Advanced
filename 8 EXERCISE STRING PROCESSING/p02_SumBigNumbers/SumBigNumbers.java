package p02_SumBigNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstNum = reader.readLine();
        String secondNum = reader.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = firstNum.length() - 1; i >= 0; i--) {
            sb.append(firstNum.substring(i, i + 1));
        }
        firstNum = sb.toString();
        sb.setLength(0);

        for (int i = secondNum.length() - 1; i >= 0; i--) {
            sb.append(secondNum.substring(i, i + 1));
        }

        secondNum = sb.toString();
        sb.setLength(0);

        String biggerNumLength = firstNum;
        String smallerNumLength = secondNum;

        if (biggerNumLength.length() < smallerNumLength.length()) {
            String temp = biggerNumLength;
            biggerNumLength = smallerNumLength;
            smallerNumLength = temp;
        }

        // TODO
        int temp = 0;
        for (int i = 0; i < smallerNumLength.length(); i++) {
            int num1 = 0;
            int num2 = 0;
            try {
                num1 = Integer.valueOf(biggerNumLength.substring(i, i + 1));
                num2 = Integer.valueOf(smallerNumLength.substring(i, i + 1));
            } catch (Exception e) {

            }


            int sum = num1 + num2 + temp;
            if (sum > 9) {
                sb.append(sum % 10);
                temp = 1;
            } else {
                sb.append(sum);
                temp = 0;
            }
        }
        String debug = "";

        for (int i = smallerNumLength.length(); i < biggerNumLength.length(); i++) {
            int num2 = 0;
            try {
                num2 = Integer.valueOf(biggerNumLength.substring(i, i + 1));

            } catch (Exception e) {

            }

            int sum = num2 + temp;
            if (sum > 9) {
                sb.append(sum % 10);
                temp = 1;
            } else {
                sb.append(sum);
                temp = 0;
            }
        }

        if (temp == 1) {
            sb.append(temp);
        }

        String result = sb.reverse().toString();
        while (result.startsWith("0")) {
            result = result.substring(1, result.length());
        }

        System.out.println(result);
    }
}
