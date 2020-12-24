/*
Write a program that reads an integer from the user. If the number is less than 0, the program prints the given
integer multiplied by -1. In all other cases, the program prints the number itself.

Output(if user enters -3):
3
 */
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user to enter a nunmber.
        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextLine());

        //This task calculates the absolute value of the number.
        if (value < 0 ){
            value = value * -1;
        }

        //This task displays the absolute value of the number.
        System.out.println(value);
    }
}