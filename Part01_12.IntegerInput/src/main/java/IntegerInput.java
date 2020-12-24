/*
Write a program that asks the user for a value. The program should then print the value provided by the user.
Give a number:
3
You gave the number 3
 */
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This task asks the user for an integer and then saves the user input.
        System.out.println("Give a number:");
        int value = Integer.valueOf (scanner.nextLine());

        //This tasks prints out a message onto the screen.
        System.out.println("You gave the number " + value);

    }
}
