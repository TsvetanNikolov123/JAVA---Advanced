package p01_ReadInput;


import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString =  scanner.next();
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        String thirdString = scanner.next();

        int sum = firstNum + secondNum + thirdNum;
        String result = firstString + " " + secondString + " " + thirdString + " " + sum;

        System.out.println(result);
    }
}
