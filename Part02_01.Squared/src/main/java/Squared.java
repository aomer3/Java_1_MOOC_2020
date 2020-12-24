/*
Write a program that reads an integer from the user and prints the square of the given integer, i.e. the integer
multiplied by itself.

Output(if user enters 4):
16
 */
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter in a number.
        System.out.println("Enter number:");
        int value = Integer.valueOf(scanner.nextLine());

        //This task calculates the square of the given number.
        int squared = value * value;

        //This task displays the square of the given nubmer.
        System.out.println(squared);

    }
}
