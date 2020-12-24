/*
Write a program that asks the user for two numbers and prints their sum, difference, product, and quotient. Two
examples of the execution of the program are given below.

Give the first number:
8
Give the second number:
2
8 + 2 = 10
8 - 2 = 6
8 * 2 = 16
8 / 2 = 4.0
 */
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This tasks asks the user to enter two numbers and saves the user input.
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        //This task adds the two numbers entered by the user.
        int calcAdd = first + second;
        //This task subtracts the two numbers entered by the user.
        int calcSubtract = first - second;
        //This task multiplies the two numbers entered by the user.
        int calcMultiply = first * second;
        //This task divides the two numbers entered by the user.
        double calcDivide = (double)first/second;

        //This task displays the addition, subtraction, multiplication and dicivsion of the two numbers.
        System.out.println(first + " + " + second + " = " + calcAdd);
        System.out.println(first + " - " + second + " = " + calcSubtract);
        System.out.println(first + " * " + second + " = " + calcMultiply);
        System.out.println(first + " / " + second + " = " + calcDivide);

    }
}
