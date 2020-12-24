/*
Write a program that prompts the user for an integer and informs the user whether or not it is positive (greater
than zero).

Give a number:
5
The number is positive.

Give a number:
-2
The number is not positive.
 */
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //This task asks the user to enter a number and saves the user input.
        System.out.println("Give a number:");
        int value = Integer.valueOf(scan.nextLine());

        //This task determines if the number is positive or negative, and displays a message onto the screen.
        if(value > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
