/*
Write a program that reads two integers from the user and prints the square root of the sum of these integers. The
program does not need to work with negative values.

Output(if user enters first number=5, second number=3):
3
 */
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter in two numbers.
        System.out.println("Give first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int third = first + second;

        //This task calculates the square root of the sum of the two numbers entered by the user.
        double sumSqrt = Math.sqrt(third);

        //This task displays the sum of the square root of the two numbers.
        System.out.println(sumSqrt);


    }
}