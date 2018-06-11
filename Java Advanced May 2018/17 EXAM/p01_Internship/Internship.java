package p01_Internship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;                // 100/100
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Internship {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int problemsCount = Integer.parseInt(reader.readLine());
        int candidatesCount = Integer.parseInt(reader.readLine());

        Deque<String> problemsQueue = new ArrayDeque<>();
        Deque<String> candidatesQueue = new ArrayDeque<>();

        fillProblems(reader, problemsCount, problemsQueue);

        fillCandidates(reader, candidatesCount, candidatesQueue);

        String debug = "";

        while (true) {
            if (candidatesQueue.size() == 1) {
                System.out.printf("%s gets the job!", candidatesQueue.getFirst());
                return;
            }

            if (problemsQueue.isEmpty()) {
                System.out.println(String.join(", ", candidatesQueue));
                return;
            }

            compareNameAndTask(problemsQueue, candidatesQueue);
        }

    }

    private static void compareNameAndTask(Deque<String> problemsQueue, Deque<String> candidatesQueue) {
        String currentTask = problemsQueue.poll();
        char[] currentTaskAsChars = currentTask.toCharArray();
        int currentTaskSum = 0;

        for (char c : currentTaskAsChars) {
            currentTaskSum += c;
        }

        String currentCandidateName = candidatesQueue.poll();
        char[] currentCandidateNameAsString = currentCandidateName.toCharArray();
        int currentNameSum = 0;
        for (char c : currentCandidateNameAsString) {
            currentNameSum += c;
        }

        if (isSolvedTask(currentTaskSum, currentNameSum)) {
            candidatesQueue.addLast(currentCandidateName);
            System.out.printf("%s solved %s.%n", currentCandidateName, currentTask);
        } else {
            System.out.printf("%s failed %s.%n", currentCandidateName, currentTask);
            problemsQueue.add(currentTask);
        }
    }

    private static boolean isSolvedTask(int currentTaskSum, int currentNameSum) {
        return currentNameSum > currentTaskSum;
    }

    private static void fillCandidates(BufferedReader reader, int candidatesCount, Deque<String> candidatesQueue) throws IOException {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");

        while (candidatesCount-- > 0) {
            String inputLine = reader.readLine();
            Matcher matcher = pattern.matcher(inputLine);

            if (matcher.find()) {
                candidatesQueue.add(inputLine);
            }
        }
    }

    private static void fillProblems(BufferedReader reader, int problemsCount, Deque<String> problemsQueue) throws IOException {
        while (problemsCount-- > 0) {
            String inputLine = reader.readLine();
            problemsQueue.addFirst(inputLine);
        }
    }
}
