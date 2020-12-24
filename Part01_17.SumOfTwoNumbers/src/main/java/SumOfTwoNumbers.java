/*
Write a program that asks the user for two numbers. After this, the program prints the sum of the numbers given by
the user.

Here's how the program is expected to work:

Give the first number:
8
Give the second number:
3
The sum of the numbers is 11
 */
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks for the user to input a number and then saves the user input.
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        //This task asks for another user input and then saves the second number.
        System.out.println("Give the second number:");
        int second = Integer.valueOf (scanner.nextLine());

        //This displays the sum of the two numbers entered by the user.
        System.out.println("The sum of the numbers is " + (first + second));

    }
}
