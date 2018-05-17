package p06_SimpleTextEditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleTextEditor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOperation = Integer.valueOf(reader.readLine());
        Deque<String> undoCommands = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOperation; i++) {
            String[] input = reader.readLine().split("\\s+");

            switch (input[0]) {
                case "1":
                    String text = input[1];
                    sb.append(text);
                    undoCommands.push(text);
                    undoCommands.push(input[0]);
                    break;
                case "2":
                    int charsToErase = Integer.valueOf(input[1]);
                    undoCommands.push(sb.substring(sb.length() - charsToErase, sb.length()));
                    undoCommands.push(input[0]);
                    sb.delete(sb.length() - charsToErase, sb.length());
                    break;
                case "3":
                    //charAtPosition - 1 -- minus one is because we start to count from 0 in arrays
                    int charAtPosition = Integer.valueOf(input[1]) - 1;
                    System.out.println(sb.charAt(charAtPosition));
                    break;
                case "4":
                    String commandToUndo = undoCommands.pop();
                    String undoText = undoCommands.pop();
                    switch (commandToUndo) {
                        case "1":
                            sb.delete(sb.length() - undoText.length(), sb.length());
                            break;
                        case "2":
                            sb.append(undoText);
                            break;
                    }
                    break;
            }
        }
    }
}
