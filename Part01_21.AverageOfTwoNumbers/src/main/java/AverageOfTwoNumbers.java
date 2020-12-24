/*
Write a program that asks the user for two integers and prints their average.
Give the first number:
8
Give the second number:
2
The average is 5.0
 */
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter two numbers and saves the two user inputs.
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        //This task calculates the average of the two numbers entered by the user.
        double average = ((double)first+second)/2;

        //This task displays on the screen the average of the two numbers entered by the user.
        System.out.println("The average is " + average);

    }
}
