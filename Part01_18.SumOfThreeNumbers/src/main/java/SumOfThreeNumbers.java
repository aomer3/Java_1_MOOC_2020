/*
Write a program that asks the user for three numbers. After this the program prints the sum of the numbers given by the user.

The program should work like this:
Give the first number:
8
Give the second number:
3
Give the third number:
3
The sum of the numbers is 14

 */
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //These tasks ask the user to enter in three numbers and saves the three user inputs.
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf (scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf (scanner.nextLine());

        //This task displays the sum of the three numbers.
        System.out.println("The sum of the numbers is " + (first + second + third));

    }
}
