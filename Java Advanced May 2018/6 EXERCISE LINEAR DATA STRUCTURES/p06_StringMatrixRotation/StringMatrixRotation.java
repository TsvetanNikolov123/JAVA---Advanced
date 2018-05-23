package p06_StringMatrixRotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMatrixRotation {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] tokens = input.split("[]\\(\\)]");
        int rotations = Integer.parseInt(tokens[1]);

        rotations /= 90;
        rotations %= 4;

        StringBuilder matrixLine = new StringBuilder();
        input = reader.readLine();
        int maxLen = 0;

        while (!"END".equals(input)) {
            if (input.length() > maxLen) {
                maxLen = input.length();
            }
            matrixLine.append(input).append("\n");
            input = reader.readLine();
        }

        String[] matrixL = matrixLine.toString().split("\n");
        StringBuilder output = new StringBuilder();

        switch (rotations) {
            case 0:
                output = matrixLine;
                break;
            case 1:
                output = calculateMatrix(maxLen, matrixL, output);
                break;
            case 2:
                output = matrixLine.reverse();
                break;
            case 3:
                output = calculateMatrix(maxLen, matrixL, output);
                output.reverse();
                break;
        }
        System.out.println(output.toString());
    }

    private static StringBuilder calculateMatrix(int maxLen, String[] matrixL, StringBuilder output) {
        StringBuilder outputBuilder = new StringBuilder(output);
        for (int i = 0; i < maxLen; i++) {
            for (int j = matrixL.length - 1; j >= 0; j--) {
                try {
                    outputBuilder.append(matrixL[j].charAt(i));
                } catch (Exception e) {
                    outputBuilder.append(" ");
                }
            }
            outputBuilder.append("\n");
        }
        output = outputBuilder;
        return output;
    }
}
