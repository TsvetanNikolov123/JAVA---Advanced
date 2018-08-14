package p16_2_ExtractHyperlinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExtractHyperlinks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder html = new StringBuilder();

        String line = "";
        while (!"END".equals(line = reader.readLine())) {
            html.append(line);
        }

        List<String> aTags = new ArrayList<>();
        String text = html.toString();
        while (true) {
            int startIndex = text.indexOf("<a");
            int endIndex = text.indexOf(">", startIndex + 1);
            if (startIndex == -1 || endIndex == -1) {
                break;
            }

            aTags.add(text.substring(startIndex, endIndex));
            text = text.substring(endIndex + 1);
        }

        for (String aTag : aTags) {
            int hrefIndex = aTag.lastIndexOf("href") + 4;

            while (hrefIndex < aTag.length() &&
                    (aTag.charAt(hrefIndex) == ' ' ||
                            aTag.charAt(hrefIndex) == '\t' ||
                            aTag.charAt(hrefIndex) == '\"' ||
                            aTag.charAt(hrefIndex) == '\'' ||
                            aTag.charAt(hrefIndex) == '=')) {
                hrefIndex++;
            }

            char delimiter = aTag.charAt(hrefIndex - 1);

            if (delimiter != ' ' && delimiter != '\'' && delimiter != '\"' && delimiter != '=') {
                System.out.println(aTag.substring(hrefIndex));
                continue;
            }

            if (delimiter == '=') {
                delimiter = ' ';
            }

            int nextDelimiterIndex = aTag.indexOf(delimiter, hrefIndex);
            String output = "";

            if (nextDelimiterIndex == -1) {
                output = aTag.substring(hrefIndex).trim();
            } else {
                output = aTag.substring(hrefIndex, nextDelimiterIndex).trim();
            }

            if ("".equals(output)) {
                continue;
            }

            System.out.println(output);
        }
    }
}