import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p03_Mission {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        Map<String, Integer> completedMissions = new LinkedHashMap<>();
//        Map<String, Integer> failedMissions = new LinkedHashMap<>();

        String completeName = "";
        int completeScore = 0;

        String failedName = "";
        int failedScore = 0;

        while (true) {
            String message = reader.readLine();
            if ("Decrypt".equals(message)) break;
            char[] messageAsChars = message.toCharArray();

            List<Character> upperChars = new ArrayList<>();
            List<Character> lowerChars = new ArrayList<>();
            List<Integer> digitsChars = new ArrayList<>();

            for (char character : messageAsChars) {
                if (Character.isDigit(character)) {
                    digitsChars.add(Integer.parseInt(String.valueOf(character)));
                }

                if (Character.isUpperCase(character)) {
                    upperChars.add(character);
                }

                if (Character.isLowerCase(character)) {
                    lowerChars.add(character);
                }
            }

            boolean containsMission = isContainMission(upperChars);
            if (!containsMission) continue;

            boolean missionCompleted = isMissionCompleted(upperChars);
            int rating = 0;
            for (Integer digitsChar : digitsChars) {
                rating += digitsChar;
            }

            String missionName = "";
            for (Character lowerChar : lowerChars) {
                missionName += lowerChar;
            }


            if (missionCompleted) {
                if (rating > completeScore) {
                    completeScore = rating;
                    completeName = missionName;
                }
//                completedMissions.putIfAbsent(missionName, rating);
            } else {
                if (rating > failedScore) {
                    failedScore = rating;
                    failedName = missionName;
                }
//                failedMissions.putIfAbsent(missionName, rating);
            }

        }

        System.out.println(String.format("Completed mission %s with rating: %d", completeName, completeScore));

        System.out.println(String.format("Failed Mission %s with rating: %d", failedName, failedScore));

        String debug = "";
    }

    private static boolean isMissionCompleted(List<Character> upperChars) {
        String debug = "";
        for (Character upperChar : upperChars) {
            if (upperChar == 'X') {
                return false;
            }

            if (upperChar == 'C') {
                return true;
            }
        }

        return true;
    }

    private static boolean isContainMission(List<Character> upperChars) {
        int m = 0;
        int i = 0;
        int s = 0;
        int o = 0;
        int n = 0;

        for (Character upperChar : upperChars) {
            if (upperChar.equals('M')) {
                m++;
            }

            if (upperChar.equals('I')) {
                i++;
            }

            if (upperChar.equals('S')) {
                s++;
            }

            if (upperChar.equals('O')) {
                o++;
            }

            if (upperChar.equals('O')) {
                n++;
            }
        }
        String debug = "";
        return (m >= 1 && i >= 2 && s >= 2 && o >= 1 && n >= 1);
    }
}
