/* Read two strings as an input – the first and last name of a person.
 * Print a greeting in the following format:
 * "Hello, " + {firstName} {lastName} + "!" , where if a name is missing,
 * replace it with five stars "*": */

package p05_Greeting;

import java.util.Scanner;

public class Greting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        if (firstName.isEmpty()) {
            firstName = "*****";
        }

        if (lastName.isEmpty()){
            lastName = "*****";
        }

        System.out.printf("Hello, %s %s!", firstName, lastName);
    }
}
